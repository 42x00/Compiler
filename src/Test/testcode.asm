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

global _check
global main

SECTION .text
_check:
	push rbp
	mov rbp, rsp
	sub rsp, 48
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	setl byte [rbp - 32]
	jmp L_4
L_4:
	cmp byte [rbp - 32], 0
	jz L_3
L_5:
	mov rbx, qword [rbp - 8]
	mov rcx, 0
	cmp rbx, rcx
	setge byte [rbp - 40]
	jmp L_6
L_6:
	cmp byte [rbp - 40], 0
	jz L_3
L_7:
	mov rbx, 1
	mov qword [rbp - 24], rbx
	jmp L_2
L_2:
	mov rbx, qword [rbp - 24]
	mov rax, rbx
	jmp L_1
L_1:
	leave
	ret
L_3:
	mov rbx, 0
	mov qword [rbp - 24], rbx
	jmp L_2
main:
	push rbp
	mov rbp, rsp
	sub rsp, 1496
	call getInt
	mov rbx, rax
	mov qword [rbp - 136], rbx
	mov rbx, qword [rbp - 136]
	mov qword [rbp - 8], rbx
	mov rbx, 0
	mov qword [rbp - 16], rbx
	mov rbx, 0
	mov qword [rbp - 56], rbx
	mov rbx, 0
	mov qword [rbp - 24], rbx
	mov rbx, 0
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 144], rbx
	sub qword [rbp - 144], rcx
	mov rbx, qword [rbp - 144]
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 152], rbx
	sub qword [rbp - 152], rcx
	mov rbx, qword [rbp - 152]
	mov qword [rbp - 48], rbx
	mov rbx, 0
	mov qword [rbp - 80], rbx
	mov rbx, 0
	mov qword [rbp - 88], rbx
	mov rbx, 0
	mov qword [rbp - 72], rbx
	mov rbx, 0
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 8]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 168], rax
	mov rbx, qword [rbp - 168]
	mov rcx, 3
	mov qword [rbp - 160], rbx
	sal qword [rbp - 160], cl
	mov rbx, qword [rbp - 160]
	mov rcx, 8
	mov qword [rbp - 160], rbx
	add qword [rbp - 160], rcx
	mov rdi, qword [rbp - 160]
	call malloc
	mov rbx, qword [rbp - 168]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 160], rbx
	add qword [rbp - 160], rcx
	mov rbx, qword [rbp - 160]
	mov qword [rbp - 96], rbx
	mov rbx, 0
	mov qword [rbp - 120], rbx
	jmp L_10
L_10:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 8]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 176], rax
	mov rbx, qword [rbp - 120]
	mov rcx, qword [rbp - 176]
	cmp rbx, rcx
	setl byte [rbp - 184]
	cmp byte [rbp - 184], 0
	jz L_12
L_11:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 120]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 120]
	mov qword [rbp - 192], rbx
	inc qword [rbp - 120]
	jmp L_10
L_12:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 8]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 208], rax
	mov rbx, qword [rbp - 208]
	mov rcx, 3
	mov qword [rbp - 200], rbx
	sal qword [rbp - 200], cl
	mov rbx, qword [rbp - 200]
	mov rcx, 8
	mov qword [rbp - 200], rbx
	add qword [rbp - 200], rcx
	mov rdi, qword [rbp - 200]
	call malloc
	mov rbx, qword [rbp - 208]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 200], rbx
	add qword [rbp - 200], rcx
	mov rbx, qword [rbp - 200]
	mov qword [rbp - 104], rbx
	mov rbx, 0
	mov qword [rbp - 120], rbx
	jmp L_13
L_13:
	mov rbx, qword [rbp - 8]
	mov rcx, qword [rbp - 8]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 216], rax
	mov rbx, qword [rbp - 120]
	mov rcx, qword [rbp - 216]
	cmp rbx, rcx
	setl byte [rbp - 224]
	cmp byte [rbp - 224], 0
	jz L_15
L_14:
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 120]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 120]
	mov qword [rbp - 232], rbx
	inc qword [rbp - 120]
	jmp L_13
