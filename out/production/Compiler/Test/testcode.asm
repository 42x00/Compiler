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

global _global_b
global _global_now
global _global_t
global _global_a
global _global_n
global _global_m
global _global_p
global _global_op
global _global_L
global _global_flag
global _global_s
global _global_sum
global _global_ans
global _global_square
global _global_gcd
global _global_lcm
global _global_aa
global _global_bb
global _global_MOD
global _global_no
global _global_lyk
global _global_RandRange
global _global_init
global _global_build
global _global_pushdown
global _global_pl
global _global_pr
global _global_update
global _global_query
global main

SECTION .text
_global_square:
	push rbp
	mov rbp, rsp
	sub rsp, 40
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 8]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 16], rdx
	mov rbx, qword [rbp - 8]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 24], rdx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 32], rax
	mov rbx, qword [rbp - 32]
	mov rax, rbx
	jmp L_1
L_1:
	leave
	ret
_global_gcd:
	push rbp
	mov rbp, rsp
	sub rsp, 64
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_6
L_5:
	mov rbx, qword [rbp - 8]
	mov rax, rbx
	jmp L_4
L_4:
	leave
	ret
L_6:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	setl byte [rbp - 32]
	cmp byte [rbp - 32], 0
	jz L_9
L_8:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 16]
	call _global_gcd
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
	mov rax, rbx
	jmp L_4
L_9:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 48], rdx
	mov rsi, qword [rbp - 48]
	mov rdi, qword [rbp - 16]
	call _global_gcd
	mov rbx, rax
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rax, rbx
	jmp L_4
_global_lcm:
	push rbp
	mov rbp, rsp
	sub rsp, 48
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 8]
	call _global_gcd
	mov rbx, rax
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 24]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 32], rax
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 16]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 40], rax
	mov rbx, qword [rbp - 40]
	mov rax, rbx
	jmp L_15
L_15:
	leave
	ret
_global_lyk:
	push rbp
	mov rbp, rsp
	sub rsp, 72
		mov rbx, 1
	mov qword [rbp - 8], rbx
	mov rbx, 1
	mov qword [rbp - 8], rbx
	jmp L_19
L_19:
	mov rbx, qword [rbp - 8]
	mov rcx, 3
	cmp rbx, rcx
	setl byte [rbp - 16]
	cmp byte [rbp - 16], 0
	jz L_21
L_20:
	mov rbx, qword [_global_no]
	mov rcx, qword [_global_aa]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 24], rax
	mov rbx, qword [rbp - 24]
	mov rcx, qword [_global_bb]
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rbx, qword [rbp - 32]
	mov rcx, qword [_global_MOD]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 40], rdx
	mov rbx, qword [rbp - 40]
	mov qword [_global_no], rbx
	mov rbx, qword [rbp - 8]
	mov qword [rbp - 48], rbx
	inc qword [rbp - 8]
	jmp L_19
L_21:
	mov rbx, qword [_global_no]
	mov rcx, 0
	cmp rbx, rcx
	setl byte [rbp - 56]
	cmp byte [rbp - 56], 0
	jz L_23
L_22:
	mov rcx, qword [_global_no]
	mov qword [rbp - 64], rcx
neg qword [rbp - 64]
	mov rbx, qword [rbp - 64]
	mov qword [_global_no], rbx
	jmp L_23
L_23:
	mov rbx, qword [_global_no]
	mov rax, rbx
	jmp L_18
L_18:
	leave
	ret
_global_RandRange:
	push rbp
	mov rbp, rsp
	sub rsp, 72
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 8]
	mov qword [rbp - 24], rbx
	sub qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov rcx, 1
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	call _global_lyk
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
	mov rcx, qword [rbp - 32]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 48], rdx
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 56], rbx
	add qword [rbp - 56], rcx
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 64], rbx
	add qword [rbp - 64], rcx
	mov rbx, qword [rbp - 64]
	mov rax, rbx
	jmp L_26
L_26:
	leave
	ret
_global_init:
	push rbp
	mov rbp, rsp
	sub rsp, 200
		mov rbx, 140005
	mov rcx, 3
	mov qword [rbp - 16], rbx
	sal qword [rbp - 16], cl
	mov rbx, qword [rbp - 16]
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rdi, qword [rbp - 16]
	call malloc
	mov rbx, 140005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov qword [rbp - 8], rbx
	mov rbx, 0
	mov qword [rbp - 24], rbx
	mov rbx, 0
	mov qword [rbp - 32], rbx
	mov rbx, 2
	mov qword [rbp - 24], rbx
	jmp L_30
