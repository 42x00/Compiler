extern malloc
global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 56
	mov rcx, 5
	mov qword [rbp - 8], rcx
	mov rbx, qword [rbp - 8]
	mov rcx, 3
	mov qword [rbp - 24], rbx
	sal qword [rbp - 24], cl
	mov rbx, qword [rbp - 24]
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 24]
	call malloc
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, qword [rbp - 8]
	mov [rax], rcx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rcx, 0
	mov qword [rbp - 32], rcx
	jmp L_2
L_2:
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_4
L_3:
	mov rbx, 2
	mov rcx, 3
	mov qword [rbp - 48], rbx
	sal qword [rbp - 48], cl
	mov rbx, qword [rbp - 48]
	mov rcx, 8
	mov qword [rbp - 48], rbx
	add qword [rbp - 48], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 48]
	call malloc
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, 2
	mov [rax], rcx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 48], rbx
	add qword [rbp - 48], rcx
	mov rcx, qword [rbp - 24]
	mov rdx, rcx
	mov rcx, qword [rbp - 32]
	mov r8, rcx
	mov rcx, qword [rbp - 48]
	mov [rdx + r8*8], rcx
	inc qword [rbp - 32]
	
	jmp L_2
L_4:
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 16], rcx
	mov rcx, qword [rbp - 16]
	mov rdx, rcx
	mov rcx, 4
	mov r8, rcx
	mov rcx, [rdx + r8*8]
	mov rdx, rcx
	mov rcx, 1
	mov r8, rcx
	mov rcx, 1
	mov [rdx + r8*8], rcx
	mov rcx, qword [rbp - 16]
	mov rdx, rcx
	mov rcx, 4
	mov r8, rcx
	mov rcx, [rdx + r8*8]
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
