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

global _global_make
global _global_color
global _global_count
global _global_i
global _global_j
global _global_origin
global _global_search
global main

SECTION .text
_global_origin:
	push rbp
	mov rbp, rsp
	sub rsp, 72
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 8]
	mov rcx, 3
	mov qword [rbp - 16], rbx
	sal qword [rbp - 16], cl
	mov rbx, qword [rbp - 16]
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rdi, qword [rbp - 16]
	call malloc
	mov rbx, qword [rbp - 8]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov qword [_global_make], rbx
	mov rbx, 0
	mov qword [_global_i], rbx
	jmp L_2
L_2:
	mov rbx, qword [_global_i]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_4
L_3:
	mov rbx, qword [rbp - 8]
	mov rcx, 3
	mov qword [rbp - 32], rbx
	sal qword [rbp - 32], cl
	mov rbx, qword [rbp - 32]
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rdi, qword [rbp - 32]
	call malloc
	mov rbx, qword [rbp - 8]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov r10, qword [_global_make]
		mov r11, qword [_global_i]
		mov rbx, qword [rbp - 32]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [_global_j], rbx
	jmp L_5
L_5:
	mov rbx, qword [_global_j]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_7
L_6:
	mov r10, qword [_global_make]
		mov r11, qword [_global_i]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov r10, qword [rbp - 48]
		mov r11, qword [_global_j]
		mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_global_j]
	mov qword [rbp - 56], rbx
	inc qword [_global_j]
	jmp L_5
L_7:
	mov rbx, qword [_global_i]
	mov qword [rbp - 64], rbx
	inc qword [_global_i]
	jmp L_2
L_4:
	mov rax, 0
		jmp L_1
L_1:
	leave
	ret
_global_search:
	push rbp
	mov rbp, rsp
	sub rsp, 1344
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 80]
	jmp L_20
L_20:
	cmp byte [rbp - 80], 0
	jz L_21
L_19:
	mov rbx, 1
	mov qword [rbp - 72], rbx
	jmp L_17
L_17:
	cmp byte [rbp - 72], 0
	jz L_18
L_16:
	mov rbx, 1
	mov qword [rbp - 64], rbx
	jmp L_14
L_14:
	cmp byte [rbp - 64], 0
	jz L_15
L_13:
	mov rbx, 1
	mov qword [rbp - 56], rbx
	jmp L_11
L_11:
	mov rbx, qword [rbp - 8]
	mov rcx, 2
	cmp rbx, rcx
	sete byte [rbp - 208]
	jmp L_32
L_32:
	cmp byte [rbp - 208], 0
	jz L_31
L_33:
	mov rbx, qword [rbp - 16]
	mov rcx, 2
	cmp rbx, rcx
	sete byte [rbp - 216]
	jmp L_34
L_34:
	cmp byte [rbp - 216], 0
	jz L_31
L_35:
	mov rbx, 1
	mov qword [rbp - 200], rbx
	cmp byte [rbp - 200], 0
	jz L_29
L_28:
	mov rbx, 45
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 224], rbx
	sub qword [rbp - 224], rcx
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 232], rbx
	mov r10, qword [rbp - 232]
		mov r11, 2
		mov rbx, qword [rbp - 224]
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 240], rbx
	mov r10, qword [rbp - 240]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 248], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 256], rbx
	mov r10, qword [rbp - 256]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 264], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 272], rbx
	mov r10, qword [rbp - 272]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 280], rbx
	mov rbx, qword [rbp - 280]
	mov rcx, qword [rbp - 264]
	mov qword [rbp - 288], rbx
	add qword [rbp - 288], rcx
	mov rbx, qword [rbp - 288]
	mov rcx, qword [rbp - 248]
	mov qword [rbp - 296], rbx
	add qword [rbp - 296], rcx
	mov rbx, qword [rbp - 296]
	mov qword [rbp - 32], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 352], rbx
	mov r10, qword [rbp - 352]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 360], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 368], rbx
	mov r10, qword [rbp - 368]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 376], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 384], rbx
	mov r10, qword [rbp - 384]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 392], rbx
	mov rbx, qword [rbp - 392]
	mov rcx, qword [rbp - 376]
	mov qword [rbp - 400], rbx
	add qword [rbp - 400], rcx
	mov rbx, qword [rbp - 400]
	mov rcx, qword [rbp - 360]
	mov qword [rbp - 408], rbx
	add qword [rbp - 408], rcx
	mov rbx, qword [rbp - 408]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 416]
	jmp L_54