L_30:
	mov rbx, qword [rbp - 24]
	mov rcx, qword [_global_p]
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_32
L_31:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [rbp - 24]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 24]
mov rcx, qword [rbp - 24]
	mov qword [rbp - 48], rcx
	jmp L_30
L_32:
	mov rbx, 2
	mov qword [rbp - 24], rbx
	jmp L_33
L_33:
	mov rbx, qword [rbp - 24]
	mov rcx, qword [_global_p]
	cmp rbx, rcx
	setl byte [rbp - 56]
	cmp byte [rbp - 56], 0
	jz L_35
L_34:
	mov rbx, 1
	mov qword [rbp - 32], rbx
	jmp L_36
L_36:
	mov rbx, qword [rbp - 32]
	mov rcx, 15
	cmp rbx, rcx
	setle byte [rbp - 64]
	cmp byte [rbp - 64], 0
	jz L_38
L_37:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rdi, qword [rbp - 72]
	call _global_square
	mov rbx, rax
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 88], rdx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 32]
mov rcx, qword [rbp - 32]
	mov qword [rbp - 96], rcx
	jmp L_36
L_38:
	inc qword [rbp - 24]
mov rcx, qword [rbp - 24]
	mov qword [rbp - 104], rcx
	jmp L_33
L_35:
	mov rbx, 2
	mov qword [rbp - 24], rbx
	jmp L_39
L_39:
	mov rbx, qword [rbp - 24]
	mov rcx, qword [_global_p]
	cmp rbx, rcx
	setl byte [rbp - 112]
	cmp byte [rbp - 112], 0
	jz L_41
L_40:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov rbx, qword [rbp - 136]
	mov qword [rbp - 128], rbx
	mov rbx, 1
	mov qword [rbp - 120], rbx
	jmp L_42
L_42:
	jmp L_43
L_43:
	mov rdi, qword [rbp - 128]
	call _global_square
	mov rbx, rax
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 144]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 152], rdx
	mov rbx, qword [rbp - 152]
	mov qword [rbp - 128], rbx
	mov rbx, qword [_global_b]
	mov r10, rbx
	mov rbx, qword [rbp - 128]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov rbx, qword [rbp - 128]
	mov rcx, qword [rbp - 160]
	cmp rbx, rcx
	sete byte [rbp - 168]
	cmp byte [rbp - 168], 0
	jz L_46
L_45:
	jmp L_44
L_44:
	mov rsi, qword [rbp - 120]
	mov rdi, qword [_global_L]
	call _global_lcm
	mov rbx, rax
	mov qword [rbp - 184], rbx
	mov rbx, qword [rbp - 184]
	mov qword [_global_L], rbx
	inc qword [rbp - 24]
mov rcx, qword [rbp - 24]
	mov qword [rbp - 192], rcx
	jmp L_39
	jmp L_46
L_46:
	inc qword [rbp - 120]
mov rcx, qword [rbp - 120]
	mov qword [rbp - 176], rcx
	jmp L_42
L_41:
	mov rbx, qword [_global_b]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_b]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_29
L_29:
	leave
	ret
_global_build:
	push rbp
	mov rbp, rsp
	sub rsp, 432
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, 0
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 24]
	cmp rbx, rcx
	sete byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_51
L_50:
	mov rbx, qword [_global_a]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 48]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_a]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, qword [_global_p]
	cmp rbx, rcx
	setl byte [rbp - 80]
	jmp L_59
L_59:
	cmp byte [rbp - 80], 0
	jz L_58
L_60:
	mov rbx, qword [_global_a]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 88]
	mov rcx, 0
	cmp rbx, rcx
	setge byte [rbp - 96]
	jmp L_61
L_61:
	cmp byte [rbp - 96], 0
	jz L_58
L_62:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_56
L_56:
	cmp byte [rbp - 64], 0
	jz L_55
L_57:
	mov rbx, qword [_global_a]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 104]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 112], rdx
	mov rbx, qword [_global_b]
	mov r10, rbx
	mov rbx, qword [rbp - 112]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [rbp - 120]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 128]
	jmp L_63
L_63:
	cmp byte [rbp - 128], 0
	jz L_55
L_64:
	mov rbx, 1
	mov qword [rbp - 56], rbx
	cmp byte [rbp - 56], 0
	jz L_54
L_53:
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_a]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 144]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 136]
	mov qword [r10 + r11*8], rbx
	mov rbx, 1
	mov qword [rbp - 32], rbx
	jmp L_65
