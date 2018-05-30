global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 144
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
	cmp byte [rsp - 32], 0
	jz L_6
L_5:
	mov rcx, 10
	mov qword [rsp - 24], rcx
	jmp L_7
L_7:
	mov rbx, qword [rsp - 24]
	mov rcx, 10
	cmp rbx, rcx
	sete byte [rsp - 104]
	cmp byte [rsp - 104], 0
	jz L_11
L_12:
	mov rbx, qword [rsp - 8]
	mov rcx, qword [rsp - 16]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rsp - 112], rax
	mov rbx, qword [rsp - 112]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rsp - 120]
	cmp byte [rsp - 120], 0
	jz L_11
L_13:
	mov rcx, 1
	mov qword [rsp - 96], rcx
	cmp byte [rsp - 96], 0
	jz L_9
L_10:
	mov rbx, qword [rsp - 8]
	mov rcx, 5
	cmp rbx, rcx
	sete byte [rsp - 128]
	cmp byte [rsp - 128], 0
	jz L_9
L_14:
	mov rcx, 1
	mov qword [rsp - 88], rcx
	jmp L_8
L_8:
	xor qword [rsp - 88], 1
	mov rcx, qword [rsp - 80]
	mov qword [rsp - 72], rcx
	cmp byte [rsp - 72], 0
	jz L_16
L_15:
	mov rcx, 30
	mov qword [rsp - 24], rcx
	jmp L_16
L_16:
	mov rax, qword [rsp - 24]
	leave
	ret
L_9:
	mov rcx, 0
	mov qword [rsp - 88], rcx
	jmp L_8
L_11:
	mov rcx, 0
	mov qword [rsp - 96], rcx
	jmp L_10
L_6:
	mov rcx, 20
	mov qword [rsp - 24], rcx
	jmp L_7
L_2:
	mov rcx, 0
	mov qword [rsp - 40], rcx
	jmp L_1
SECTION .data
