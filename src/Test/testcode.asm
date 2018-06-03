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

global _c
global _ans
global _visit
global _pre
global _f
global _i
global _j
global _open
global _closed
global _origin
global _build
global _find
global _improve
global main

SECTION .text
_origin:
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
	mov qword [_c], rbx
	mov rbx, 0
	mov qword [_i], rbx
	jmp L_2
L_2:
	mov rbx, qword [_i]
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
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [rbp - 32]
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [_j], rbx
	jmp L_5
L_5:
	mov rbx, qword [_j]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_7
L_6:
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	mov rbx, qword [rbp - 48]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_j]
	mov qword [rbp - 56], rbx
	inc qword [_j]
	jmp L_5
L_7:
	mov rbx, qword [_i]
	mov qword [rbp - 64], rbx
	inc qword [_i]
	jmp L_2
L_4:
	mov rbx, 0
	mov rax, rbx
	jmp L_1
L_1:
	leave
	ret
_build:
	push rbp
	mov rbp, rsp
	sub rsp, 128
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, 1
	mov qword [_i], rbx
	jmp L_10
L_10:
	mov rbx, qword [_i]
	mov rcx, 49
	cmp rbx, rcx
	setle byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_12
L_11:
	mov rbx, 50
	mov qword [_j], rbx
	jmp L_13
L_13:
	mov rbx, 98
	mov rcx, qword [_i]
	mov qword [rbp - 32], rbx
	sub qword [rbp - 32], rcx
	mov rbx, qword [rbp - 32]
	mov rcx, 1
	mov qword [rbp - 40], rbx
	add qword [rbp - 40], rcx
	mov rbx, qword [_j]
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	setle byte [rbp - 48]
	cmp byte [rbp - 48], 0
	jz L_15
L_14:
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_j]
	mov qword [rbp - 64], rbx
	inc qword [_j]
	jmp L_13
L_15:
	mov rbx, qword [_i]
	mov qword [rbp - 72], rbx
	inc qword [_i]
	jmp L_10
L_12:
	mov rbx, 1
	mov qword [_i], rbx
	jmp L_16
L_16:
	mov rbx, qword [_i]
	mov rcx, 49
	cmp rbx, rcx
	setle byte [rbp - 80]
	cmp byte [rbp - 80], 0
	jz L_18
L_17:
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 88], rbx
	mov rbx, qword [rbp - 88]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_i]
	mov qword [rbp - 96], rbx
	inc qword [_i]
	jmp L_16
L_18:
	mov rbx, 50
	mov qword [_i], rbx
	jmp L_19
L_19:
	mov rbx, qword [_i]
	mov rcx, 98
	cmp rbx, rcx
	setle byte [rbp - 104]
	cmp byte [rbp - 104], 0
	jz L_21
L_20:
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 112], rbx
	mov rbx, qword [rbp - 112]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_i]
	mov qword [rbp - 120], rbx
	inc qword [_i]
	jmp L_19
L_21:
	mov rbx, 0
	mov rax, rbx
	jmp L_9
L_9:
	leave
	ret
_find:
	push rbp
	mov rbp, rsp
	sub rsp, 160
	mov qword [rbp - 24], rdx
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rbx, 0
	mov qword [_open], rbx
	mov rbx, 1
	mov qword [_closed], rbx
	mov rbx, 1
	mov qword [_i], rbx
	jmp L_24
L_24:
	mov rbx, qword [_i]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setle byte [rbp - 32]
	cmp byte [rbp - 32], 0
	jz L_26
L_25:
	mov rbx, qword [_visit]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_i]
	mov qword [rbp - 40], rbx
	inc qword [_i]
	jmp L_24
L_26:
	mov rbx, qword [_f]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [rbp - 16]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_visit]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_pre]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov rbx, 0
	mov qword [rbp - 24], rbx
	jmp L_27
L_27:
	mov rbx, qword [_open]
	mov rcx, qword [_closed]
	cmp rbx, rcx
	setl byte [rbp - 56]
	jmp L_31
L_31:
	cmp byte [rbp - 56], 0
	jz L_30
L_32:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 64]
	jmp L_33
L_33:
	cmp byte [rbp - 64], 0
	jz L_30
L_34:
	mov rbx, 1
	mov qword [rbp - 48], rbx
	cmp byte [rbp - 48], 0
	jz L_29
L_28:
	mov rbx, qword [_open]
	mov qword [rbp - 72], rbx
	inc qword [_open]
	mov rbx, qword [_f]
	mov r10, rbx
	mov rbx, qword [_open]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 80], rbx
	mov rbx, qword [rbp - 80]
	mov qword [_i], rbx
	mov rbx, 1
	mov qword [_j], rbx
	jmp L_35
L_35:
	mov rbx, qword [_j]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	setle byte [rbp - 88]
	cmp byte [rbp - 88], 0
	jz L_37
L_36:
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 112]
	jmp L_41
L_41:
	cmp byte [rbp - 112], 0
	jz L_40
L_42:
	mov rbx, qword [_visit]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 120], rbx
	mov rbx, qword [rbp - 120]
	mov rcx, 0
	cmp rbx, rcx
	sete byte [rbp - 128]
	jmp L_43