L_54:
	cmp byte [rbp - 416], 0
	jz L_53
L_55:
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 424], rbx
	mov r10, qword [rbp - 424]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 432], rbx
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 440], rbx
	mov r10, qword [rbp - 440]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 448], rbx
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 456], rbx
	mov r10, qword [rbp - 456]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 464], rbx
	mov rbx, qword [rbp - 464]
	mov rcx, qword [rbp - 448]
	mov qword [rbp - 472], rbx
	add qword [rbp - 472], rcx
	mov rbx, qword [rbp - 472]
	mov rcx, qword [rbp - 432]
	mov qword [rbp - 480], rbx
	add qword [rbp - 480], rcx
	mov rbx, qword [rbp - 480]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 488]
	jmp L_56
L_56:
	cmp byte [rbp - 488], 0
	jz L_53
L_57:
	mov rbx, 1
	mov qword [rbp - 344], rbx
	jmp L_51
L_51:
	cmp byte [rbp - 344], 0
	jz L_50
L_52:
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 496], rbx
	mov r10, qword [rbp - 496]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 504], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 512], rbx
	mov r10, qword [rbp - 512]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 520], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 528], rbx
	mov r10, qword [rbp - 528]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 536], rbx
	mov rbx, qword [rbp - 536]
	mov rcx, qword [rbp - 520]
	mov qword [rbp - 544], rbx
	add qword [rbp - 544], rcx
	mov rbx, qword [rbp - 544]
	mov rcx, qword [rbp - 504]
	mov qword [rbp - 552], rbx
	add qword [rbp - 552], rcx
	mov rbx, qword [rbp - 552]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 560]
	jmp L_58
L_58:
	cmp byte [rbp - 560], 0
	jz L_50
L_59:
	mov rbx, 1
	mov qword [rbp - 336], rbx
	jmp L_48
L_48:
	cmp byte [rbp - 336], 0
	jz L_47
L_49:
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 568], rbx
	mov r10, qword [rbp - 568]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 576], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 584], rbx
	mov r10, qword [rbp - 584]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 592], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 600], rbx
	mov r10, qword [rbp - 600]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 608], rbx
	mov rbx, qword [rbp - 608]
	mov rcx, qword [rbp - 592]
	mov qword [rbp - 616], rbx
	add qword [rbp - 616], rcx
	mov rbx, qword [rbp - 616]
	mov rcx, qword [rbp - 576]
	mov qword [rbp - 624], rbx
	add qword [rbp - 624], rcx
	mov rbx, qword [rbp - 624]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 632]
	jmp L_60
L_60:
	cmp byte [rbp - 632], 0
	jz L_47
L_61:
	mov rbx, 1
	mov qword [rbp - 328], rbx
	jmp L_45
L_45:
	cmp byte [rbp - 328], 0
	jz L_44
L_46:
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 640], rbx
	mov r10, qword [rbp - 640]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 648], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 656], rbx
	mov r10, qword [rbp - 656]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 664], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 672], rbx
	mov r10, qword [rbp - 672]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 680], rbx
	mov rbx, qword [rbp - 680]
	mov rcx, qword [rbp - 664]
	mov qword [rbp - 688], rbx
	add qword [rbp - 688], rcx
	mov rbx, qword [rbp - 688]
	mov rcx, qword [rbp - 648]
	mov qword [rbp - 696], rbx
	add qword [rbp - 696], rcx
	mov rbx, qword [rbp - 696]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 704]
	jmp L_62
L_62:
	cmp byte [rbp - 704], 0
	jz L_44
L_63:
	mov rbx, 1
	mov qword [rbp - 320], rbx
	jmp L_42
L_42:
	cmp byte [rbp - 320], 0
	jz L_41
L_43:
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 712], rbx
	mov r10, qword [rbp - 712]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 720], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 728], rbx
	mov r10, qword [rbp - 728]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 736], rbx
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 744], rbx
	mov r10, qword [rbp - 744]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 752], rbx
	mov rbx, qword [rbp - 752]
	mov rcx, qword [rbp - 736]
	mov qword [rbp - 760], rbx
	add qword [rbp - 760], rcx
	mov rbx, qword [rbp - 760]
	mov rcx, qword [rbp - 720]
	mov qword [rbp - 768], rbx
	add qword [rbp - 768], rcx
	mov rbx, qword [rbp - 768]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 776]
	jmp L_64
L_64:
	cmp byte [rbp - 776], 0
	jz L_41
