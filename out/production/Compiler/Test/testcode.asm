global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 96
	mov rcx, 5
	mov qword [rbp - 8], rcx
	mov rcx, 0
	mov qword [rbp - 16], rcx
	mov rcx, 20
	mov qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov rcx, 10
	cmp rbx, rcx
	sete byte [rbp - 64]
	jmp L_7
L_7:
	cmp byte [rbp - 64], 0
	jz L_6
L_8:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 72], rax
	mov rbx, qword [rbp - 72]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 80]
	jmp L_9
L_9:
	cmp byte [rbp - 80], 0
	jz L_6
L_10:
	mov rcx, 1
	mov qword [rbp - 56], rcx
	jmp L_4
L_4:
	cmp byte [rbp - 56], 0
	jz L_3
L_5:
	mov rbx, qword [rbp - 8]
	mov rcx, 5
	cmp rbx, rcx
	sete byte [rbp - 88]
	jmp L_11
L_11:
	cmp byte [rbp - 88], 0
	jz L_3
L_12:
	mov rcx, 1
	mov qword [rbp - 48], rcx
	jmp L_2
L_2:
	xor qword [rbp - 48], 1
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 40], rcx
	mov rcx, qword [rbp - 40]
	mov qword [rbp - 32], rcx
	mov rcx, qword [rbp - 32]
	mov rax, rcx
	jmp L_1
L_1:
	leave
	ret
L_3:
	mov rcx, 0
	mov qword [rbp - 48], rcx
	jmp L_2
L_6:
	mov rcx, 0
	mov qword [rbp - 56], rcx
	jmp L_4
SECTION .data
