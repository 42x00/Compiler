global x
global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	mov qword [x], 10
	mov qword [x], 20
	mov rax, qword [x]
	pop rbp
	ret
SECTION .data
x: dq 0