L_65:
	mov rbx, 1
	mov qword [rbp - 312], rbx
	jmp L_39
L_39:
	cmp byte [rbp - 312], 0
	jz L_38
L_40:
	mov r10, qword [_global_make]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 784], rbx
	mov r10, qword [rbp - 784]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 792], rbx
	mov r10, qword [_global_make]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 800], rbx
	mov r10, qword [rbp - 800]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 808], rbx
	mov r10, qword [_global_make]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 816], rbx
	mov r10, qword [rbp - 816]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 824], rbx
	mov rbx, qword [rbp - 824]
	mov rcx, qword [rbp - 808]
	mov qword [rbp - 832], rbx
	add qword [rbp - 832], rcx
	mov rbx, qword [rbp - 832]
	mov rcx, qword [rbp - 792]
	mov qword [rbp - 840], rbx
	add qword [rbp - 840], rcx
	mov rbx, qword [rbp - 840]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	sete byte [rbp - 848]
	jmp L_66
L_66:
	cmp byte [rbp - 848], 0
	jz L_38
L_67:
	mov rbx, 1
	mov qword [rbp - 304], rbx
	cmp byte [rbp - 304], 0
	jz L_37
L_36:
	mov r10, qword [_global_count]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 856], rbx
	mov rbx, qword [rbp - 856]
	mov rcx, 1
	mov qword [rbp - 864], rbx
	add qword [rbp - 864], rcx
	mov r10, qword [_global_count]
		mov r11, 0
		mov rbx, qword [rbp - 864]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 40], rbx
	jmp L_68
L_68:
	mov rbx, qword [rbp - 40]
	mov rcx, 2
	cmp rbx, rcx
	setle byte [rbp - 872]
	cmp byte [rbp - 872], 0
	jz L_70
L_69:
	mov rbx, 0
	mov qword [rbp - 48], rbx
	jmp L_71
L_71:
	mov rbx, qword [rbp - 48]
	mov rcx, 2
	cmp rbx, rcx
	setle byte [rbp - 880]
	cmp byte [rbp - 880], 0
	jz L_73
L_72:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 40]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 888], rbx
	mov r10, qword [rbp - 888]
		mov r11, qword [rbp - 48]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 896], rbx
	mov rdi, qword [rbp - 896]
	call toString
	mov qword [rbp - 904], rax
		mov rdi, qword [rbp - 904]
	call print
	mov qword [rbp - 912], rax
		mov rdi, _string_0
	call print
	mov qword [rbp - 920], rax
		mov rbx, qword [rbp - 48]
	mov qword [rbp - 928], rbx
	inc qword [rbp - 48]
	jmp L_71
L_73:
	mov rdi, _string_1
	call print
	mov qword [rbp - 936], rax
		mov rbx, qword [rbp - 40]
	mov qword [rbp - 944], rbx
	inc qword [rbp - 40]
	jmp L_68
L_70:
	mov rdi, _string_2
	call print
	mov qword [rbp - 952], rax
		jmp L_37
L_37:
	jmp L_30
L_30:
	jmp L_12
L_12:
	mov rax, 0
		jmp L_10
L_10:
	leave
	ret
L_38:
	mov rbx, 0
	mov qword [rbp - 304], rbx
	jmp L_37
L_41:
	mov rbx, 0
	mov qword [rbp - 312], rbx
	jmp L_39
L_44:
	mov rbx, 0
	mov qword [rbp - 320], rbx
	jmp L_42
L_47:
	mov rbx, 0
	mov qword [rbp - 328], rbx
	jmp L_45
L_50:
	mov rbx, 0
	mov qword [rbp - 336], rbx
	jmp L_48
L_53:
	mov rbx, 0
	mov qword [rbp - 344], rbx
	jmp L_51
L_29:
	mov rbx, qword [rbp - 16]
	mov rcx, 2
	cmp rbx, rcx
	sete byte [rbp - 960]
	cmp byte [rbp - 960], 0
	jz L_75
L_74:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 968], rbx
	mov r10, qword [rbp - 968]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 976], rbx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 984], rbx
	mov r10, qword [rbp - 984]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 992], rbx
	mov rbx, 15
	mov rcx, qword [rbp - 992]
	mov qword [rbp - 1000], rbx
	sub qword [rbp - 1000], rcx
	mov rbx, qword [rbp - 1000]
	mov rcx, qword [rbp - 976]
	mov qword [rbp - 1008], rbx
	sub qword [rbp - 1008], rcx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1016], rbx
	mov r10, qword [rbp - 1016]
		mov r11, qword [rbp - 16]
		mov rbx, qword [rbp - 1008]
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1040], rbx
	mov r10, qword [rbp - 1040]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1048], rbx
	mov rbx, qword [rbp - 1048]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 1056]
	jmp L_83