L_15:
	mov rbx, qword [rbp - 8]
	mov rcx, 3
	mov qword [rbp - 240], rbx
	sal qword [rbp - 240], cl
	mov rbx, qword [rbp - 240]
	mov rcx, 8
	mov qword [rbp - 240], rbx
	add qword [rbp - 240], rcx
	mov rdi, qword [rbp - 240]
	call malloc
	mov rbx, qword [rbp - 8]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 240], rbx
	add qword [rbp - 240], rcx
	mov rbx, qword [rbp - 240]
	mov qword [rbp - 112], rbx
	mov rbx, 0
	mov qword [rbp - 120], rbx
	jmp L_16
L_16:
	mov rbx, qword [rbp - 120]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 248]
	cmp byte [rbp - 248], 0
	jz L_18
L_17:
	mov rbx, qword [rbp - 8]
	mov rcx, 3
	mov qword [rbp - 256], rbx
	sal qword [rbp - 256], cl
	mov rbx, qword [rbp - 256]
	mov rcx, 8
	mov qword [rbp - 256], rbx
	add qword [rbp - 256], rcx
	mov rdi, qword [rbp - 256]
	call malloc
	mov rbx, qword [rbp - 8]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 256], rbx
	add qword [rbp - 256], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 120]
	mov r11, rbx
	mov rbx, qword [rbp - 256]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 128], rbx
	jmp L_19
L_19:
	mov rbx, qword [rbp - 128]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 264]
	cmp byte [rbp - 264], 0
	jz L_21
L_20:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 120]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 280], rbx
	mov rbx, qword [rbp - 280]
	mov r10, rbx
	mov rbx, qword [rbp - 128]
	mov r11, rbx
	mov rbx, -1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 128]
	mov qword [rbp - 288], rbx
	inc qword [rbp - 128]
	jmp L_19
L_21:
	mov rbx, qword [rbp - 120]
	mov qword [rbp - 296], rbx
	inc qword [rbp - 120]
	jmp L_16
L_18:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 24]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 32]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 304], rbx
	mov rbx, qword [rbp - 304]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_22
L_22:
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	setle byte [rbp - 312]
	cmp byte [rbp - 312], 0
	jz L_24
L_23:
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 320], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 328], rbx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 328]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 336], rbx
	mov rbx, qword [rbp - 336]
	mov r10, rbx
	mov rbx, qword [rbp - 320]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 344], rbx
	mov rbx, qword [rbp - 344]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 352], rbx
	mov rbx, qword [rbp - 352]
	mov rcx, 1
	mov qword [rbp - 360], rbx
	sub qword [rbp - 360], rcx
	mov rbx, qword [rbp - 360]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 368], rbx
	mov rbx, qword [rbp - 368]
	mov rcx, 2
	mov qword [rbp - 376], rbx
	sub qword [rbp - 376], rcx
	mov rbx, qword [rbp - 376]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 400], rbx
	jmp L_31
L_31:
	cmp byte [rbp - 400], 0
	jz L_30
L_32:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 408], rbx
	jmp L_33
L_33:
	cmp byte [rbp - 408], 0
	jz L_30
L_34:
	mov rbx, 1
	mov qword [rbp - 392], rbx
	jmp L_28
L_28:
	cmp byte [rbp - 392], 0
	jz L_27
L_29:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 424], rbx
	mov rbx, qword [rbp - 424]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 432]
	jmp L_35
L_35:
	cmp byte [rbp - 432], 0
	jz L_27
L_36:
	mov rbx, 1
	mov qword [rbp - 384], rbx
	cmp byte [rbp - 384], 0
	jz L_26
L_25:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 440], rbx
	add qword [rbp - 440], rcx
	mov rbx, qword [rbp - 440]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 448], rbx
	add qword [rbp - 448], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 456], rbx
	mov rbx, qword [rbp - 456]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 448]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 472]
	jmp L_40
L_40:
	cmp byte [rbp - 472], 0
	jz L_39
L_41:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 480]
	jmp L_42
L_42:
	cmp byte [rbp - 480], 0
	jz L_39
L_43:
	mov rbx, 1
	mov qword [rbp - 464], rbx
	cmp byte [rbp - 464], 0
	jz L_38
L_37:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_38
L_38:
	jmp L_26
L_26:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 488], rbx
	mov rbx, qword [rbp - 488]
	mov rcx, 1
	mov qword [rbp - 496], rbx
	sub qword [rbp - 496], rcx
	mov rbx, qword [rbp - 496]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 504], rbx
	mov rbx, qword [rbp - 504]
	mov rcx, 2
	mov qword [rbp - 512], rbx
	add qword [rbp - 512], rcx
	mov rbx, qword [rbp - 512]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 536], rbx
	jmp L_50