L_65:
	mov rbx, qword [rbp - 32]
	mov rcx, qword [_global_L]
	cmp rbx, rcx
	setl byte [rbp - 152]
	cmp byte [rbp - 152], 0
	jz L_67
L_66:
	mov rbx, qword [rbp - 32]
	mov rcx, 1
	mov qword [rbp - 160], rbx
	sub qword [rbp - 160], rcx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 168]
	mov r10, rbx
	mov rbx, qword [rbp - 160]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 176], rbx
	mov rdi, qword [rbp - 176]
	call _global_square
	mov rbx, rax
	mov qword [rbp - 184], rbx
	mov rbx, qword [rbp - 184]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 192], rdx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 200], rbx
	mov rbx, qword [rbp - 200]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 192]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 32]
mov rcx, qword [rbp - 32]
	mov qword [rbp - 208], rcx
	jmp L_65
L_67:
	jmp L_54
L_54:
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_52
L_52:
	mov rbx, 0
	mov rax, rbx
	jmp L_49
L_49:
	leave
	ret
L_55:
	mov rbx, 0
	mov qword [rbp - 56], rbx
	jmp L_54
L_58:
	mov rbx, 0
	mov qword [rbp - 64], rbx
	jmp L_56
L_51:
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 224], rax
	mov rbx, qword [rbp - 224]
	mov qword [rbp - 216], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 240], rax
	mov rbx, qword [rbp - 240]
	mov rcx, 1
	mov qword [rbp - 248], rbx
	add qword [rbp - 248], rcx
	mov rbx, qword [rbp - 248]
	mov qword [rbp - 232], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 264], rbx
	add qword [rbp - 264], rcx
	mov rbx, qword [rbp - 264]
	mov rcx, 2
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 272], rax
	mov rbx, qword [rbp - 272]
	mov qword [rbp - 256], rbx
	mov rdx, qword [rbp - 256]
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 216]
	call _global_build
	mov rbx, rax
	mov qword [rbp - 280], rbx
	mov rbx, qword [rbp - 256]
	mov rcx, 1
	mov qword [rbp - 288], rbx
	add qword [rbp - 288], rcx
	mov rdx, qword [rbp - 24]
	mov rsi, qword [rbp - 288]
	mov rdi, qword [rbp - 232]
	call _global_build
	mov rbx, rax
	mov qword [rbp - 296], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 232]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 304], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 216]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 312], rbx
	mov rbx, qword [rbp - 312]
	mov rcx, qword [rbp - 304]
	mov qword [rbp - 320], rbx
	add qword [rbp - 320], rcx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 320]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 232]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 328], rbx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 216]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 336], rbx
	mov rbx, qword [rbp - 336]
	mov rcx, qword [rbp - 328]
	mov qword [rbp - 344], rbx
	and qword [rbp - 344], rcx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 344]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 352], rbx
	mov rbx, qword [rbp - 352]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 360]
	cmp byte [rbp - 360], 0
	jz L_69
L_68:
	mov rbx, 0
	mov qword [rbp - 32], rbx
	jmp L_70
L_70:
	mov rbx, qword [rbp - 32]
	mov rcx, qword [_global_L]
	cmp rbx, rcx
	setl byte [rbp - 368]
	cmp byte [rbp - 368], 0
	jz L_72
L_71:
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 232]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 376], rbx
	mov rbx, qword [rbp - 376]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 384], rbx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 216]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 392], rbx
	mov rbx, qword [rbp - 392]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 400], rbx
	mov rbx, qword [rbp - 400]
	mov rcx, qword [rbp - 384]
	mov qword [rbp - 408], rbx
	add qword [rbp - 408], rcx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 416], rbx
	mov rbx, qword [rbp - 416]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 408]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 32]
mov rcx, qword [rbp - 32]
	mov qword [rbp - 424], rcx
	jmp L_70
L_72:
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_69
L_69:
	jmp L_52
