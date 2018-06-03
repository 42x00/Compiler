extern malloc
extern printf
extern puts
extern getchar
extern putchar
extern sprintf
extern __stack_chk_fail
extern malloc
extern printf
extern strlen
extern memcpy
extern scanf

global main

SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 416
	mov rdi, 3
	call malloc
	mov rbx, rax
	mov qword [rbp - 8], rbx
	mov rdi, 3
	call malloc
	mov rbx, rax
	mov qword [rbp - 16], rbx
	mov rdi, 3
	call malloc
	mov rbx, rax
	mov qword [rbp - 24], rbx
	mov rdi, 3
	call malloc
	mov rbx, rax
	mov qword [rbp - 32], rbx
	mov rdi, qword [rbp - 8]
	call _point.printPoint
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rcx, 480
	mov rdx, -463
	mov rsi, 849
	mov rdi, qword [rbp - 8]
	call _point.set
	mov rbx, rax
	mov qword [rbp - 56], rbx
	mov rcx, -150
	mov rdx, 585
	mov rsi, -208
	mov rdi, qword [rbp - 16]
	call _point.set
	mov rbx, rax
	mov qword [rbp - 80], rbx
	mov rcx, -742
	mov rdx, -670
	mov rsi, 360
	mov rdi, qword [rbp - 24]
	call _point.set
	mov rbx, rax
	mov qword [rbp - 104], rbx
	mov rcx, -960
	mov rdx, -591
	mov rsi, -29
	mov rdi, qword [rbp - 32]
	call _point.set
	mov rbx, rax
	mov qword [rbp - 136], rbx
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 8]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 144], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 16]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 152], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 32]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 160], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 24]
	call _point.sub
	mov rbx, rax
	mov qword [rbp - 168], rbx
	mov rsi, qword [rbp - 32]
	mov rdi, qword [rbp - 16]
	call _point.sub
	mov rbx, rax
	mov qword [rbp - 176], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 32]
	call _point.sub
	mov rbx, rax
	mov qword [rbp - 184], rbx
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 24]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 192], rbx
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 8]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 200], rbx
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 16]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 208], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 24]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 216], rbx
	mov rsi, qword [rbp - 32]
	mov rdi, qword [rbp - 8]
	call _point.sub
	mov rbx, rax
	mov qword [rbp - 224], rbx
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 8]
	call _point.add
	mov rbx, rax
	mov qword [rbp - 232], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 16]
	call _point.sub
	mov rbx, rax
	mov qword [rbp - 240], rbx
	mov rdi, qword [rbp - 8]
	call _point.sqrLen
	mov rbx, rax
	mov qword [rbp - 248], rbx
	mov rdi, qword [rbp - 248]
	call toString
	mov rbx, rax
	mov qword [rbp - 256], rbx
	mov rdi, qword [rbp - 256]
	call puts
	mov rbx, rax
	mov qword [rbp - 264], rbx
	mov rdi, qword [rbp - 16]
	call _point.sqrLen
	mov rbx, rax
	mov qword [rbp - 272], rbx
	mov rdi, qword [rbp - 272]
	call toString
	mov rbx, rax
	mov qword [rbp - 280], rbx
	mov rdi, qword [rbp - 280]
	call puts
	mov rbx, rax
	mov qword [rbp - 288], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 16]
	call _point.sqrDis
	mov rbx, rax
	mov qword [rbp - 296], rbx
	mov rdi, qword [rbp - 296]
	call toString
	mov rbx, rax
	mov qword [rbp - 304], rbx
	mov rdi, qword [rbp - 304]
	call puts
	mov rbx, rax
	mov qword [rbp - 312], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 32]
	call _point.sqrDis
	mov rbx, rax
	mov qword [rbp - 320], rbx
	mov rdi, qword [rbp - 320]
	call toString
	mov rbx, rax
	mov qword [rbp - 328], rbx
	mov rdi, qword [rbp - 328]
	call puts
	mov rbx, rax
	mov qword [rbp - 336], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 24]
	call _point.dot
	mov rbx, rax
	mov qword [rbp - 344], rbx
	mov rdi, qword [rbp - 344]
	call toString
	mov rbx, rax
	mov qword [rbp - 352], rbx
	mov rdi, qword [rbp - 352]
	call puts
	mov rbx, rax
	mov qword [rbp - 360], rbx
	mov rsi, qword [rbp - 32]
	mov rdi, qword [rbp - 16]
	call _point.cross
	mov rbx, rax
	mov qword [rbp - 368], rbx
	mov rdi, qword [rbp - 368]
	call _point.printPoint
	mov rbx, rax
	mov qword [rbp - 376], rbx
	mov rdi, qword [rbp - 8]
	call _point.printPoint
	mov rbx, rax
	mov qword [rbp - 384], rbx
	mov rdi, qword [rbp - 16]
	call _point.printPoint
	mov rbx, rax
	mov qword [rbp - 392], rbx
	mov rdi, qword [rbp - 24]
	call _point.printPoint
	mov rbx, rax
	mov qword [rbp - 400], rbx
	mov rdi, qword [rbp - 32]
	call _point.printPoint
	mov rbx, rax
	mov qword [rbp - 408], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_19
