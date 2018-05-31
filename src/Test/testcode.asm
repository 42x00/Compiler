global tak
global main
SECTION .text
tak:
	push rbp
	mov rbp, rsp
	sub rsp, 104
	push rbx
	push r12
	push r13
	push r14
	push r15
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 32]
	cmp byte [rbp - 32], 0
	jz L_3
L_2:
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 40], rbx
	sub qword [rbp - 40], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdx, qword [rbp - 24]
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 40]
	call tak
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 48], rcx
	mov rbx, qword [rbp - 16]
	mov rcx, 1
	mov qword [rbp - 56], rbx
	sub qword [rbp - 56], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdx, qword [rbp - 8]
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 56]
	call tak
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 64], rcx
	mov rbx, qword [rbp - 24]
	mov rcx, 1
	mov qword [rbp - 72], rbx
	sub qword [rbp - 72], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdx, qword [rbp - 16]
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 72]
	call tak
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 80], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdx, qword [rbp - 80]
	mov rsi, qword [rbp - 64]
	mov rdi, qword [rbp - 48]
	call tak
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 88], rcx
	mov rbx, 1
	mov rcx, qword [rbp - 88]
	mov qword [rbp - 96], rbx
	add qword [rbp - 96], rcx
	mov rcx, qword [rbp - 96]
	mov rax, rcx
	jmp L_1
L_1:
	pop r15
	pop r14
	pop r13
	pop r12
	pop rbx
	leave
	ret
	jmp L_4
L_4:
L_3:
	mov rcx, qword [rbp - 24]
	mov rax, rcx
	jmp L_1
	jmp L_4
main:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdx, 6
	mov rsi, 12
	mov rdi, 18
	call tak
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 8], rcx
	mov rcx, qword [rbp - 8]
	mov rax, rcx
	jmp L_6
L_6:
	leave
	ret
SECTION .data