_global_pushdown:
	push rbp
	mov rbp, rsp
	sub rsp, 248
	mov qword [rbp - 8], rdi
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_77
L_76:
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 40], rax
	mov rbx, qword [rbp - 40]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 56], rax
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 64], rbx
	add qword [rbp - 64], rcx
	mov rbx, qword [rbp - 64]
	mov qword [rbp - 48], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 72]
	mov qword [rbp - 88], rbx
	add qword [rbp - 88], rcx
	mov rbx, qword [rbp - 88]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 96], rdx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 96]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 112], rbx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 104]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 120]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 128], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov rbx, qword [rbp - 136]
	mov rcx, qword [rbp - 128]
	mov qword [rbp - 144], rbx
	add qword [rbp - 144], rcx
	mov rbx, qword [rbp - 144]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 152], rdx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 152]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 168]
	mov rcx, qword [rbp - 160]
	mov qword [rbp - 176], rbx
	add qword [rbp - 176], rcx
	mov rbx, qword [rbp - 176]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 184], rdx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [rbp - 184]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 192], rbx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 200], rbx
	mov rbx, qword [rbp - 200]
	mov r10, rbx
	mov rbx, qword [rbp - 192]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 208], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [rbp - 208]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 216], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 224], rbx
	mov rbx, qword [rbp - 224]
	mov rcx, qword [rbp - 216]
	mov qword [rbp - 232], rbx
	add qword [rbp - 232], rcx
	mov rbx, qword [rbp - 232]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 240], rdx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [rbp - 240]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_77
L_77:
	mov rbx, 0
	mov rax, rbx
	jmp L_75
L_75:
	leave
	ret
_global_update:
	push rbp
	mov rbp, rsp
	sub rsp, 616
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [_global_pl]
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	setle byte [rbp - 48]
	jmp L_87
L_87:
	cmp byte [rbp - 48], 0
	jz L_86
L_88:
	mov rbx, qword [_global_pr]
	mov rcx, qword [rbp - 24]
	cmp rbx, rcx
	setge byte [rbp - 56]
	jmp L_89
L_89:
	cmp byte [rbp - 56], 0
	jz L_86
L_90:
	mov rbx, 1
	mov qword [rbp - 40], rbx
	jmp L_84
L_84:
	cmp byte [rbp - 40], 0
	jz L_83
L_85:
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 64]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 72]
	jmp L_91
L_91:
	cmp byte [rbp - 72], 0
	jz L_83
L_92:
	mov rbx, 1
	mov qword [rbp - 32], rbx
	cmp byte [rbp - 32], 0
	jz L_82
L_81:
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, 1
	mov qword [rbp - 88], rbx
	add qword [rbp - 88], rcx
	mov rbx, qword [rbp - 88]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 96], rdx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 96]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 112], rbx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 104]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 120]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 128], rbx
	mov rbx, qword [rbp - 128]
	mov rcx, 1
	mov qword [rbp - 136], rbx
	add qword [rbp - 136], rcx
	mov rbx, qword [rbp - 136]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 144], rdx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 144]
	mov qword [r10 + r11*8], rbx
	jmp L_80
L_80:
	leave
	ret
L_82:
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 24]
	cmp rbx, rcx
	sete byte [rbp - 152]
	cmp byte [rbp - 152], 0
	jz L_95
L_94:
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov rdi, qword [rbp - 160]
	call _global_square
	mov rbx, rax
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 168]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 176], rdx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 176]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 184], rbx
	mov rbx, qword [_global_b]
	mov r10, rbx
	mov rbx, qword [rbp - 184]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 192], rbx
	mov rbx, qword [rbp - 192]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 200]
	cmp byte [rbp - 200], 0
	jz L_97
L_96:
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 208], rbx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 216], rbx
	mov rbx, qword [rbp - 216]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 208]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 224], rbx
	mov rbx, 1
	mov qword [rbp - 224], rbx
	jmp L_98
L_98:
	mov rbx, qword [rbp - 224]
	mov rcx, qword [_global_L]
	cmp rbx, rcx
	setl byte [rbp - 232]
	cmp byte [rbp - 232], 0
	jz L_100
L_99:
	mov rbx, qword [rbp - 224]
	mov rcx, 1
	mov qword [rbp - 240], rbx
	sub qword [rbp - 240], rcx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 248], rbx
	mov rbx, qword [rbp - 248]
	mov r10, rbx
	mov rbx, qword [rbp - 240]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 256], rbx
	mov rdi, qword [rbp - 256]
	call _global_square
	mov rbx, rax
	mov qword [rbp - 264], rbx
	mov rbx, qword [rbp - 264]
	mov rcx, qword [_global_p]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 272], rdx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 280], rbx
	mov rbx, qword [rbp - 280]
	mov r10, rbx
	mov rbx, qword [rbp - 224]
	mov r11, rbx
	mov rbx, qword [rbp - 272]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 224]
mov rcx, qword [rbp - 224]
	mov qword [rbp - 288], rcx
	jmp L_98
L_100:
	jmp L_97
L_97:
	jmp L_80