L_50:
	cmp byte [rbp - 536], 0
	jz L_49
L_51:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 544], rbx
	jmp L_52
L_52:
	cmp byte [rbp - 544], 0
	jz L_49
L_53:
	mov rbx, 1
	mov qword [rbp - 528], rbx
	jmp L_47
L_47:
	cmp byte [rbp - 528], 0
	jz L_46
L_48:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 560], rbx
	mov rbx, qword [rbp - 560]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 568]
	jmp L_54
L_54:
	cmp byte [rbp - 568], 0
	jz L_46
L_55:
	mov rbx, 1
	mov qword [rbp - 520], rbx
	cmp byte [rbp - 520], 0
	jz L_45
L_44:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 576], rbx
	add qword [rbp - 576], rcx
	mov rbx, qword [rbp - 576]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 584], rbx
	add qword [rbp - 584], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 592], rbx
	mov rbx, qword [rbp - 592]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 584]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 608]
	jmp L_59
L_59:
	cmp byte [rbp - 608], 0
	jz L_58
L_60:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 616]
	jmp L_61
L_61:
	cmp byte [rbp - 616], 0
	jz L_58
L_62:
	mov rbx, 1
	mov qword [rbp - 600], rbx
	cmp byte [rbp - 600], 0
	jz L_57
L_56:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_57
L_57:
	jmp L_45
L_45:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 624], rbx
	mov rbx, qword [rbp - 624]
	mov rcx, 1
	mov qword [rbp - 632], rbx
	add qword [rbp - 632], rcx
	mov rbx, qword [rbp - 632]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 640], rbx
	mov rbx, qword [rbp - 640]
	mov rcx, 2
	mov qword [rbp - 648], rbx
	sub qword [rbp - 648], rcx
	mov rbx, qword [rbp - 648]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 672], rbx
	jmp L_69
L_69:
	cmp byte [rbp - 672], 0
	jz L_68
L_70:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 680], rbx
	jmp L_71
L_71:
	cmp byte [rbp - 680], 0
	jz L_68
L_72:
	mov rbx, 1
	mov qword [rbp - 664], rbx
	jmp L_66
L_66:
	cmp byte [rbp - 664], 0
	jz L_65
L_67:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 696], rbx
	mov rbx, qword [rbp - 696]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 704]
	jmp L_73
L_73:
	cmp byte [rbp - 704], 0
	jz L_65
L_74:
	mov rbx, 1
	mov qword [rbp - 656], rbx
	cmp byte [rbp - 656], 0
	jz L_64
L_63:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 712], rbx
	add qword [rbp - 712], rcx
	mov rbx, qword [rbp - 712]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 720], rbx
	add qword [rbp - 720], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 728], rbx
	mov rbx, qword [rbp - 728]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 720]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 744]
	jmp L_78
L_78:
	cmp byte [rbp - 744], 0
	jz L_77
L_79:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 752]
	jmp L_80
L_80:
	cmp byte [rbp - 752], 0
	jz L_77
L_81:
	mov rbx, 1
	mov qword [rbp - 736], rbx
	cmp byte [rbp - 736], 0
	jz L_76
L_75:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_76
L_76:
	jmp L_64
L_64:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 760], rbx
	mov rbx, qword [rbp - 760]
	mov rcx, 1
	mov qword [rbp - 768], rbx
	add qword [rbp - 768], rcx
	mov rbx, qword [rbp - 768]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 776], rbx
	mov rbx, qword [rbp - 776]
	mov rcx, 2
	mov qword [rbp - 784], rbx
	add qword [rbp - 784], rcx
	mov rbx, qword [rbp - 784]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 808], rbx
	jmp L_88
L_88:
	cmp byte [rbp - 808], 0
	jz L_87
L_89:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 816], rbx
	jmp L_90
L_90:
	cmp byte [rbp - 816], 0
	jz L_87
L_91:
	mov rbx, 1
	mov qword [rbp - 800], rbx
	jmp L_85
L_85:
	cmp byte [rbp - 800], 0
	jz L_84
L_86:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 832], rbx
	mov rbx, qword [rbp - 832]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 840]
	jmp L_92
L_92:
	cmp byte [rbp - 840], 0
	jz L_84