L_19:
	leave
	ret
_point.point:
	push rbp
	mov rbp, rsp
	sub rsp, 16
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_1
L_1:
	leave
	ret
_point.set:
	push rbp
	mov rbp, rsp
	sub rsp, 40
	mov qword [rbp - 32], rcx
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 16]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [rbp - 24]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [rbp - 32]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_3
L_3:
	leave
	ret
_point.sqrLen:
	push rbp
	mov rbp, rsp
	sub rsp, 104
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 32], rax
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 48]
	mov rcx, qword [rbp - 40]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 56], rax
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, qword [rbp - 64]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 80], rax
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 56]
	mov qword [rbp - 88], rbx
	add qword [rbp - 88], rcx
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 32]
	mov qword [rbp - 96], rbx
	add qword [rbp - 96], rcx
	mov rbx, qword [rbp - 96]
	mov rax, rbx
	jmp L_5
L_5:
	leave
	ret
_point.sqrDis:
	push rbp
	mov rbp, rsp
	sub rsp, 208
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 40], rbx
	sub qword [rbp - 40], rcx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 64], rbx
	sub qword [rbp - 64], rcx
	mov rbx, qword [rbp - 64]
	mov rcx, qword [rbp - 40]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 72], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 80]
	mov qword [rbp - 96], rbx
	sub qword [rbp - 96], rcx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 112], rbx
	mov rbx, qword [rbp - 112]
	mov rcx, qword [rbp - 104]
	mov qword [rbp - 120], rbx
	sub qword [rbp - 120], rcx
	mov rbx, qword [rbp - 120]
	mov rcx, qword [rbp - 96]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 128], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 144]
	mov rcx, qword [rbp - 136]
	mov qword [rbp - 152], rbx
	sub qword [rbp - 152], rcx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 168]
	mov rcx, qword [rbp - 160]
	mov qword [rbp - 176], rbx
	sub qword [rbp - 176], rcx
	mov rbx, qword [rbp - 176]
	mov rcx, qword [rbp - 152]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 184], rax
	mov rbx, qword [rbp - 184]
	mov rcx, qword [rbp - 128]
	mov qword [rbp - 192], rbx
	add qword [rbp - 192], rcx
	mov rbx, qword [rbp - 192]
	mov rcx, qword [rbp - 72]
	mov qword [rbp - 200], rbx
	add qword [rbp - 200], rcx
	mov rbx, qword [rbp - 200]
	mov rax, rbx
	jmp L_7
L_7:
	leave
	ret
_point.dot:
	push rbp
	mov rbp, rsp
	sub rsp, 112
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 24]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 40], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rcx, qword [rbp - 48]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 64], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 72]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 88], rax
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 64]
	mov qword [rbp - 96], rbx
	add qword [rbp - 96], rcx
	mov rbx, qword [rbp - 96]
	mov rcx, qword [rbp - 40]
	mov qword [rbp - 104], rbx
	add qword [rbp - 104], rcx
	mov rbx, qword [rbp - 104]
	mov rax, rbx
	jmp L_9
