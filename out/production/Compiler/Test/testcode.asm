global f
global main
SECTION .text
f:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	push rbp
	push rbx
	push r12
	push r13
	push r14
	push r15
	mov qword [rsp - 8], rdi
	mov rax, qword [rsp - 8]
	pop r15
	pop r14
	pop r13
	pop r12
	pop rbx
	pop rbp
	leave
	ret
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
	mov rdi, 1
	call f
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rsp - 8], rcx
	mov rax, 0
	leave
	ret
SECTION .data