L_93:
	mov rbx, 1
	mov qword [rbp - 792], rbx
	cmp byte [rbp - 792], 0
	jz L_83
L_82:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 848], rbx
	add qword [rbp - 848], rcx
	mov rbx, qword [rbp - 848]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 856], rbx
	add qword [rbp - 856], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 864], rbx
	mov rbx, qword [rbp - 864]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 856]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 880]
	jmp L_97
L_97:
	cmp byte [rbp - 880], 0
	jz L_96
L_98:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 888]
	jmp L_99
L_99:
	cmp byte [rbp - 888], 0
	jz L_96
L_100:
	mov rbx, 1
	mov qword [rbp - 872], rbx
	cmp byte [rbp - 872], 0
	jz L_95
L_94:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_95
L_95:
	jmp L_83
L_83:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 896], rbx
	mov rbx, qword [rbp - 896]
	mov rcx, 2
	mov qword [rbp - 904], rbx
	sub qword [rbp - 904], rcx
	mov rbx, qword [rbp - 904]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 912], rbx
	mov rbx, qword [rbp - 912]
	mov rcx, 1
	mov qword [rbp - 920], rbx
	sub qword [rbp - 920], rcx
	mov rbx, qword [rbp - 920]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 944], rbx
	jmp L_107
L_107:
	cmp byte [rbp - 944], 0
	jz L_106
L_108:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 952], rbx
	jmp L_109
L_109:
	cmp byte [rbp - 952], 0
	jz L_106
L_110:
	mov rbx, 1
	mov qword [rbp - 936], rbx
	jmp L_104
L_104:
	cmp byte [rbp - 936], 0
	jz L_103
L_105:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 968], rbx
	mov rbx, qword [rbp - 968]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 976]
	jmp L_111
L_111:
	cmp byte [rbp - 976], 0
	jz L_103
L_112:
	mov rbx, 1
	mov qword [rbp - 928], rbx
	cmp byte [rbp - 928], 0
	jz L_102
L_101:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 984], rbx
	add qword [rbp - 984], rcx
	mov rbx, qword [rbp - 984]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 992], rbx
	add qword [rbp - 992], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1000], rbx
	mov rbx, qword [rbp - 1000]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 992]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 1016]
	jmp L_116
L_116:
	cmp byte [rbp - 1016], 0
	jz L_115
L_117:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 1024]
	jmp L_118
L_118:
	cmp byte [rbp - 1024], 0
	jz L_115
L_119:
	mov rbx, 1
	mov qword [rbp - 1008], rbx
	cmp byte [rbp - 1008], 0
	jz L_114
L_113:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_114
L_114:
	jmp L_102
L_102:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1032], rbx
	mov rbx, qword [rbp - 1032]
	mov rcx, 2
	mov qword [rbp - 1040], rbx
	sub qword [rbp - 1040], rcx
	mov rbx, qword [rbp - 1040]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1048], rbx
	mov rbx, qword [rbp - 1048]
	mov rcx, 1
	mov qword [rbp - 1056], rbx
	add qword [rbp - 1056], rcx
	mov rbx, qword [rbp - 1056]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 1080], rbx
	jmp L_126
L_126:
	cmp byte [rbp - 1080], 0
	jz L_125
L_127:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 1088], rbx
	jmp L_128
L_128:
	cmp byte [rbp - 1088], 0
	jz L_125
L_129:
	mov rbx, 1
	mov qword [rbp - 1072], rbx
	jmp L_123
L_123:
	cmp byte [rbp - 1072], 0
	jz L_122
L_124:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1104], rbx
	mov rbx, qword [rbp - 1104]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 1112]
	jmp L_130
L_130:
	cmp byte [rbp - 1112], 0
	jz L_122
L_131:
	mov rbx, 1
	mov qword [rbp - 1064], rbx
	cmp byte [rbp - 1064], 0
	jz L_121
L_120:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 1120], rbx
	add qword [rbp - 1120], rcx
	mov rbx, qword [rbp - 1120]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 1128], rbx
	add qword [rbp - 1128], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1136], rbx
	mov rbx, qword [rbp - 1136]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 1128]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 1152]
	jmp L_135
L_135:
	cmp byte [rbp - 1152], 0
	jz L_134
L_136:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 1160]
	jmp L_137
L_137:
	cmp byte [rbp - 1160], 0
	jz L_134
