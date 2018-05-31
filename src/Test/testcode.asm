global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 136
	mov rcx, 5
	mov qword [rbp - 8], rcx
	mov rcx, 0
	mov qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	setne byte [rbp - 48]
	jmp L_4
L_4:
	cmp byte [rbp - 48], 0
	jz L_3
L_5:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 56], rax
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	cmp rbx, rcx
	setne byte [rbp - 64]
	jmp L_6
L_6:
	cmp byte [rbp - 64], 0
	jz L_3
L_7:
	mov rcx, 1
	mov qword [rbp - 40], rcx
	jmp L_2
L_2:
	mov rcx, qword [rbp - 40]
	mov qword [rbp - 32], rcx
	cmp byte [rbp - 32], 0
	jz L_9
L_8:
	mov rcx, 10
	mov qword [rbp - 24], rcx
	jmp L_10
L_10:
	mov rbx, qword [rbp - 24]
	mov rcx, 10
	cmp rbx, rcx
	sete byte [rbp - 104]
	jmp L_16
L_16:
	cmp byte [rbp - 104], 0
	jz L_15
L_17:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 112], rax
	mov rbx, qword [rbp - 112]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 120]
	jmp L_18
L_18:
	cmp byte [rbp - 120], 0
	jz L_15
L_19:
	mov rcx, 1
	mov qword [rbp - 96], rcx
	jmp L_13
L_13:
	cmp byte [rbp - 96], 0
	jz L_12
L_14:
	mov rbx, qword [rbp - 8]
	mov rcx, 5
	cmp rbx, rcx
	sete byte [rbp - 128]
	jmp L_20
L_20:
	cmp byte [rbp - 128], 0
	jz L_12
L_21:
	mov rcx, 1
	mov qword [rbp - 88], rcx
	jmp L_11
L_11:
	xor qword [rbp - 88], 1
	mov rcx, qword [rbp - 88]
	mov qword [rbp - 80], rcx
	mov rcx, qword [rbp - 80]
	mov qword [rbp - 72], rcx
	cmp byte [rbp - 72], 0
	jz L_23
L_22:
	mov rcx, 30
	mov qword [rbp - 24], rcx
	jmp L_23
L_23:
	mov rcx, qword [rbp - 24]
	mov rax, rcx
	jmp L_1
L_1:
	leave
	ret
L_12:
	mov rcx, 0
	mov qword [rbp - 88], rcx
	jmp L_11
L_15:
	mov rcx, 0
	mov qword [rbp - 96], rcx
	jmp L_13
L_9:
	mov rcx, 20
	mov qword [rbp - 24], rcx
	jmp L_10
L_3:
	mov rcx, 0
	mov qword [rbp - 40], rcx
	jmp L_2
SECTION .data
