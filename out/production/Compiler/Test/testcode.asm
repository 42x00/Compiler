global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 80
	mov rcx, 5
	mov qword [rsp - 8], rcx
	mov rcx, 0
	mov qword [rsp - 16], rcx
	mov rbx, qword [rsp - 16]
	mov rcx, 0
	cmp rbx, rcx
	setne byte [rsp - 48]
	cmp byte [rsp - 48], 0
	jz L_2
L_3:
	mov rbx, qword [rsp - 8]
	mov rcx, qword [rsp - 16]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rsp - 56], rax
	mov rbx, qword [rsp - 56]
	mov rcx, 1
	cmp rbx, rcx
	setne byte [rsp - 64]
	cmp byte [rsp - 64], 0
	jz L_2
L_4:
	mov rcx, 1
	mov qword [rsp - 40], rcx
	jmp L_1
L_1:
	mov rcx, qword [rsp - 40]
	mov qword [rsp - 32], rcx
	leave
	ret
L_2:
	mov rcx, 0
	mov qword [rsp - 40], rcx
	jmp L_1
SECTION .data