L_95:
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 296], rbx
	mov rbx, qword [rbp - 296]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 304]
	cmp byte [rbp - 304], 0
	jz L_103
L_102:
	mov rdi, qword [rbp - 8]
	call _global_pushdown
	mov rbx, rax
	mov qword [rbp - 312], rbx
	jmp L_103
L_103:
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 328], rax
	mov rbx, qword [rbp - 328]
	mov qword [rbp - 320], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 344], rax
	mov rbx, qword [rbp - 344]
	mov rcx, 1
	mov qword [rbp - 352], rbx
	add qword [rbp - 352], rcx
	mov rbx, qword [rbp - 352]
	mov qword [rbp - 336], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 368], rbx
	add qword [rbp - 368], rcx
	mov rbx, qword [rbp - 368]
	mov rcx, 2
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 376], rax
	mov rbx, qword [rbp - 376]
	mov qword [rbp - 360], rbx
	mov rbx, qword [_global_pl]
	mov rcx, qword [rbp - 360]
	cmp rbx, rcx
	setle byte [rbp - 384]
	cmp byte [rbp - 384], 0
	jz L_105
L_104:
	mov rdx, qword [rbp - 360]
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 320]
	call _global_update
	mov rbx, rax
	mov qword [rbp - 392], rbx
	jmp L_105
L_105:
	mov rbx, qword [rbp - 360]
	mov rcx, 1
	mov qword [rbp - 400], rbx
	add qword [rbp - 400], rcx
	mov rbx, qword [_global_pr]
	mov rcx, qword [rbp - 400]
	cmp rbx, rcx
	setge byte [rbp - 408]
	cmp byte [rbp - 408], 0
	jz L_107
L_106:
	mov rbx, qword [rbp - 360]
	mov rcx, 1
	mov qword [rbp - 416], rbx
	add qword [rbp - 416], rcx
	mov rdx, qword [rbp - 24]
	mov rsi, qword [rbp - 416]
	mov rdi, qword [rbp - 336]
	call _global_update
	mov rbx, rax
	mov qword [rbp - 424], rbx
	jmp L_107
L_107:
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 336]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 432], rbx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 320]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 440], rbx
	mov rbx, qword [rbp - 440]
	mov rcx, qword [rbp - 432]
	mov qword [rbp - 448], rbx
	add qword [rbp - 448], rcx
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 448]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 336]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 456], rbx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 320]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 464], rbx
	mov rbx, qword [rbp - 464]
	mov rcx, qword [rbp - 456]
	mov qword [rbp - 472], rbx
	and qword [rbp - 472], rcx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [rbp - 472]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_flag]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 480], rbx
	mov rbx, qword [rbp - 480]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 488]
	cmp byte [rbp - 488], 0
	jz L_109
L_108:
	mov rbx, 0
	mov qword [rbp - 496], rbx
	mov rbx, 0
	mov qword [rbp - 496], rbx
	jmp L_110
L_110:
	mov rbx, qword [rbp - 496]
	mov rcx, qword [_global_L]
	cmp rbx, rcx
	setl byte [rbp - 504]
	cmp byte [rbp - 504], 0
	jz L_112
L_111:
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 336]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 512], rbx
	mov rbx, qword [rbp - 496]
	mov rcx, qword [rbp - 512]
	mov qword [rbp - 520], rbx
	add qword [rbp - 520], rcx
	mov rbx, qword [rbp - 520]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 528], rdx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 336]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 536], rbx
	mov rbx, qword [rbp - 536]
	mov r10, rbx
	mov rbx, qword [rbp - 528]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 544], rbx
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 320]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 552], rbx
	mov rbx, qword [rbp - 496]
	mov rcx, qword [rbp - 552]
	mov qword [rbp - 560], rbx
	add qword [rbp - 560], rcx
	mov rbx, qword [rbp - 560]
	mov rcx, qword [_global_L]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 568], rdx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 320]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 576], rbx
	mov rbx, qword [rbp - 576]
	mov r10, rbx
	mov rbx, qword [rbp - 568]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 584], rbx
	mov rbx, qword [rbp - 584]
	mov rcx, qword [rbp - 544]
	mov qword [rbp - 592], rbx
	add qword [rbp - 592], rcx
	mov rbx, qword [_global_s]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 600], rbx
	mov rbx, qword [rbp - 600]
	mov r10, rbx
	mov rbx, qword [rbp - 496]
	mov r11, rbx
	mov rbx, qword [rbp - 592]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 496]