L_9:
	leave
	ret
_point.cross:
	push rbp
	mov rbp, rsp
	sub rsp, 208
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rdi, 0
	call malloc
	mov rbx, rax
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
	mov rcx, qword [rbp - 32]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 48], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 64]
	mov rcx, qword [rbp - 56]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 72], rax
	mov rbx, qword [rbp - 72]
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 80], rbx
	sub qword [rbp - 80], rcx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 96], rbx
	mov rbx, qword [rbp - 96]
	mov rcx, qword [rbp - 88]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 104], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 112], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [rbp - 120]
	mov rcx, qword [rbp - 112]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 128], rax
	mov rbx, qword [rbp - 128]
	mov rcx, qword [rbp - 104]
	mov qword [rbp - 136], rbx
	sub qword [rbp - 136], rcx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 152], rbx
	mov rbx, qword [rbp - 152]
	mov rcx, qword [rbp - 144]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 160], rax
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 176], rbx
	mov rbx, qword [rbp - 176]
	mov rcx, qword [rbp - 168]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 184], rax
	mov rbx, qword [rbp - 184]
	mov rcx, qword [rbp - 160]
	mov qword [rbp - 192], rbx
	sub qword [rbp - 192], rcx
	mov rcx, qword [rbp - 192]
	mov rdx, qword [rbp - 136]
	mov rsi, qword [rbp - 80]
	mov rdi, qword [rbp - 24]
	call _point.set
	mov rbx, rax
	mov qword [rbp - 200], rbx
	mov rbx, qword [rbp - 24]
	mov rax, rbx
	jmp L_11
L_11:
	leave
	ret
_point.add:
	push rbp
	mov rbp, rsp
	sub rsp, 96
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 40], rbx
	add qword [rbp - 40], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 40]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 64], rbx
	add qword [rbp - 64], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [rbp - 64]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 72]
	mov qword [rbp - 88], rbx
	add qword [rbp - 88], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov rax, rbx
	jmp L_13
L_13:
	leave
	ret
_point.sub:
	push rbp
	mov rbp, rsp
	sub rsp, 96
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 40], rbx
	sub qword [rbp - 40], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 40]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 64], rbx
	sub qword [rbp - 64], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [rbp - 64]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 72]
	mov qword [rbp - 88], rbx
	sub qword [rbp - 88], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov rax, rbx
	jmp L_15
L_15:
	leave
	ret
_point.printPoint:
	push rbp
	mov rbp, rsp
	sub rsp, 120
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 16], rbx
	mov rdi, qword [rbp - 16]
	call toString
	mov rbx, rax
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rdi, qword [rbp - 32]
	call toString
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rdi, qword [rbp - 48]
	call toString
	mov rbx, rax
	mov qword [rbp - 56], rbx
	mov rsi, qword [rbp - 56]
	mov rdi, _string_3
	call string.add
	mov rbx, rax
	mov qword [rbp - 64], rbx
	mov rsi, _string_2
	mov rdi, qword [rbp - 64]
	call string.add
	mov rbx, rax
	mov qword [rbp - 72], rbx
	mov rsi, qword [rbp - 40]
	mov rdi, qword [rbp - 72]
	call string.add
	mov rbx, rax
	mov qword [rbp - 80], rbx
	mov rsi, _string_1
	mov rdi, qword [rbp - 80]
	call string.add
	mov rbx, rax
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 88]
	call string.add
	mov rbx, rax
	mov qword [rbp - 96], rbx
	mov rsi, _string_0
	mov rdi, qword [rbp - 96]
	call string.add
	mov rbx, rax
	mov qword [rbp - 104], rbx
	mov rdi, qword [rbp - 104]
	call puts
	mov rbx, rax
	mov qword [rbp - 112], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_17
L_17:
	leave
	ret