L_83:
	cmp byte [rbp - 1056], 0
	jz L_82
L_84:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1064], rbx
	mov r10, qword [rbp - 1064]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1072], rbx
	mov rbx, qword [rbp - 1072]
	mov rcx, 10
	cmp rbx, rcx
	setl byte [rbp - 1080]
	jmp L_85
L_85:
	cmp byte [rbp - 1080], 0
	jz L_82
L_86:
	mov rbx, 1
	mov qword [rbp - 1032], rbx
	jmp L_80
L_80:
	cmp byte [rbp - 1032], 0
	jz L_79
L_81:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1088], rbx
	mov r10, qword [rbp - 1088]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1096], rbx
	mov r10, qword [_global_color]
		mov r11, qword [rbp - 1096]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1104], rbx
	mov rbx, qword [rbp - 1104]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 1112]
	jmp L_87
L_87:
	cmp byte [rbp - 1112], 0
	jz L_79
L_88:
	mov rbx, 1
	mov qword [rbp - 1024], rbx
	cmp byte [rbp - 1024], 0
	jz L_78
L_77:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1120], rbx
	mov r10, qword [rbp - 1120]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1128], rbx
	mov r10, qword [_global_color]
		mov r11, qword [rbp - 1128]
		mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, 2
	cmp rbx, rcx
	sete byte [rbp - 1136]
	cmp byte [rbp - 1136], 0
	jz L_90
L_89:
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 1144], rbx
	add qword [rbp - 1144], rcx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1152], rbx
	mov r10, qword [rbp - 1152]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1160], rbx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 1160]
	mov qword [rbp - 1168], rbx
	add qword [rbp - 1168], rcx
	mov rdx, qword [rbp - 1168]
	mov rsi, 0
	mov rdi, qword [rbp - 1144]
	call _global_search
	mov qword [rbp - 1176], rax
		jmp L_91
L_91:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1224], rbx
	mov r10, qword [rbp - 1224]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1232], rbx
	mov r10, qword [_global_color]
		mov r11, qword [rbp - 1232]
		mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_78
L_78:
	jmp L_76
L_76:
	jmp L_30
L_90:
	mov rbx, qword [rbp - 16]
	mov rcx, 1
	mov qword [rbp - 1184], rbx
	add qword [rbp - 1184], rcx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1192], rbx
	mov r10, qword [rbp - 1192]
		mov r11, qword [rbp - 16]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1200], rbx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 1200]
	mov qword [rbp - 1208], rbx
	add qword [rbp - 1208], rcx
	mov rdx, qword [rbp - 1208]
	mov rsi, qword [rbp - 1184]
	mov rdi, qword [rbp - 8]
	call _global_search
	mov qword [rbp - 1216], rax
		jmp L_91
L_79:
	mov rbx, 0
	mov qword [rbp - 1024], rbx
	jmp L_78
L_82:
	mov rbx, 0
	mov qword [rbp - 1032], rbx
	jmp L_80
L_75:
	mov rbx, 1
	mov qword [rbp - 40], rbx
	jmp L_92
L_92:
	mov rbx, qword [rbp - 40]
	mov rcx, 9
	cmp rbx, rcx
	setle byte [rbp - 1240]
	cmp byte [rbp - 1240], 0
	jz L_94
L_93:
	mov r10, qword [_global_color]
		mov r11, qword [rbp - 40]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1248], rbx
	mov rbx, qword [rbp - 1248]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 1256]
	cmp byte [rbp - 1256], 0
	jz L_96
L_95:
	mov r10, qword [_global_color]
		mov r11, qword [rbp - 40]
		mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1264], rbx
	mov r10, qword [rbp - 1264]
		mov r11, qword [rbp - 16]
		mov rbx, qword [rbp - 40]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, 2
	cmp rbx, rcx
	sete byte [rbp - 1272]
	cmp byte [rbp - 1272], 0
	jz L_98
L_97:
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 1280], rbx
	add qword [rbp - 1280], rcx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 40]
	mov qword [rbp - 1288], rbx
	add qword [rbp - 1288], rcx
	mov rdx, qword [rbp - 1288]
	mov rsi, 0
	mov rdi, qword [rbp - 1280]
	call _global_search
	mov qword [rbp - 1296], rax
		jmp L_99
