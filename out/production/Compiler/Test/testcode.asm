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
	sub rsp, 256
	mov rdi, 8
	call malloc
	mov rbx, rax
	mov qword [rbp - 8], rbx
	mov rbx, 10
	mov rcx, 3
	mov qword [rbp - 24], rbx
	sal qword [rbp - 24], cl
	mov rbx, qword [rbp - 24]
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rdi, qword [rbp - 24]
	call malloc
	mov rbx, 10
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov qword [rbp - 16], rbx
	mov rbx, 0
	mov qword [rbp - 32], rbx
	jmp L_58
L_58:
	mov rbx, qword [rbp - 32]
	mov rcx, 10
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_60
L_59:
	mov rbx, 9
	mov rcx, qword [rbp - 32]
	mov qword [rbp - 48], rbx
	sub qword [rbp - 48], rcx
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, qword [rbp - 32]
	mov r11, rbx
	mov rbx, qword [rbp - 48]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 32]
	mov rcx, qword [rbp - 32]
	mov qword [rbp - 56], rcx
	jmp L_58
L_60:
	mov rsi, qword [rbp - 16]
	mov rdi, qword [rbp - 8]
	call _vector.init
	mov rbx, rax
	mov qword [rbp - 64], rbx
	mov rdi, _string_3
	call print
	mov rbx, rax
	mov qword [rbp - 72], rbx
	mov rdi, qword [rbp - 8]
	call _vector.tostring
	mov rbx, rax
	mov qword [rbp - 80], rbx
	mov rdi, qword [rbp - 80]
	call puts
	mov rbx, rax
	mov qword [rbp - 88], rbx
	mov rdi, 8
	call malloc
	mov rbx, rax
	mov qword [rbp - 96], rbx
	mov rsi, qword [rbp - 8]
	mov rdi, qword [rbp - 96]
	call _vector.copy
	mov rbx, rax
	mov qword [rbp - 104], rbx
	mov rdx, 817
	mov rsi, 3
	mov rdi, qword [rbp - 96]
	call _vector.set
	mov rbx, rax
	mov qword [rbp - 112], rbx
	cmp byte [rbp - 112], 0
	jz L_62
L_61:
	mov rdi, _string_4
	call puts
	mov rbx, rax
	mov qword [rbp - 120], rbx
	jmp L_62
L_62:
	mov rdi, _string_5
	call print
	mov rbx, rax
	mov qword [rbp - 128], rbx
	mov rdi, qword [rbp - 96]
	call _vector.tostring
	mov rbx, rax
	mov qword [rbp - 136], rbx
	mov rdi, qword [rbp - 136]
	call puts
	mov rbx, rax
	mov qword [rbp - 144], rbx
	mov rdi, _string_6
	call print
	mov rbx, rax
	mov qword [rbp - 152], rbx
	mov rsi, qword [rbp - 96]
	mov rdi, qword [rbp - 8]
	call _vector.add
	mov rbx, rax
	mov qword [rbp - 160], rbx
	mov rdi, qword [rbp - 160]
	call _vector.tostring
	mov rbx, rax
	mov qword [rbp - 168], rbx
	mov rdi, qword [rbp - 168]
	call puts
	mov rbx, rax
	mov qword [rbp - 176], rbx
	mov rdi, _string_7
	call print
	mov rbx, rax
	mov qword [rbp - 184], rbx
	mov rsi, qword [rbp - 96]
	mov rdi, qword [rbp - 8]
	call _vector.dot
	mov rbx, rax
	mov qword [rbp - 192], rbx
	mov rdi, qword [rbp - 192]
	call toString
	mov rbx, rax
	mov qword [rbp - 200], rbx
	mov rdi, qword [rbp - 200]
	call puts
	mov rbx, rax
	mov qword [rbp - 208], rbx
	mov rdi, _string_8
	call print
	mov rbx, rax
	mov qword [rbp - 216], rbx
	mov rbx, 1
	mov rcx, 3
	mov qword [rbp - 224], rbx
	sal qword [rbp - 224], cl
	mov rsi, qword [rbp - 224]
	mov rdi, qword [rbp - 96]
	call _vector.scalarInPlaceMultiply
	mov rbx, rax
	mov qword [rbp - 232], rbx
	mov rdi, qword [rbp - 232]
	call _vector.tostring
	mov rbx, rax
	mov qword [rbp - 240], rbx
	mov rdi, qword [rbp - 240]
	call puts
	mov rbx, rax
	mov qword [rbp - 248], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_57