mov rcx, qword [rbp - 496]
	mov qword [rbp - 608], rcx
	jmp L_110
L_112:
	mov rbx, qword [_global_now]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_109
L_109:
	mov rbx, 0
	mov rax, rbx
	jmp L_80
L_83:
	mov rbx, 0
	mov qword [rbp - 32], rbx
	jmp L_82
L_86:
	mov rbx, 0
	mov qword [rbp - 40], rbx
	jmp L_84
_global_query:
	push rbp
	mov rbp, rsp
	sub rsp, 240
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [_global_pl]
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	setle byte [rbp - 40]
	jmp L_119
L_119:
	cmp byte [rbp - 40], 0
	jz L_118
L_120:
	mov rbx, qword [_global_pr]
	mov rcx, qword [rbp - 24]
	cmp rbx, rcx
	setge byte [rbp - 48]
	jmp L_121
L_121:
	cmp byte [rbp - 48], 0
	jz L_118
L_122:
	mov rbx, 1
	mov qword [rbp - 32], rbx
	cmp byte [rbp - 32], 0
	jz L_117
L_116:
	mov rbx, qword [_global_sum]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rax, rbx
	jmp L_115
L_115:
	leave
	ret
L_117:
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 72], rax
	mov rbx, qword [rbp - 72]
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	mov rax, rbx
	imul rcx
	mov qword [rbp - 88], rax
	mov rbx, qword [rbp - 88]
	mov rcx, 1
	mov qword [rbp - 96], rbx
	add qword [rbp - 96], rcx
	mov rbx, qword [rbp - 96]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 112], rbx
	add qword [rbp - 112], rcx
	mov rbx, qword [rbp - 112]
	mov rcx, 2
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 120], rax
	mov rbx, qword [rbp - 120]
	mov qword [rbp - 104], rbx
	mov rbx, 0
	mov qword [rbp - 128], rbx
	mov rbx, qword [_global_t]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov rbx, qword [rbp - 136]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 144]
	cmp byte [rbp - 144], 0
	jz L_125
L_124:
	mov rdi, qword [rbp - 8]
	call _global_pushdown
	mov rbx, rax
	mov qword [rbp - 152], rbx
	jmp L_125
L_125:
	mov rbx, qword [_global_pl]
	mov rcx, qword [rbp - 104]
	cmp rbx, rcx
	setle byte [rbp - 160]
	cmp byte [rbp - 160], 0
	jz L_127
L_126:
	mov rdx, qword [rbp - 104]
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 64]
	call _global_query
	mov rbx, rax
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 128]
	mov rcx, qword [rbp - 168]
	mov qword [rbp - 176], rbx
	add qword [rbp - 176], rcx
	mov rbx, qword [rbp - 176]
	mov rcx, qword [_global_MOD]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 184], rdx
	mov rbx, qword [rbp - 184]
	mov qword [rbp - 128], rbx
	jmp L_127
L_127:
	mov rbx, qword [rbp - 104]
	mov rcx, 1
	mov qword [rbp - 192], rbx
	add qword [rbp - 192], rcx
	mov rbx, qword [_global_pr]
	mov rcx, qword [rbp - 192]
	cmp rbx, rcx
	setge byte [rbp - 200]
	cmp byte [rbp - 200], 0
	jz L_129
L_128:
	mov rbx, qword [rbp - 104]
	mov rcx, 1
	mov qword [rbp - 208], rbx
	add qword [rbp - 208], rcx
	mov rdx, qword [rbp - 24]
	mov rsi, qword [rbp - 208]
	mov rdi, qword [rbp - 80]
	call _global_query
	mov rbx, rax
	mov qword [rbp - 216], rbx
	mov rbx, qword [rbp - 128]
	mov rcx, qword [rbp - 216]
	mov qword [rbp - 224], rbx
	add qword [rbp - 224], rcx
	mov rbx, qword [rbp - 224]
	mov rcx, qword [_global_MOD]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 232], rdx
	mov rbx, qword [rbp - 232]
	mov qword [rbp - 128], rbx
	jmp L_129
L_129:
	mov rbx, qword [rbp - 128]
	mov rax, rbx
	jmp L_115
L_118:
	mov rbx, 0
	mov qword [rbp - 32], rbx
	jmp L_117
