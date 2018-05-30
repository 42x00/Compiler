global main
SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 48
	mov rcx, 0
	mov qword [rsp - 8], rcx
	mov rbx, qword [rsp - 8]
	mov rcx, 0
	cmp rbx, rcx
	setne qword [rsp - 24]
	xor qword [rsp - 24], 1
	mov rcx, qword [rsp - 32]
	mov qword [rsp - 16], rcx
	mov rax, qword [rsp - 16]
	leave
	ret
SECTION .data