L_57:
	leave
	ret
_vector.add:
	push rbp
	mov rbp, rsp
	sub rsp, 176
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rdi, qword [rbp - 16]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 32], rbx
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
	mov rcx, qword [rbp - 32]
	cmp rbx, rcx
	setne byte [rbp - 48]
	jmp L_5
L_5:
	cmp byte [rbp - 48], 0
	jz L_6
L_4:
	mov rbx, 1
	mov qword [rbp - 24], rbx
	jmp L_2
L_2:
	mov rbx, 0
	mov rax, rbx
	jmp L_1
L_1:
	leave
	ret
	jmp L_3
L_3:
	mov rdi, 0
	call malloc
	mov rbx, rax
	mov qword [rbp - 72], rbx
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 96], rbx
	mov rbx, qword [rbp - 96]
	mov rcx, 3
	mov qword [rbp - 88], rbx
	sal qword [rbp - 88], cl
	mov rbx, qword [rbp - 88]
	mov rcx, 8
	mov qword [rbp - 88], rbx
	add qword [rbp - 88], rcx
	mov rdi, qword [rbp - 88]
	call malloc
	mov rbx, qword [rbp - 96]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 88], rbx
	add qword [rbp - 88], rcx
	mov rbx, qword [rbp - 72]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 80], rbx
	jmp L_9
L_9:
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 104]
	cmp rbx, rcx
	setl byte [rbp - 112]
	cmp byte [rbp - 112], 0
	jz L_11
L_10:
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [rbp - 120]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 128], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 136], rbx
	mov rbx, qword [rbp - 136]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 144]
	mov rcx, qword [rbp - 128]
	mov qword [rbp - 152], rbx
	add qword [rbp - 152], rcx
	mov rbx, qword [rbp - 72]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov rbx, qword [rbp - 160]
	mov r10, rbx
	mov rbx, qword [rbp - 80]
	mov r11, rbx
	mov rbx, qword [rbp - 152]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 80]
	mov rcx, qword [rbp - 80]
	mov qword [rbp - 168], rcx
	jmp L_9
L_11:
	mov rbx, qword [rbp - 72]
	mov rax, rbx
	jmp L_1
L_6:
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 64]
	jmp L_7
L_7:
	cmp byte [rbp - 64], 0
	jnz L_4
L_8:
	mov rbx, 0
	mov qword [rbp - 24], rbx
	cmp byte [rbp - 24], 0
	jnz L_2
_vector.init:
	push rbp
	mov rbp, rsp
	sub rsp, 96
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_15
L_14:
	jmp L_13
L_13:
	leave
	ret
	jmp L_15
L_15:
	mov rdi, qword [rbp - 16]
	call array.size
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
	mov rcx, 3
	mov qword [rbp - 32], rbx
	sal qword [rbp - 32], cl
	mov rbx, qword [rbp - 32]
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rdi, qword [rbp - 32]
	call malloc
	mov rbx, qword [rbp - 40]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 32]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 48], rbx
	jmp L_16
L_16:
	mov rdi, qword [rbp - 16]
	call array.size
	mov rbx, rax
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 48]
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	setl byte [rbp - 64]
	cmp byte [rbp - 64], 0
	jz L_18