main:
	push rbp
	mov rbp, rsp
	sub rsp, 208
	mov rbx, 500005
	mov rcx, 3
	mov qword [rbp - 8], rbx
	sal qword [rbp - 8], cl
	mov rbx, qword [rbp - 8]
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rdi, qword [rbp - 8]
	call malloc
	mov rbx, 500005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rbx, qword [rbp - 8]
	mov qword [_global_b], rbx
	mov rbx, 500005
	mov rcx, 3
	mov qword [rbp - 16], rbx
	sal qword [rbp - 16], cl
	mov rbx, qword [rbp - 16]
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rdi, qword [rbp - 16]
	call malloc
	mov rbx, 500005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov qword [_global_now], rbx
	mov rbx, 500005
	mov rcx, 3
	mov qword [rbp - 24], rbx
	sal qword [rbp - 24], cl
	mov rbx, qword [rbp - 24]
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rdi, qword [rbp - 24]
	call malloc
	mov rbx, 500005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov qword [_global_t], rbx
	mov rbx, 200005
	mov rcx, 3
	mov qword [rbp - 32], rbx
	sal qword [rbp - 32], cl
	mov rbx, qword [rbp - 32]
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rdi, qword [rbp - 32]
	call malloc
	mov rbx, 200005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rbx, qword [rbp - 32]
	mov qword [_global_a], rbx
	mov rbx, 1
	mov qword [_global_L], rbx
	mov rbx, 500005
	mov rcx, 3
	mov qword [rbp - 40], rbx
	sal qword [rbp - 40], cl
	mov rbx, qword [rbp - 40]
	mov rcx, 8
	mov qword [rbp - 40], rbx
	add qword [rbp - 40], rcx
	mov rdi, qword [rbp - 40]
	call malloc
	mov rbx, 500005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 40], rbx
	add qword [rbp - 40], rcx
	mov rbx, qword [rbp - 40]
	mov qword [_global_flag], rbx
	mov rbx, 500005
	mov rcx, 3
	mov qword [rbp - 48], rbx
	sal qword [rbp - 48], cl
	mov rbx, qword [rbp - 48]
	mov rcx, 8
	mov qword [rbp - 48], rbx
	add qword [rbp - 48], rcx
	mov rdi, qword [rbp - 48]
	call malloc
	mov rbx, 500005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 48], rbx
	add qword [rbp - 48], rcx
	mov rbx, 0
	mov qword [rbp - 56], rbx
	jmp L_132
L_132:
	mov rbx, qword [rbp - 56]
	mov rcx, 500005
	cmp rbx, rcx
	setl byte [rbp - 64]
	cmp byte [rbp - 64], 0
	jz L_134
L_133:
	mov rbx, 80
	mov rcx, 3
	mov qword [rbp - 72], rbx
	sal qword [rbp - 72], cl
	mov rbx, qword [rbp - 72]
	mov rcx, 8
	mov qword [rbp - 72], rbx
	add qword [rbp - 72], rcx
	mov rdi, qword [rbp - 72]
	call malloc
	mov rbx, 80
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 72], rbx
	add qword [rbp - 72], rcx
	mov rbx, qword [rbp - 48]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 72]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 56]
	jmp L_132
L_134:
	mov rbx, qword [rbp - 48]
	mov qword [_global_s], rbx
	mov rbx, 500005
	mov rcx, 3
	mov qword [rbp - 80], rbx
	sal qword [rbp - 80], cl
	mov rbx, qword [rbp - 80]
	mov rcx, 8
	mov qword [rbp - 80], rbx
	add qword [rbp - 80], rcx
	mov rdi, qword [rbp - 80]
	call malloc
	mov rbx, 500005
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 80], rbx
	add qword [rbp - 80], rcx
	mov rbx, qword [rbp - 80]
	mov qword [_global_sum], rbx
	mov rbx, 0
	mov qword [_global_ans], rbx
	mov rbx, 13131
	mov qword [_global_aa], rbx
	mov rbx, 5353
	mov qword [_global_bb], rbx
	mov rbx, 2
	mov rcx, 14
	mov qword [rbp - 88], rbx
	sal qword [rbp - 88], cl
	mov rbx, qword [rbp - 88]
	mov rcx, 7
	mov qword [rbp - 96], rbx
	sub qword [rbp - 96], rcx
	mov rbx, qword [rbp - 96]
	mov qword [_global_MOD], rbx
	mov rbx, 1
	mov qword [_global_no], rbx
	mov rbx, 0
	mov qword [_global_pl], rbx
	mov rbx, 0
	mov qword [_global_pr], rbx
	call getInt
	mov rbx, rax
	mov qword [rbp - 8], rbx
	mov rbx, qword [rbp - 8]
	mov qword [_global_n], rbx
	call getInt
	mov rbx, rax
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 16]
	mov qword [_global_m], rbx
	call getInt
	mov rbx, rax
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 24]
	mov qword [_global_p], rbx
	mov rbx, 1
	mov qword [rbp - 32], rbx
	mov rbx, 1
	mov qword [rbp - 32], rbx
	jmp L_136