L_99:
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 8]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 1328], rbx
	mov r10, qword [rbp - 1328]
		mov r11, qword [rbp - 16]
		mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_color]
		mov r11, qword [rbp - 40]
		mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_96
L_96:
	mov rbx, qword [rbp - 40]
	mov qword [rbp - 1336], rbx
	inc qword [rbp - 40]
	jmp L_92
L_98:
	mov rbx, qword [rbp - 16]
	mov rcx, 1
	mov qword [rbp - 1304], rbx
	add qword [rbp - 1304], rcx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 40]
	mov qword [rbp - 1312], rbx
	add qword [rbp - 1312], rcx
	mov rdx, qword [rbp - 1312]
	mov rsi, qword [rbp - 1304]
	mov rdi, qword [rbp - 8]
	call _global_search
	mov qword [rbp - 1320], rax
		jmp L_99
L_94:
	jmp L_76
L_31:
	mov rbx, 0
	mov qword [rbp - 200], rbx
	jmp L_29
L_15:
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 104], rbx
	sub qword [rbp - 104], rcx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 104]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 112], rbx
	mov r10, qword [rbp - 112]
		mov r11, 2
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 128], rbx
	sub qword [rbp - 128], rcx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 128]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov r10, qword [rbp - 136]
		mov r11, 1
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, 1
	mov qword [rbp - 152], rbx
	sub qword [rbp - 152], rcx
	mov r10, qword [_global_make]
		mov r11, qword [rbp - 152]
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov r10, qword [rbp - 160]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 168]
	mov rcx, qword [rbp - 144]
	mov qword [rbp - 176], rbx
	add qword [rbp - 176], rcx
	mov rbx, qword [rbp - 176]
	mov rcx, qword [rbp - 120]
	mov qword [rbp - 184], rbx
	add qword [rbp - 184], rcx
	mov rbx, qword [rbp - 184]
	mov rcx, 15
	cmp rbx, rcx
	sete byte [rbp - 192]
	jmp L_26
L_26:
	cmp byte [rbp - 192], 0
	jnz L_13
L_27:
	mov rbx, 0
	mov qword [rbp - 56], rbx
	cmp byte [rbp - 56], 0
	jnz L_11
L_18:
	mov rbx, qword [rbp - 8]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 96]
	jmp L_24
L_24:
	cmp byte [rbp - 96], 0
	jnz L_16
L_25:
	mov rbx, 0
	mov qword [rbp - 64], rbx
	jmp L_14
L_21:
	mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	setl byte [rbp - 88]
	jmp L_22
L_22:
	cmp byte [rbp - 88], 0
	jnz L_19
L_23:
	mov rbx, 0
	mov qword [rbp - 72], rbx
	jmp L_17
main:
	push rbp
	mov rbp, rsp
	sub rsp, 48
	mov rbx, 10
	mov rcx, 3
	mov qword [rbp - 8], rbx
	sal qword [rbp - 8], cl
	mov rbx, qword [rbp - 8]
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rdi, qword [rbp - 8]
	call malloc
	mov rbx, 10
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rbx, qword [rbp - 8]
	mov qword [_global_color], rbx
	mov rbx, 1
	mov rcx, 3
	mov qword [rbp - 16], rbx
	sal qword [rbp - 16], cl
	mov rbx, qword [rbp - 16]
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rdi, qword [rbp - 16]
	call malloc
	mov rbx, 1
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov qword [_global_count], rbx
	mov rdi, 3
	call _global_origin
	mov qword [rbp - 8], rax
		mov rdx, 0
	mov rsi, 0
	mov rdi, 0
	call _global_search
	mov qword [rbp - 16], rax
		mov r10, qword [_global_count]
		mov r11, 0
		mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rdi, qword [rbp - 24]
	call toString
	mov qword [rbp - 32], rax
		mov rdi, qword [rbp - 32]
	call puts
	mov qword [rbp - 40], rax
		mov rax, 0
		jmp L_102
L_102:
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
_global_i: dq 0
_global_j: dq 0
_string_1_size: dq 1
_string_1: db 10, 0
_string_2_size: dq 1
_string_2: db 10, 0
_string_0_size: dq 1
_string_0: db 32, 0
SECTION .bss
stringbuffer: resb 256
_global_make: dq 0
_global_color: dq 0
_global_count: dq 0
