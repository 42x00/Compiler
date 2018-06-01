extern malloc
global x
global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	mov rbx, 10
	mov rcx, 3
	mov qword [rbp - 8], rbx
	sal qword [rbp - 8], cl
	mov rbx, qword [rbp - 8]
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 8]
	call malloc
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, 10
	mov [rax], rcx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rcx, qword [rbp - 8]
	mov qword [x], rcx
	mov rcx, qword [x]
	mov rdx, rcx
	mov rcx, 1
	mov r8, rcx
	mov rcx, 2
	mov [rdx + r8*8], rcx
	mov rcx, qword [x]
	mov rdx, rcx
	mov rcx, 1
	mov r8, rcx
	mov rcx, [rdx + r8*8]
	mov rax, rcx
	jmp L_1
L_1:
	leave
	ret
SECTION .data
SECTION .bss
x: dq 0