L_43:
	cmp byte [rbp - 128], 0
	jz L_40
L_44:
	mov rbx, 1
	mov qword [rbp - 96], rbx
	cmp byte [rbp - 96], 0
	jz L_39
L_38:
	mov rbx, qword [_visit]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_closed]
	mov qword [rbp - 136], rbx
	inc qword [_closed]
	mov rbx, qword [_f]
	mov r10, rbx
	mov rbx, qword [_closed]
	mov r11, rbx
	mov rbx, qword [_j]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_pre]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [_i]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_closed]
	mov rcx, qword [rbp - 8]
	cmp rbx, rcx
	sete byte [rbp - 144]
	cmp byte [rbp - 144], 0
	jz L_46
L_45:
	mov rbx, 1
	mov qword [rbp - 24], rbx
	jmp L_46
L_46:
	jmp L_39
L_39:
	mov rbx, qword [_j]
	mov qword [rbp - 152], rbx
	inc qword [_j]
	jmp L_35
L_40:
	mov rbx, 0
	mov qword [rbp - 96], rbx
	jmp L_39
L_37:
	jmp L_27
L_29:
	mov rbx, qword [rbp - 24]
	mov rax, rbx
	jmp L_23
L_23:
	leave
	ret
L_30:
	mov rbx, 0
	mov qword [rbp - 48], rbx
	jmp L_29
_improve:
	push rbp
	mov rbp, rsp
	sub rsp, 72
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 8]
	mov qword [_i], rbx
	mov rbx, qword [_ans]
	mov qword [rbp - 16], rbx
	inc qword [_ans]
	jmp L_49
L_49:
	mov rbx, qword [_pre]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 24]
	cmp byte [rbp - 24], 0
	jz L_51
L_50:
	mov rbx, qword [_pre]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 32], rbx
	mov rbx, qword [rbp - 32]
	mov qword [_j], rbx
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 40], rbx
	mov rbx, qword [rbp - 40]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 48], rbx
	dec qword [r10 + r11*8]
	mov rbx, qword [_c]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 64], rbx
	inc qword [r10 + r11*8]
	mov rbx, qword [_j]
	mov qword [_i], rbx
	jmp L_49
L_51:
	mov rbx, 0
	mov rax, rbx
	jmp L_48
L_48:
	leave
	ret
main:
	push rbp
	mov rbp, rsp
	sub rsp, 104
	mov rbx, 0
	mov qword [_ans], rbx
	mov rbx, 110
	mov rcx, 3
	mov qword [rbp - 8], rbx
	sal qword [rbp - 8], cl
	mov rbx, qword [rbp - 8]
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rdi, qword [rbp - 8]
	call malloc
	mov rbx, 110
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rbx, qword [rbp - 8]
	mov qword [_visit], rbx
	mov rbx, 110
	mov rcx, 3
	mov qword [rbp - 16], rbx
	sal qword [rbp - 16], cl
	mov rbx, qword [rbp - 16]
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rdi, qword [rbp - 16]
	call malloc
	mov rbx, 110
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov qword [_pre], rbx
	mov rbx, 110
	mov rcx, 3
	mov qword [rbp - 24], rbx
	sal qword [rbp - 24], cl
	mov rbx, qword [rbp - 24]
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rdi, qword [rbp - 24]
	call malloc
	mov rbx, 110
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov qword [_f], rbx
	mov rdi, 110
	call _origin
	mov rbx, rax
	mov qword [rbp - 8], rbx
	mov rbx, 0
	mov qword [rbp - 16], rbx
	mov rbx, 99
	mov qword [rbp - 24], rbx
	mov rbx, 100
	mov qword [rbp - 32], rbx
	mov rbx, 0
	mov qword [rbp - 40], rbx
	mov rsi, qword [rbp - 32]
	mov rdi, qword [rbp - 24]
	call _build
	mov rbx, rax
	mov qword [rbp - 56], rbx
	jmp L_54
L_54:
	mov rdx, qword [rbp - 40]
	mov rsi, qword [rbp - 24]
	mov rdi, qword [rbp - 32]
	call _find
	mov rbx, rax
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 64]
	mov rcx, 0
	cmp rbx, rcx
	setg byte [rbp - 72]
	cmp byte [rbp - 72], 0
	jz L_56
L_55:
	mov rdi, qword [rbp - 32]
	call _improve
	mov rbx, rax
	mov qword [rbp - 80], rbx
	jmp L_54
L_56:
	mov rdi, qword [_ans]
	call toString
	mov rbx, rax
	mov qword [rbp - 88], rbx
	mov rdi, qword [rbp - 88]
	call puts
	mov rbx, rax
	mov qword [rbp - 96], rbx
	mov rbx, 0
	mov rax, rbx
	jmp L_53
L_53:
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
_ans: dq 0
_i: dq 0
_j: dq 0
_open: dq 0
_closed: dq 0
SECTION .bss
stringbuffer: resb 256
_c: dq 0
_visit: dq 0
_pre: dq 0
_f: dq 0
