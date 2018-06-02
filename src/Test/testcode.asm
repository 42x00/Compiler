extern malloc
extern printf
extern puts
 
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
	sub rsp, 832
	mov rcx, _string_0
	mov qword [rbp - 8], rcx
	mov rcx, _string_1
	mov qword [rbp - 16], rcx
	mov rcx, _string_2
	mov qword [rbp - 24], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 24]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 32], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 32]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 40], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 40]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 48], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 48]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 56], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 56]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 64], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 64]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 72], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 72]
	call string.add
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
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 80]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 88], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 88]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 96], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 96]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 104], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 24]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 112], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 112]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 120], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 120]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 128], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 128]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 136], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 136]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 144], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 144]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 152], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 152]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 160], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 160]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 168], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 168]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 176], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 176]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 184], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 16]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 192], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 192]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 200], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 200]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 208], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 208]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 216], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 216]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 224], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 224]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 232], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 232]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 240], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 240]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 248], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 248]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 256], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 256]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 264], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 16]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 272], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 272]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 280], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 280]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 288], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 288]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 296], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 296]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 304], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 304]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 312], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 312]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 320], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 320]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 328], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 328]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 336], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 336]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 344], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 16]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 352], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 352]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 360], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 360]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 368], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 368]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 376], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 376]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 384], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 384]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 392], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 392]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 400], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 400]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 408], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 408]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 416], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 416]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 424], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 8]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 432], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 432]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 440], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 440]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 448], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 448]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 456], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 456]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 464], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 464]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 472], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 472]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 480], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 480]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 488], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 488]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 496], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 496]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 504], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 16]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 512], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 512]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 520], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 520]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 528], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 528]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 536], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 536]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 544], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 544]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 552], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 552]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 560], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 560]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 568], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 568]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 576], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 576]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 584], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 8]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 592], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 592]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 600], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 600]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 608], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 608]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 616], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 616]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 624], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 624]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 632], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 632]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 640], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 640]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 648], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 648]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 656], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 656]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 664], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 24]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 672], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 672]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 680], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 680]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 688], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 688]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 696], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 696]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 704], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 704]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 712], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 712]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 720], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 720]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 728], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 728]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 736], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 736]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 744], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 8]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 752], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 752]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 760], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 760]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 768], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 768]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 776], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 776]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 784], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 784]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 792], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 792]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 800], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 800]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 808], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 808]
	call string.add
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 816], rcx
	push rdi
	push rsi
	push rdx
	push rcx
	push r8
	push r9
	mov rdi, qword [rbp - 816]
	call print
	pop r9
	pop r8
	pop rcx
	pop rdx
	pop rsi
	pop rdi
	mov rcx, rax
	mov qword [rbp - 824], rcx
	mov rcx, 0
	mov rax, rcx
	jmp L_1
L_1:
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
	mov	rax, qword [rdi]
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
_string_1_size: dq 20
_string_1: db 92, 97, 98, 10, 97, 99, 34, 34, 97, 100, 100, 10, 34, 10, 97, 99, 10, 100, 98, 34, 0
_string_2_size: dq 20
_string_2: db 10, 97, 98, 98, 100, 98, 100, 100, 92, 92, 34, 100, 34, 99, 92, 97, 100, 99, 34, 99, 0
_string_0_size: dq 20
_string_0: db 34, 10, 98, 100, 97, 92, 34, 10, 100, 98, 100, 92, 99, 34, 92, 34, 99, 92, 99, 34, 0
SECTION .bss
stringbuffer: resb 256