L_136:
	mov rbx, qword [rbp - 32]
	mov rcx, qword [_global_n]
	cmp rbx, rcx
	setle byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_138
L_137:
	mov rsi, qword [_global_p]
	mov rdi, 0
	call _global_RandRange
	mov rbx, rax
	mov qword [rbp - 48], rbx
	mov rbx, qword [_global_a]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 48]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 32]
mov rcx, qword [rbp - 32]
	mov qword [rbp - 56], rcx
	jmp L_136
L_138:
	call _global_init
	mov rbx, rax
	mov qword [rbp - 64], rbx
	mov rdx, qword [_global_n]
	mov rsi, 1
	mov rdi, 1
	call _global_build
	mov rbx, rax
	mov qword [rbp - 72], rbx
	jmp L_139
L_139:
	mov rbx, qword [_global_m]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 80]
	cmp byte [rbp - 80], 0
	jz L_141
L_140:
	call _global_lyk
	mov rbx, rax
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 88]
	mov rcx, 2
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 96], rdx
	mov rbx, qword [rbp - 96]
	mov qword [_global_op], rbx
	mov rsi, qword [_global_n]
	mov rdi, 1
	call _global_RandRange
	mov rbx, rax
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 104]
	mov qword [_global_pl], rbx
	mov rsi, qword [_global_n]
	mov rdi, 1
	call _global_RandRange
	mov rbx, rax
	mov qword [rbp - 112], rbx
	mov rbx, qword [rbp - 112]
	mov qword [_global_pr], rbx
	jmp L_142
L_142:
	mov rbx, qword [_global_pr]
	mov rcx, qword [_global_pl]
	cmp rbx, rcx
	setle byte [rbp - 120]
	cmp byte [rbp - 120], 0
	jz L_144
L_143:
	mov rsi, qword [_global_n]
	mov rdi, 1
	call _global_RandRange
	mov rbx, rax
	mov qword [rbp - 128], rbx
	mov rbx, qword [rbp - 128]
	mov qword [_global_pr], rbx
	jmp L_142
L_144:
	mov rbx, qword [_global_op]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 136]
	cmp byte [rbp - 136], 0
	jz L_146
L_145:
	mov rdx, qword [_global_n]
	mov rsi, 1
	mov rdi, 1
	call _global_update
	mov rbx, rax
	mov qword [rbp - 144], rbx
	jmp L_146
L_146:
	mov rbx, qword [_global_op]
	mov rcx, 1
	cmp rbx, rcx
	sete byte [rbp - 152]
	cmp byte [rbp - 152], 0
	jz L_148
L_147:
	mov rdx, qword [_global_n]
	mov rsi, 1
	mov rdi, 1
	call _global_query
	mov rbx, rax
	mov qword [rbp - 160], rbx
	mov rbx, qword [_global_ans]
	mov rcx, qword [rbp - 160]
	mov qword [rbp - 168], rbx
	add qword [rbp - 168], rcx
	mov rbx, qword [rbp - 168]
	mov rcx, qword [_global_MOD]
	mov rax, rbx
	cdq
	idiv rcx
	mov qword [rbp - 176], rdx
	mov rbx, qword [rbp - 176]
	mov qword [_global_ans], rbx
	jmp L_148
L_148:
	mov rbx, qword [_global_m]
	mov qword [rbp - 184], rbx
	dec qword [_global_m]
	jmp L_139
L_141:
	mov rdi, qword [_global_ans]
	call toString
	mov rbx, rax
	mov qword [rbp - 192], rbx
	mov rdi, qword [rbp - 192]
	call print
	mov rbx, rax
	mov qword [rbp - 200], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_135
L_135:
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
_global_n: dq 0
_global_m: dq 0
_global_p: dq 0
_global_op: dq 0
_global_L: dq 0
_global_ans: dq 0
_global_aa: dq 0
_global_bb: dq 0
_global_MOD: dq 0
_global_no: dq 0
_global_pl: dq 0
_global_pr: dq 0
SECTION .bss
stringbuffer: resb 256
_global_b: dq 0
_global_now: dq 0
_global_t: dq 0
_global_a: dq 0
_global_flag: dq 0
_global_s: dq 0
_global_sum: dq 0
