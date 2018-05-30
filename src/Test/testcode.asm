global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 96
	mov rcx, 10
	mov qword [rsp - 8], rcx
	mov rcx, 0
	mov qword [rsp - 16], rcx
	mov rcx, 1
	mov qword [rsp - 24], rcx
	jmp L_1
L_1:
	mov rbx, qword [rsp - 24]
	mov rcx, qword [rsp - 8]
	cmp rbx, rcx
	setle byte [rsp - 32]
	cmp byte [rsp - 32], 0
	jz L_3
L_2:
	mov rbx, qword [rsp - 16]
	mov rcx, qword [rsp - 24]
	mov qword [rsp - 40], rbx
	add qword [rsp - 40], rcx
	mov rcx, qword [rsp - 40]
	mov qword [rsp - 16], rcx
	inc qword [rsp - 24]
	jmp L_1
L_3:
	mov rcx, 1
	mov qword [rsp - 56], rcx
	jmp L_4
L_4:
	mov rbx, qword [rsp - 56]
	mov rcx, qword [rsp - 8]
	cmp rbx, rcx
	setle byte [rsp - 64]
	cmp byte [rsp - 64], 0
	jz L_6
L_5:
	mov rbx, qword [rsp - 16]
	mov rcx, 10
	mov qword [rsp - 72], rbx
	add qword [rsp - 72], rcx
	mov rbx, qword [rsp - 72]
	mov rcx, qword [rsp - 56]
	mov qword [rsp - 80], rbx
	add qword [rsp - 80], rcx
	mov rcx, qword [rsp - 80]
	mov qword [rsp - 16], rcx
	inc qword [rsp - 56]
	jmp L_4
L_6:
	mov rax, qword [rsp - 16]
	leave
	ret
SECTION .data
