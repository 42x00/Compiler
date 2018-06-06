extern malloc
extern printf
extern puts
extern getchar
extern putchar
extern sprintf
extern __stack_chk_fail
extern printf
extern strlen
extern memcpy
extern scanf

global _global_N
global _global_head
global _global_startx
global _global_starty
global _global_targetx
global _global_targety
global _global_x
global _global_y
global _global_xlist
global _global_ylist
global _global_tail
global _global_ok
global _global_now
global _global_dx
global _global_dy
global _global_step
global _global_i
global _global_j
global _global_origin
global _global_check
global _global_addList
global main

SECTION .text
_global_origin:
	push rbp
	mov rbp, rsp
	sub rsp, 72
	push r12
	push r13
	push r14
	push r15
	mov r13, rdi
	mov rbx, 0
	mov qword [_global_head], rbx
	mov rbx, 0
	mov qword [_global_tail], rbx
	mov r12, r13
	mov rcx, 3
	shl r12, cl
	mov r12, r12
	add r12, 8
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call malloc
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov qword [rax], r13
	mov r12, rax
	add r12, 8
	mov qword [_global_step], r12
	mov rbx, 0
	mov qword [_global_i], rbx
L_2:
	cmp qword [_global_i], r13
	setl r12b
	cmp r12b, 0
	jz L_4
L_3:
	mov r12, r13
	mov rcx, 3
	shl r12, cl
	mov r12, r12
	add r12, 8
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call malloc
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov qword [rax], r13
	mov r12, rax
	add r12, 8
	mov r10, qword [_global_step]
	mov r11, qword [_global_i]
	mov qword [r10 + r11*8], r12
	mov rbx, 0
	mov qword [_global_j], rbx
L_5:
	cmp qword [_global_j], r13
	setl r12b
	cmp r12b, 0
	jz L_7
L_6:
	mov r10, qword [_global_step]
	mov r11, qword [_global_i]
	mov r12, qword [r10 + r11*8]
	mov r10, r12
	mov r11, qword [_global_j]
	mov rbx, 0
	mov qword [r10 + r11*8], rbx
	mov r12, qword [_global_j]
	inc qword [_global_j]
	jmp L_5
L_7:
	mov r12, qword [_global_i]
	inc qword [_global_i]
	jmp L_2
L_4:
	mov rax, 0
L_1:
	pop r15
	pop r14
	pop r13
	pop r12
	leave
	ret
_global_check:
	push rbp
	mov rbp, rsp
	sub rsp, 40
	push r12
	push r13
	push r14
	push r15
	mov r12, rdi
	cmp r12, qword [_global_N]
	setl r13b
L_13:
	cmp r13b, 0
	jz L_12
L_14:
	cmp r12, 0
	setge r12b
L_15:
	cmp r12b, 0
	jz L_12
L_16:
	mov r12, 1
L_11:
	mov rax, r12
L_10:
	pop r15
	pop r14
	pop r13
	pop r12
	leave
	ret
L_12:
	mov r12, 0
	jmp L_11
_global_addList:
	push rbp
	mov rbp, rsp
	sub rsp, 136
	push r12
	push r13
	push r14
	push r15
	mov r15, rdi
	mov r12, rsi
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r15
	call _global_check
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r13, rax
L_26:
	cmp r13b, 0
	jz L_25
L_27:
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call _global_check
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r13, rax
L_28:
	cmp r13b, 0
	jz L_25
L_29:
	mov r13, 1
L_23:
	cmp r13b, 0
	jz L_22
L_24:
	mov r10, qword [_global_step]
	mov r11, r15
	mov r13, qword [r10 + r11*8]
	mov r10, r13
	mov r11, r12
	mov r13, qword [r10 + r11*8]
	cmp r13, -1
	sete r13b
L_30:
	cmp r13b, 0
	jz L_22
L_31:
	mov r13, 1
	cmp r13b, 0
	jz L_21
L_20:
	mov r13, qword [_global_tail]
	inc qword [_global_tail]
	mov r10, qword [_global_xlist]
	mov r11, qword [_global_tail]
	mov qword [r10 + r11*8], r15
	mov r10, qword [_global_ylist]
	mov r11, qword [_global_tail]
	mov qword [r10 + r11*8], r12
	mov r13, qword [_global_now]
	add r13, 1
	mov r10, qword [_global_step]
	mov r11, r15
	mov r14, qword [r10 + r11*8]
	mov r10, r14
	mov r11, r12
	mov qword [r10 + r11*8], r13
	cmp r15, qword [_global_targetx]
	sete r13b
L_35:
	cmp r13b, 0
	jz L_34
L_36:
	cmp r12, qword [_global_targety]
	sete r12b
L_37:
	cmp r12b, 0
	jz L_34
L_38:
	mov r12, 1
	cmp r12b, 0
	jz L_33
L_32:
	mov rbx, 1
	mov qword [_global_ok], rbx
L_33:
L_21:
	mov rax, 0
L_19:
	pop r15
	pop r14
	pop r13
	pop r12
	leave
	ret
L_34:
	mov r12, 0
	jmp L_33
L_22:
	mov r13, 0
	jmp L_21
L_25:
	mov r13, 0
	jmp L_23