L_138:
	mov rbx, 1
	mov qword [rbp - 1144], rbx
	cmp byte [rbp - 1144], 0
	jz L_133
L_132:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_133
L_133:
	jmp L_121
L_121:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1168], rbx
	mov rbx, qword [rbp - 1168]
	mov rcx, 2
	mov qword [rbp - 1176], rbx
	add qword [rbp - 1176], rcx
	mov rbx, qword [rbp - 1176]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1184], rbx
	mov rbx, qword [rbp - 1184]
	mov rcx, 1
	mov qword [rbp - 1192], rbx
	sub qword [rbp - 1192], rcx
	mov rbx, qword [rbp - 1192]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 1216], rbx
	jmp L_145
L_145:
	cmp byte [rbp - 1216], 0
	jz L_144
L_146:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 1224], rbx
	jmp L_147
L_147:
	cmp byte [rbp - 1224], 0
	jz L_144
L_148:
	mov rbx, 1
	mov qword [rbp - 1208], rbx
	jmp L_142
L_142:
	cmp byte [rbp - 1208], 0
	jz L_141
L_143:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1240], rbx
	mov rbx, qword [rbp - 1240]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 1248]
	jmp L_149
L_149:
	cmp byte [rbp - 1248], 0
	jz L_141
L_150:
	mov rbx, 1
	mov qword [rbp - 1200], rbx
	cmp byte [rbp - 1200], 0
	jz L_140
L_139:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 1256], rbx
	add qword [rbp - 1256], rcx
	mov rbx, qword [rbp - 1256]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 1264], rbx
	add qword [rbp - 1264], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1272], rbx
	mov rbx, qword [rbp - 1272]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 1264]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 1288]
	jmp L_154
L_154:
	cmp byte [rbp - 1288], 0
	jz L_153
L_155:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 1296]
	jmp L_156
L_156:
	cmp byte [rbp - 1296], 0
	jz L_153
L_157:
	mov rbx, 1
	mov qword [rbp - 1280], rbx
	cmp byte [rbp - 1280], 0
	jz L_152
L_151:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_152
L_152:
	jmp L_140
L_140:
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1304], rbx
	mov rbx, qword [rbp - 1304]
	mov rcx, 2
	mov qword [rbp - 1312], rbx
	add qword [rbp - 1312], rcx
	mov rbx, qword [rbp - 1312]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1320], rbx
	mov rbx, qword [rbp - 1320]
	mov rcx, 1
	mov qword [rbp - 1328], rbx
	add qword [rbp - 1328], rcx
	mov rbx, qword [rbp - 1328]
	mov qword [rbp - 88], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 80]
	call _check
	mov rbx, rax
	mov qword [rbp - 1352], rbx
	jmp L_164
L_164:
	cmp byte [rbp - 1352], 0
	jz L_163
L_165:
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 88]
	call _check
	mov rbx, rax
	mov qword [rbp - 1360], rbx
	jmp L_166
L_166:
	cmp byte [rbp - 1360], 0
	jz L_163
L_167:
	mov rbx, 1
	mov qword [rbp - 1344], rbx
	jmp L_161
L_161:
	cmp byte [rbp - 1344], 0
	jz L_160
L_162:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1376], rbx
	mov rbx, qword [rbp - 1376]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, -1
	cmp rbx, rcx
	sete byte [rbp - 1384]
	jmp L_168
L_168:
	cmp byte [rbp - 1384], 0
	jz L_160
L_169:
	mov rbx, 1
	mov qword [rbp - 1336], rbx
	cmp byte [rbp - 1336], 0
	jz L_159
L_158:
	mov rbx, qword [rbp - 56]
	mov rcx, 1
	mov qword [rbp - 1392], rbx
	add qword [rbp - 1392], rcx
	mov rbx, qword [rbp - 1392]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 56]
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, 1
	mov qword [rbp - 1400], rbx
	add qword [rbp - 1400], rcx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1408], rbx
	mov rbx, qword [rbp - 1408]
	mov r10, rbx
	mov rbx, qword [rbp - 88]
	mov r11, rbx
	mov rbx, qword [rbp - 1400]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete byte [rbp - 1424]
	jmp L_173
L_173:
	cmp byte [rbp - 1424], 0
	jz L_172
L_174:
	mov rbx, qword [rbp - 88]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	sete byte [rbp - 1432]
	jmp L_175