toString:
	push rbp
	mov rbp,rsp
	mov rdx,rdi
	mov rax,0
	mov rdi,stringbuffer
	mov rsi,format1
	call sprintf
	mov rdi,stringbuffer
	call transtring
	mov rsp,rbp
	pop rbp
	ret

println:
	call puts
	ret

array.size:
	mov	rax, qword [rdi - 8]
	ret

string.add:
	push rbp
	mov rbp,rsp
	push rsi
	mov rsi,rdi
	mov rdi,stringbuffer
	mov rdx,[rsi-8]
	push rdx
	call memcpy
	pop rdi
	pop rsi
	add rdi,stringbuffer
	mov rdx,[rsi-8]
	add rdx,1
	call memcpy
	mov rdi,stringbuffer
	call transtring
	mov rsp,rbp
	pop rbp
	ret

getInt:
	push rbp
	mov rbp,rsp
	mov rax,0
	mov rdi,format1
	mov rsi,intbuffer
	call scanf
	mov rax,[intbuffer]
	mov rsp,rbp
	pop rbp
	ret

string.length:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     dword [rbp-4H], 0
	jmp     Llen_002
Llen_001:  add     dword [rbp-4H], 1
Llen_002:  mov     eax, dword [rbp-4H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jnz     Llen_001
	mov     eax, dword [rbp-4H]
	pop     rbp
	ret

string.ord:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     dword [rbp-1CH], esi
	mov     eax, dword [rbp-1CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	movsx   eax, al
	mov     dword [rbp-4H], eax
	mov     eax, dword [rbp-4H]
	pop     rbp
	ret

print:
	push rbp
	mov rbp,rsp
	mov rax,0
	mov rsi,rdi
	mov rdi,format2
	call printf
	mov rsp,rbp
	pop rbp
	ret

transtring:

	push rbp
	mov rbp,rsp
	call strlen
	push rdi
	mov rdi,rax
	push rdi
	add rdi,9
	call malloc
	pop rdi
	mov [rax],rdi
	add rax,8
	mov rdx,rdi
	add rdx,1
	mov rdi,rax
	pop rsi
	sub rsp,8
	push rax
	call memcpy
	pop rax
	mov rsp,rbp
	pop rbp
	ret

getString:

	push rbp
	mov rbp,rsp
	mov rax,0
	mov rdi,format2
	mov rsi,stringbuffer
	call scanf
	mov rdi,stringbuffer
	call transtring
	mov rsp,rbp
	pop rbp
	ret

string.substring:
	push rbp
	mov rbp,rsp
	push rdi
	push rsi
	mov rdi,rdx
	sub rdi,rsi
	add rdi,1
	push rdi
	add rdi,9
	call malloc
	pop rdx
	mov [rax],rdx
	add rax,8
	pop rsi
	pop rdi
	add rsi,rdi
	mov rdi,rax
	push rdx
	push rax
	call memcpy
	pop rax
	pop rdx
	mov qword[rax+rdx],0
	mov rsp,rbp
	pop rbp
	ret

string.parseInt:
	push    rbp
	mov     rbp, rsp
	sub     rsp, 32
	mov     qword [rbp-18H], rdi
	mov     edi, 256
	call    malloc
	mov     qword [rbp-8H], rax
	mov     dword [rbp-10H], 0
	mov     dword [rbp-0CH], 0
	jmp     Lpar_002
Lpar_001:  add     dword [rbp-10H], 1
Lpar_002:  mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Lpar_004
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Lpar_001
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Lpar_001
	jmp     Lpar_004
Lpar_003:  mov     edx, dword [rbp-0CH]
	mov     eax, edx
	shl     eax, 2
	add     eax, edx
	add     eax, eax
	mov     ecx, eax
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	movsx   eax, al
	add     eax, ecx
	sub     eax, 48
	mov     dword [rbp-0CH], eax
	add     dword [rbp-10H], 1
Lpar_004:  mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 47
	jle     Lpar_005
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jle     Lpar_003
Lpar_005:  mov     eax, dword [rbp-0CH]
	leave
	ret

string.eq:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     qword [rbp-20H], rsi
	mov     dword [rbp-0CH], 0
	mov     dword [rbp-8H], 0
	jmp     Leq_002
Leq_001:  add     dword [rbp-0CH], 1
Leq_002:  mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Leq_004
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Leq_001
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Leq_001
	jmp     Leq_004
Leq_003:  add     dword [rbp-8H], 1
Leq_004:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Leq_005
	mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Leq_003
	mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Leq_003
Leq_005:  mov     eax, dword [rbp-0CH]
	cmp     eax, dword [rbp-8H]
	jz      Leq_006
	mov     eax, 0
	jmp     Leq_010
Leq_006:  mov     dword [rbp-4H], 0
	mov     dword [rbp-4H], 0
	jmp     Leq_009
Leq_007:  mov     eax, dword [rbp-4H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-4H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jz      Leq_008
	mov     eax, 0
	jmp     Leq_010
Leq_008:  add     dword [rbp-4H], 1
Leq_009:  mov     eax, dword [rbp-4H]
	cmp     eax, dword [rbp-0CH]
	jl      Leq_007
	mov     eax, 1
Leq_010:  pop     rbp
	ret

string.s:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     qword [rbp-20H], rsi
	mov     dword [rbp-10H], 0
	mov     dword [rbp-0CH], 0
	jmp     Ll_012
Ll_011:  add     dword [rbp-10H], 1
Ll_012:  mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Ll_014
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Ll_011
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Ll_011
	jmp     Ll_014
Ll_013:  add     dword [rbp-0CH], 1
Ll_014:  mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Ll_015
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Ll_013
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Ll_013
Ll_015:  mov     eax, dword [rbp-0CH]
	cmp     dword [rbp-10H], eax
	cmovle  eax, dword [rbp-10H]
	mov     dword [rbp-4H], eax
	mov     dword [rbp-8H], 0
	mov     dword [rbp-8H], 0
	jmp     Ll_019
Ll_016:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jge     Ll_017
	mov     eax, 1
	jmp     Ll_021
Ll_017:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jle     Ll_018
	mov     eax, 0
	jmp     Ll_021
Ll_018:  add     dword [rbp-8H], 1
Ll_019:  mov     eax, dword [rbp-8H]
	cmp     eax, dword [rbp-4H]
	jl      Ll_016
	mov     eax, dword [rbp-10H]
	cmp     eax, dword [rbp-0CH]
	jl      Ll_020
	mov     eax, 0
	jmp     Ll_021
Ll_020:  mov     eax, 1
Ll_021:  pop     rbp
	ret

string.g:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     qword [rbp-20H], rsi
	mov     dword [rbp-10H], 0
	mov     dword [rbp-0CH], 0
	jmp     Lg_023
Lg_022:  add     dword [rbp-10H], 1
Lg_023:  mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Lg_025
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Lg_022
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Lg_022
	jmp     Lg_025
Lg_024:  add     dword [rbp-0CH], 1
Lg_025:  mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Lg_026
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Lg_024
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Lg_024
Lg_026:  mov     eax, dword [rbp-0CH]
	cmp     dword [rbp-10H], eax
	cmovle  eax, dword [rbp-10H]
	mov     dword [rbp-4H], eax
	mov     dword [rbp-8H], 0
	mov     dword [rbp-8H], 0
	jmp     Lg_030
Lg_027:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jle     Lg_028
	mov     eax, 1
	jmp     Lg_032
Lg_028:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jge     Lg_029
	mov     eax, 0
	jmp     Lg_032
Lg_029:  add     dword [rbp-8H], 1
Lg_030:  mov     eax, dword [rbp-8H]
	cmp     eax, dword [rbp-4H]
	jl      Lg_027
	mov     eax, dword [rbp-10H]
	cmp     eax, dword [rbp-0CH]
	jg      Lg_031
	mov     eax, 0
	jmp     Lg_032
Lg_031:  mov     eax, 1
Lg_032:  pop     rbp
	ret

string.le:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     qword [rbp-20H], rsi
	mov     dword [rbp-10H], 0
	mov     dword [rbp-0CH], 0
	jmp     Llege_002
Llege_001:  add     dword [rbp-10H], 1
Llege_002:  mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Llege_004
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Llege_001
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Llege_001
	jmp     Llege_004
Llege_003:  add     dword [rbp-0CH], 1
Llege_004:  mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Llege_005
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Llege_003
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Llege_003
Llege_005:  mov     eax, dword [rbp-0CH]
	cmp     dword [rbp-10H], eax
	cmovle  eax, dword [rbp-10H]
	mov     dword [rbp-4H], eax
	mov     dword [rbp-8H], 0
	mov     dword [rbp-8H], 0
	jmp     Llege_009
Llege_006:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jge     Llege_007
	mov     eax, 1
	jmp     Llege_011
Llege_007:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jle     Llege_008
	mov     eax, 0
	jmp     Llege_011
Llege_008:  add     dword [rbp-8H], 1
Llege_009:  mov     eax, dword [rbp-8H]
	cmp     eax, dword [rbp-4H]
	jl      Llege_006
	mov     eax, dword [rbp-10H]
	cmp     eax, dword [rbp-0CH]
	jle     Llege_010
	mov     eax, 0
	jmp     Llege_011
	Llege_010:  mov     eax, 1
	Llege_011:  pop     rbp
	ret

string.ge:
	push    rbp
	mov     rbp, rsp
	mov     qword [rbp-18H], rdi
	mov     qword [rbp-20H], rsi
	mov     dword [rbp-10H], 0
	mov     dword [rbp-0CH], 0
	jmp     Llege_013
Llege_012:  add     dword [rbp-10H], 1
Llege_013:  mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Llege_015
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Llege_012
	mov     eax, dword [rbp-10H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Llege_012
	jmp     Llege_015
Llege_014:  add     dword [rbp-0CH], 1
Llege_015:  mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	jz      Llege_016
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	test    al, al
	js      Llege_014
	mov     eax, dword [rbp-0CH]
	movsxd  rdx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rdx
	movzx   eax, byte [rax]
	cmp     al, 57
	jg      Llege_014
Llege_016:  mov     eax, dword [rbp-0CH]
	cmp     dword [rbp-10H], eax
	cmovle  eax, dword [rbp-10H]
	mov     dword [rbp-4H], eax
	mov     dword [rbp-8H], 0
	mov     dword [rbp-8H], 0
	jmp     Llege_020
Llege_017:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jle     Llege_018
	mov     eax, 1
	jmp     Llege_022
Llege_018:  mov     eax, dword [rbp-8H]
	movsxd  rdx, eax
	mov     rax, qword [rbp-18H]
	add     rax, rdx
	movzx   edx, byte [rax]
	mov     eax, dword [rbp-8H]
	movsxd  rcx, eax
	mov     rax, qword [rbp-20H]
	add     rax, rcx
	movzx   eax, byte [rax]
	cmp     dl, al
	jge     Llege_019
	mov     eax, 0
	jmp     Llege_022
Llege_019:  add     dword [rbp-8H], 1
Llege_020:  mov     eax, dword [rbp-8H]
	cmp     eax, dword [rbp-4H]
	jl      Llege_017
	mov     eax, dword [rbp-10H]
	cmp     eax, dword [rbp-0CH]
	jge     Llege_021
	mov     eax, 0
	jmp     Llege_022
Llege_021:  mov     eax, 1
Llege_022:  pop     rbp
	ret


SECTION .data
intbuffer: dq 0
format1: db "%lld", 0
format2: db "%s", 0
_string_1_size: dq 2
_string_1: db 44, 32, 0
_string_2_size: dq 2
_string_2: db 44, 32, 0
_string_0_size: dq 1
_string_0: db 41, 0
_string_3_size: dq 1
_string_3: db 40, 0
SECTION .bss
stringbuffer: resb 256