L_17:
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, qword [rbp - 48]
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
	mov r10, rbx
	mov rbx, qword [rbp - 48]
	mov r11, rbx
	mov rbx, qword [rbp - 72]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 48]
	mov rcx, qword [rbp - 48]
	mov qword [rbp - 88], rcx
	jmp L_16
L_18:
	mov rbx, 0
	mov rax, rbx
	jmp L_13
_vector.getDim:
	push rbp
	mov rbp, rsp
	sub rsp, 40
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_22
L_21:
	mov rbx, 0
	mov rax, rbx
	jmp L_20
L_20:
	leave
	ret
	jmp L_22
L_22:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rdi, qword [r10 + r11*8]
	call array.size
	mov rbx, rax
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rax, rbx
	jmp L_20
_vector.dot:
	push rbp
	mov rbp, rsp
	sub rsp, 104
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, 0
	mov qword [rbp - 24], rbx
	mov rbx, 0
	mov qword [rbp - 32], rbx
	jmp L_25
L_25:
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	setl byte [rbp - 48]
	cmp byte [rbp - 48], 0
	jz L_27
L_26:
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov r10, rbx
	mov rbx, qword [rbp - 24]
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
	mov r10, rbx
	mov rbx, qword [rbp - 24]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov rcx, qword [rbp - 64]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 88], rax
	mov rbx, qword [rbp - 88]
	mov qword [rbp - 32], rbx
	inc qword [rbp - 24]
	mov rcx, qword [rbp - 24]
	mov qword [rbp - 96], rcx
	jmp L_25
L_27:
	mov rbx, qword [rbp - 32]
	mov rax, rbx
	jmp L_24
L_24:
	leave
	ret
_vector.scalarInPlaceMultiply:
	push rbp
	mov rbp, rsp
	sub rsp, 104
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 32]
	cmp byte [rbp - 32], 0
	jz L_31
L_30:
	mov rbx, 0
	mov rax, rbx
	jmp L_29
L_29:
	leave
	ret
	jmp L_31
L_31:
	mov rbx, 0
	mov qword [rbp - 40], rbx
	jmp L_32
L_32:
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 40]
	mov rcx, qword [rbp - 48]
	cmp rbx, rcx
	setl byte [rbp - 56]
	cmp byte [rbp - 56], 0
	jz L_34
L_33:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 64]
	mov r10, rbx
	mov rbx, qword [rbp - 40]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 72]
	mov rax, rbx
	imul rcx
	mov qword [rbp - 80], rax
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 88]
	mov r10, rbx
	mov rbx, qword [rbp - 40]
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 40]
	mov rcx, qword [rbp - 40]
	mov qword [rbp - 96], rcx
	jmp L_32
L_34:
	mov rbx, qword [rbp - 8]
	mov rax, rbx
	jmp L_29
_vector.set:
	push rbp
	mov rbp, rsp
	sub rsp, 56
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_38
L_37:
	mov rbx, 0
	mov rax, rbx
	jmp L_36
L_36:
	leave
	ret
	jmp L_38
L_38:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 48]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [rbp - 24]
	mov qword [r10 + r11*8], rbx
	mov rbx, 1
	mov rax, rbx
	jmp L_36
_vector.tostring:
	push rbp
	mov rbp, rsp
	sub rsp, 152
	mov qword [rbp - 8], rdi
		mov rbx, _string_0
	mov qword [rbp - 16], rbx
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 24], rbx
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 32]
	cmp byte [rbp - 32], 0
	jz L_42
L_41:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
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
	mov rdi, qword [rbp - 16]
	call string.add
	mov rbx, rax
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 64]
	mov qword [rbp - 16], rbx
	jmp L_42
L_42:
	mov rbx, 1
	mov qword [rbp - 72], rbx
	jmp L_43
L_43:
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, qword [rbp - 80]
	cmp rbx, rcx
	setl byte [rbp - 88]
	cmp byte [rbp - 88], 0
	jz L_45