L_175:
	cmp byte [rbp - 1432], 0
	jz L_172
L_176:
	mov rbx, 1
	mov qword [rbp - 1416], rbx
	cmp byte [rbp - 1416], 0
	jz L_171
L_170:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_171
L_171:
	jmp L_159
L_159:
	mov rbx, qword [rbp - 64]
	mov rcx, 1
	cmp rbx, rcx
	sete byte [rbp - 1440]
	cmp byte [rbp - 1440], 0
	jz L_178
L_177:
	jmp L_24
L_24:
	mov rbx, qword [rbp - 64]
	mov rcx, 1
	cmp rbx, rcx
	sete byte [rbp - 1456]
	cmp byte [rbp - 1456], 0
	jz L_180
L_179:
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 40]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1464], rbx
	mov rbx, qword [rbp - 1464]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rdi, qword [r10 + r11*8]
	call toString
	mov rbx, rax
	mov qword [rbp - 1472], rbx
	mov rdi, qword [rbp - 1472]
	call puts
	mov rbx, rax
	mov qword [rbp - 1480], rbx
	jmp L_181
L_181:
	mov rbx, 0
	mov rax, rbx
	jmp L_9
L_9:
	leave
	ret
L_180:
	mov rdi, _string_0
	call print
	mov rbx, rax
	mov qword [rbp - 1488], rbx
	jmp L_181
	jmp L_178
L_178:
	mov rbx, qword [rbp - 16]
	mov rcx, 1
	mov qword [rbp - 1448], rbx
	add qword [rbp - 1448], rcx
	mov rbx, qword [rbp - 1448]
	mov qword [rbp - 16], rbx
	jmp L_22
L_172:
	mov rbx, 0
	mov qword [rbp - 1416], rbx
	jmp L_171
L_160:
	mov rbx, 0
	mov qword [rbp - 1336], rbx
	jmp L_159
L_163:
	mov rbx, 0
	mov qword [rbp - 1344], rbx
	jmp L_161
L_153:
	mov rbx, 0
	mov qword [rbp - 1280], rbx
	jmp L_152
L_141:
	mov rbx, 0
	mov qword [rbp - 1200], rbx
	jmp L_140
L_144:
	mov rbx, 0
	mov qword [rbp - 1208], rbx
	jmp L_142
L_134:
	mov rbx, 0
	mov qword [rbp - 1144], rbx
	jmp L_133
L_122:
	mov rbx, 0
	mov qword [rbp - 1064], rbx
	jmp L_121
L_125:
	mov rbx, 0
	mov qword [rbp - 1072], rbx
	jmp L_123
L_115:
	mov rbx, 0
	mov qword [rbp - 1008], rbx
	jmp L_114
L_103:
	mov rbx, 0
	mov qword [rbp - 928], rbx
	jmp L_102
L_106:
	mov rbx, 0
	mov qword [rbp - 936], rbx
	jmp L_104
L_96:
	mov rbx, 0
	mov qword [rbp - 872], rbx
	jmp L_95
L_84:
	mov rbx, 0
	mov qword [rbp - 792], rbx
	jmp L_83
L_87:
	mov rbx, 0
	mov qword [rbp - 800], rbx
	jmp L_85
L_77:
	mov rbx, 0
	mov qword [rbp - 736], rbx
	jmp L_76
L_65:
	mov rbx, 0
	mov qword [rbp - 656], rbx
	jmp L_64
L_68:
	mov rbx, 0
	mov qword [rbp - 664], rbx
	jmp L_66
L_58:
	mov rbx, 0
	mov qword [rbp - 600], rbx
	jmp L_57
L_46:
	mov rbx, 0
	mov qword [rbp - 520], rbx
	jmp L_45
L_49:
	mov rbx, 0
	mov qword [rbp - 528], rbx
	jmp L_47
L_39:
	mov rbx, 0
	mov qword [rbp - 464], rbx
	jmp L_38
L_27:
	mov rbx, 0
	mov qword [rbp - 384], rbx
	jmp L_26
L_30:
	mov rbx, 0
	mov qword [rbp - 392], rbx
	jmp L_28
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
_string_0_size: dq 13
_string_0: db 110, 111, 32, 115, 111, 108, 117, 116, 105, 111, 110, 33, 10, 0
SECTION .bss
stringbuffer: resb 256
