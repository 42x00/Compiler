global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	mov rsi, 5
	mov rdi, 0
	mov r8, 1
	jmp L_1
L_1:
	push rbx
	push rcx
	mov rbx, r8
	mov rcx, rsi
	cmp rbx, rcx
	setle r10b
	pop rcx
	pop rbx
	cmp r10b, 0
	jz L_3
L_2:
	mov r9, 1
	jmp L_4
L_4:
	push rbx
	push rcx
	mov rbx, r9
	mov rcx, rsi
	cmp rbx, rcx
	setle r11b
	pop rcx
	pop rbx
	cmp r11b, 0
	jz L_6
L_5:
	push rbx
	push rcx
	mov rbx, rdi
	mov rcx, r8
	mov r12, rbx
	add r12, rcx
	pop rcx
	pop rbx
	mov rdi, r12
	inc r9
	jmp L_4
L_6:
	inc r8
	jmp L_1
L_3:
	mov rax, rdi
	leave
	ret
SECTION .data