L_44:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 96], rbx
	mov rbx, qword [rbp - 96]
	mov r10, rbx
	mov rbx, qword [rbp - 72]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rdi, qword [rbp - 104]
	call toString
	mov rbx, rax
	mov qword [rbp - 112], rbx
	mov rsi, _string_1
	mov rdi, qword [rbp - 16]
	call string.add
	mov rbx, rax
	mov qword [rbp - 120], rbx
	mov rsi, qword [rbp - 112]
	mov rdi, qword [rbp - 120]
	call string.add
	mov rbx, rax
	mov qword [rbp - 128], rbx
	mov rbx, qword [rbp - 128]
	mov qword [rbp - 16], rbx
	inc qword [rbp - 72]
	mov rcx, qword [rbp - 72]
	mov qword [rbp - 136], rcx
	jmp L_43
L_45:
	mov rsi, _string_2
	mov rdi, qword [rbp - 16]
	call string.add
	mov rbx, rax
	mov qword [rbp - 144], rbx
	mov rbx, qword [rbp - 144]
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 16]
	mov rax, rbx
	jmp L_40
L_40:
	leave
	ret
_vector.copy:
	push rbp
	mov rbp, rsp
	sub rsp, 120
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
		mov rbx, qword [rbp - 16]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_49
L_48:
	mov rbx, 0
	mov rax, rbx
	jmp L_47
L_47:
	leave
	ret
	jmp L_49
L_49:
	mov rdi, qword [rbp - 16]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_51
L_50:
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	jmp L_52
L_52:
	mov rbx, 1
	mov rax, rbx
	jmp L_47
L_51:
	mov rdi, qword [rbp - 16]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov rcx, 3
	mov qword [rbp - 48], rbx
	sal qword [rbp - 48], cl
	mov rbx, qword [rbp - 48]
	mov rcx, 8
	mov qword [rbp - 48], rbx
	add qword [rbp - 48], rcx
	mov rdi, qword [rbp - 48]
	call malloc
	mov rbx, qword [rbp - 56]
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 48], rbx
	add qword [rbp - 48], rcx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 48]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 64], rbx
	jmp L_53
L_53:
	mov rdi, qword [rbp - 8]
	call _vector.getDim
	mov rbx, rax
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 64]
	mov rcx, qword [rbp - 72]
	cmp rbx, rcx
	setl byte [rbp - 80]
	cmp byte [rbp - 80], 0
	jz L_55
L_54:
	mov rbx, qword [rbp - 16]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 88]
	mov r10, rbx
	mov rbx, qword [rbp - 64]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 96], rbx
	mov rbx, qword [rbp - 8]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 64]
	mov r11, rbx
	mov rbx, qword [rbp - 96]
	mov qword [r10 + r11*8], rbx
	inc qword [rbp - 64]
	mov rcx, qword [rbp - 64]
	mov qword [rbp - 112], rcx
	jmp L_53
L_55:
	jmp L_52
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
_string_2: db 32, 41, 0
_string_0_size: dq 2
_string_0: db 40, 32, 0
_string_5_size: dq 10
_string_5: db 118, 101, 99, 116, 111, 114, 32, 121, 58, 32, 0
_string_6_size: dq 7
_string_6: db 120, 32, 43, 32, 121, 58, 32, 0
_string_3_size: dq 10
_string_3: db 118, 101, 99, 116, 111, 114, 32, 120, 58, 32, 0
_string_4_size: dq 8
_string_4: db 101, 120, 99, 105, 116, 101, 100, 33, 0
_string_7_size: dq 7
_string_7: db 120, 32, 42, 32, 121, 58, 32, 0
_string_8_size: dq 14
_string_8: db 40, 49, 32, 60, 60, 32, 51, 41, 32, 42, 32, 121, 58, 32, 0
SECTION .bss
stringbuffer: resb 256
