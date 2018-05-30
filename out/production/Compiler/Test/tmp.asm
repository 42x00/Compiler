global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	mov rsi, 10
	push rbx
	push rcx
	mov rbx, rsi
	mov rcx, 10
	cmp rbx, rcx
	sete dil
	pop rcx
	pop rbx
	cmp rdi, 0
	jz L_2
L_1:
	mov rsi, 20
	jmp L_3
L_3:
	mov rax, rsi
	leave
	ret
L_2:
	mov rsi, 30
	jmp L_3
SECTION .data