main:
	push rbp
	mov rbp, rsp
	sub rsp, 304
	mov r12, 12000
	mov rcx, 3
	shl r12, cl
	mov r12, r12
	add r12, 8
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call malloc
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov rbx, 12000
	mov qword [rax], rbx
	mov r12, rax
	add r12, 8
	mov qword [_global_xlist], r12
	mov r12, 12000
	mov rcx, 3
	shl r12, cl
	mov r12, r12
	add r12, 8
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call malloc
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov rbx, 12000
	mov qword [rax], rbx
	mov r12, rax
	add r12, 8
	mov qword [_global_ylist], r12
	mov r12, 8
	mov rcx, 3
	shl r12, cl
	mov r12, r12
	add r12, 8
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call malloc
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov rbx, 8
	mov qword [rax], rbx
	mov r12, rax
	add r12, 8
	mov qword [_global_dx], r12
	mov r12, 9
	mov rcx, 3
	shl r12, cl
	mov r12, r12
	add r12, 8
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call malloc
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov rbx, 9
	mov qword [rax], rbx
	mov r12, rax
	add r12, 8
	mov qword [_global_dy], r12
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, 106
	call _global_origin
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r12, rax
	push rdi
	push rsi
	push r8
	push r9
	call getInt
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r12, rax
	mov qword [_global_N], r12
	mov r12, qword [_global_N]
	sub r12, 1
	mov qword [_global_targety], r12
	mov rbx, qword [_global_targety]
	mov qword [_global_targetx], rbx
	mov rbx, 0
	mov qword [_global_i], rbx
L_42:
	mov rcx, qword [_global_N]
	cmp qword [_global_i], rcx
	setl r12b
	cmp r12b, 0
	jz L_44
L_43:
	mov rbx, 0
	mov qword [_global_j], rbx
L_45:
	mov rcx, qword [_global_N]
	cmp qword [_global_j], rcx
	setl r12b
	cmp r12b, 0
	jz L_47
L_46:
	mov r10, qword [_global_step]
	mov r11, qword [_global_i]
	mov r12, qword [r10 + r11*8]
	mov r10, r12
	mov r11, qword [_global_j]
	mov rbx, -1
	mov qword [r10 + r11*8], rbx
	mov r12, qword [_global_j]
	inc qword [_global_j]
	jmp L_45
L_47:
	mov r12, qword [_global_i]
	inc qword [_global_i]
	jmp L_42
L_44:
	mov r10, qword [_global_dx]
	mov r11, 0
	mov rbx, -2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 0
	mov rbx, -1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 1
	mov rbx, -2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 1
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 2
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 2
	mov rbx, -1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 3
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 3
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 4
	mov rbx, -1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 4
	mov rbx, -2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 5
	mov rbx, -1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 5
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 6
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 6
	mov rbx, -2
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dx]
	mov r11, 7
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov r10, qword [_global_dy]
	mov r11, 7
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
L_48:
	mov rcx, qword [_global_tail]
	cmp qword [_global_head], rcx
	setle r12b
	cmp r12b, 0
	jz L_50
L_49:
	mov r10, qword [_global_xlist]
	mov r11, qword [_global_head]
	mov r12, qword [r10 + r11*8]
	mov qword [_global_x], r12
	mov r10, qword [_global_ylist]
	mov r11, qword [_global_head]
	mov r12, qword [r10 + r11*8]
	mov qword [_global_y], r12
	mov r10, qword [_global_step]
	mov r11, qword [_global_x]
	mov r12, qword [r10 + r11*8]
	mov r10, r12
	mov r11, qword [_global_y]
	mov r12, qword [r10 + r11*8]
	mov qword [_global_now], r12
	mov rbx, 0
	mov qword [_global_j], rbx
L_51:
	cmp qword [_global_j], 8
	setl r12b
	cmp r12b, 0
	jz L_53
L_52:
	mov r10, qword [_global_dx]
	mov r11, qword [_global_j]
	mov r12, qword [r10 + r11*8]
	mov r13, qword [_global_x]
	add r13, r12
	mov r10, qword [_global_dy]
	mov r11, qword [_global_j]
	mov r12, qword [r10 + r11*8]
	mov r12, qword [_global_y]
	add r12, r12
	push rdi
	push rsi
	push r8
	push r9
	mov rsi, r12
	mov rdi, r13
	call _global_addList
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r12, rax
	mov r12, qword [_global_j]
	inc qword [_global_j]
	jmp L_51
L_53:
	cmp qword [_global_ok], 1
	sete r12b
	cmp r12b, 0
	jz L_55
L_54:
L_50:
	cmp qword [_global_ok], 1
	sete r12b
	cmp r12b, 0
	jz L_57
L_56:
	mov r10, qword [_global_step]
	mov r11, qword [_global_targetx]
	mov r12, qword [r10 + r11*8]
	mov r10, r12
	mov r11, qword [_global_targety]
	mov r12, qword [r10 + r11*8]
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call toString
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r12, rax
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, r12
	call puts
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r12, rax
L_58:
	mov rax, 0
L_41:
	leave
	ret
L_57:
	push rdi
	push rsi
	push r8
	push r9
	mov rdi, _string_0
	call print
	pop r9
	pop r8
	pop rsi
	pop rdi
	mov r12, rax
	jmp L_58
L_55:
	mov r12, qword [_global_head]
	inc qword [_global_head]
	jmp L_48
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
_global_N: dq 0
_global_head: dq 0
_global_startx: dq 0
_global_starty: dq 0
_global_targetx: dq 0
_global_targety: dq 0
_global_x: dq 0
_global_y: dq 0
_global_tail: dq 0
_global_ok: dq 0
_global_now: dq 0
_global_i: dq 0
_global_j: dq 0
_string_0_size: dq 13
_string_0: db 110, 111, 32, 115, 111, 108, 117, 116, 105, 111, 110, 33, 10, 0
SECTION .bss
stringbuffer: resb 256
_global_xlist: dq 0
_global_ylist: dq 0
_global_dx: dq 0
_global_dy: dq 0
_global_step: dq 0
