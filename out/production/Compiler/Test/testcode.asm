global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	mov rax, 0
	cmp rax, 0
	sete qword [rbp - 8]
	cmp qword [rbp - 8], 0
	jz L_1
	leave
	ret
L_1:
	mov rax, 1
	leave
	ret
SECTION .data
