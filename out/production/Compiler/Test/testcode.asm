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

global _N
global _head
global _startx
global _starty
global _targetx
global _targety
global _x
global _y
global _xlist
global _ylist
global _tail
global _ok
global _now
global _dx
global _dy
global _step
global _i
global _j
global _origin
global _check
global _addList
global main

SECTION .text
_origin:
	push rbp
	mov rbp, rsp
	sub rsp, 72
	mov qword [rbp - 8], rdi
	mov rbx, 0
	mov qword [_head], rbx
	mov rbx, 0
	mov qword [_tail], rbx
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
	mov qword [_step], rbx
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
	mov rbx, qword [_step]
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
	mov rbx, qword [_step]
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
_check:
	push rbp
	mov rbp, rsp
	sub rsp, 40
	mov qword [rbp - 8], rdi
	mov rbx, qword [rbp - 8]
	mov rcx, qword [_N]
	cmp rbx, rcx
	setl byte [rbp - 24]
	jmp L_11
L_11:
	cmp byte [rbp - 24], 0
	jz L_10
L_12:
	mov rbx, qword [rbp - 8]
	mov rcx, 0
	cmp rbx, rcx
	setge byte [rbp - 32]
	jmp L_13
L_13:
	cmp byte [rbp - 32], 0
	jz L_10
L_14:
	mov rbx, 1
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 16]
	mov rax, rbx
	jmp L_9
L_9:
	leave
	ret
L_10:
	mov rbx, 0
	mov qword [rbp - 16], rbx
	jmp L_7
_addList:
	push rbp
	mov rbp, rsp
	sub rsp, 136
	mov qword [rbp - 16], rsi
	mov qword [rbp - 8], rdi
	mov rdi, qword [rbp - 8]
	call _check
	mov rbx, rax
	mov qword [rbp - 40], rbx
	jmp L_23
L_23:
	cmp byte [rbp - 40], 0
	jz L_22
L_24:
	mov rdi, qword [rbp - 16]
	call _check
	mov rbx, rax
	mov qword [rbp - 48], rbx
	jmp L_25
L_25:
	cmp byte [rbp - 48], 0
	jz L_22
L_26:
	mov rbx, 1
	mov qword [rbp - 32], rbx
	jmp L_20
L_20:
	cmp byte [rbp - 32], 0
	jz L_19
L_21:
	neg -1
	mov rcx, -1
	mov qword [rbp - 56], rcx
	mov rbx, qword [_step]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 64], rbx
	mov rbx, qword [rbp - 64]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 72], rbx
	mov rbx, qword [rbp - 72]
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete byte [rbp - 80]
	jmp L_27
L_27:
	cmp byte [rbp - 80], 0
	jz L_19
L_28:
	mov rbx, 1
	mov qword [rbp - 24], rbx
	cmp byte [rbp - 24], 0
	jz L_18
L_17:
	mov rbx, qword [_tail]
	mov qword [rbp - 88], rbx
	inc qword [_tail]
	mov rbx, qword [_xlist]
	mov r10, rbx
	mov rbx, qword [_tail]
	mov r11, rbx
	mov rbx, qword [rbp - 8]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_ylist]
	mov r10, rbx
	mov rbx, qword [_tail]
	mov r11, rbx
	mov rbx, qword [rbp - 16]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_now]
	mov rcx, 1
	mov qword [rbp - 96], rbx
	add qword [rbp - 96], rcx
	mov rbx, qword [_step]
	mov r10, rbx
	mov rbx, qword [rbp - 8]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 104], rbx
	mov rbx, qword [rbp - 104]
	mov r10, rbx
	mov rbx, qword [rbp - 16]
	mov r11, rbx
	mov rbx, qword [rbp - 96]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [rbp - 8]
	mov rcx, qword [_targetx]
	cmp rbx, rcx
	sete byte [rbp - 120]
	jmp L_32
L_32:
	cmp byte [rbp - 120], 0
	jz L_31
L_33:
	mov rbx, qword [rbp - 16]
	mov rcx, qword [_targety]
	cmp rbx, rcx
	sete byte [rbp - 128]
	jmp L_34
L_34:
	cmp byte [rbp - 128], 0
	jz L_31
L_35:
	mov rbx, 1
	mov qword [rbp - 112], rbx
	cmp byte [rbp - 112], 0
	jz L_30
L_29:
	mov rbx, 1
	mov qword [_ok], rbx
	jmp L_30
L_30:
	jmp L_18
L_18:
	mov rbx, 0
	mov rax, rbx
	jmp L_16
L_16:
	leave
	ret
L_31:
	mov rbx, 0
	mov qword [rbp - 112], rbx
	jmp L_30
L_19:
	mov rbx, 0
	mov qword [rbp - 24], rbx
	jmp L_18
L_22:
	mov rbx, 0
	mov qword [rbp - 32], rbx
	jmp L_20
main:
	push rbp
	mov rbp, rsp
	sub rsp, 296
	mov rbx, 12000
	mov rcx, 3
	mov qword [rbp - 8], rbx
	sal qword [rbp - 8], cl
	mov rbx, qword [rbp - 8]
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rdi, qword [rbp - 8]
	call malloc
	mov rbx, 12000
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 8], rbx
	add qword [rbp - 8], rcx
	mov rbx, qword [rbp - 8]
	mov qword [_xlist], rbx
	mov rbx, 12000
	mov rcx, 3
	mov qword [rbp - 16], rbx
	sal qword [rbp - 16], cl
	mov rbx, qword [rbp - 16]
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rdi, qword [rbp - 16]
	call malloc
	mov rbx, 12000
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 16], rbx
	add qword [rbp - 16], rcx
	mov rbx, qword [rbp - 16]
	mov qword [_ylist], rbx
	mov rbx, 8
	mov rcx, 3
	mov qword [rbp - 24], rbx
	sal qword [rbp - 24], cl
	mov rbx, qword [rbp - 24]
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rdi, qword [rbp - 24]
	call malloc
	mov rbx, 8
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 24], rbx
	add qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov qword [_dx], rbx
	mov rbx, 9
	mov rcx, 3
	mov qword [rbp - 32], rbx
	sal qword [rbp - 32], cl
	mov rbx, qword [rbp - 32]
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rdi, qword [rbp - 32]
	call malloc
	mov rbx, 9
	mov qword [rax], rbx
	mov rbx, rax
	mov rcx, 8
	mov qword [rbp - 32], rbx
	add qword [rbp - 32], rcx
	mov rbx, qword [rbp - 32]
	mov qword [_dy], rbx
	mov rdi, 106
	call _origin
	mov rbx, rax
	mov qword [rbp - 8], rbx
	call getInt
	mov rbx, rax
	mov qword [rbp - 16], rbx
	mov rbx, qword [rbp - 16]
	mov qword [_N], rbx
	mov rbx, qword [_N]
	mov rcx, 1
	mov qword [rbp - 24], rbx
	sub qword [rbp - 24], rcx
	mov rbx, qword [rbp - 24]
	mov qword [_targety], rbx
	mov rbx, qword [_targety]
	mov qword [_targetx], rbx
	mov rbx, 0
	mov qword [_i], rbx
	jmp L_38
L_38:
	mov rbx, qword [_i]
	mov rcx, qword [_N]
	cmp rbx, rcx
	setl byte [rbp - 32]
	cmp byte [rbp - 32], 0
	jz L_40
L_39:
	mov rbx, 0
	mov qword [_j], rbx
	jmp L_41
L_41:
	mov rbx, qword [_j]
	mov rcx, qword [_N]
	cmp rbx, rcx
	setl byte [rbp - 40]
	cmp byte [rbp - 40], 0
	jz L_43
L_42:
	neg -1
	mov rcx, -1
	mov qword [rbp - 48], rcx
	mov rbx, qword [_step]
	mov r10, rbx
	mov rbx, qword [_i]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 56], rbx
	mov rbx, qword [rbp - 56]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [rbp - 48]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_j]
	mov qword [rbp - 64], rbx
	inc qword [_j]
	jmp L_41
L_43:
	mov rbx, qword [_i]
	mov qword [rbp - 72], rbx
	inc qword [_i]
	jmp L_38
L_40:
	neg -2
	mov rcx, -2
	mov qword [rbp - 80], rcx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 80]
	mov qword [r10 + r11*8], rbx
	neg -1
	mov rcx, -1
	mov qword [rbp - 88], rcx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 0
	mov r11, rbx
	mov rbx, qword [rbp - 88]
	mov qword [r10 + r11*8], rbx
	neg -2
	mov rcx, -2
	mov qword [rbp - 96], rcx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, qword [rbp - 96]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 1
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	neg -1
	mov rcx, -1
	mov qword [rbp - 104], rcx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 2
	mov r11, rbx
	mov rbx, qword [rbp - 104]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 3
	mov r11, rbx
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 3
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	neg -1
	mov rcx, -1
	mov qword [rbp - 112], rcx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 4
	mov r11, rbx
	mov rbx, qword [rbp - 112]
	mov qword [r10 + r11*8], rbx
	neg -2
	mov rcx, -2
	mov qword [rbp - 120], rcx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 4
	mov r11, rbx
	mov rbx, qword [rbp - 120]
	mov qword [r10 + r11*8], rbx
	neg -1
	mov rcx, -1
	mov qword [rbp - 128], rcx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 5
	mov r11, rbx
	mov rbx, qword [rbp - 128]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 5
	mov r11, rbx
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 6
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	neg -2
	mov rcx, -2
	mov qword [rbp - 136], rcx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 6
	mov r11, rbx
	mov rbx, qword [rbp - 136]
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, 7
	mov r11, rbx
	mov rbx, 1
	mov qword [r10 + r11*8], rbx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, 7
	mov r11, rbx
	mov rbx, 2
	mov qword [r10 + r11*8], rbx
	jmp L_44
L_44:
	mov rbx, qword [_head]
	mov rcx, qword [_tail]
	cmp rbx, rcx
	setle byte [rbp - 144]
	cmp byte [rbp - 144], 0
	jz L_46
L_45:
	mov rbx, qword [_xlist]
	mov r10, rbx
	mov rbx, qword [_head]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 152], rbx
	mov rbx, qword [rbp - 152]
	mov qword [_x], rbx
	mov rbx, qword [_ylist]
	mov r10, rbx
	mov rbx, qword [_head]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 160], rbx
	mov rbx, qword [rbp - 160]
	mov qword [_y], rbx
	mov rbx, qword [_step]
	mov r10, rbx
	mov rbx, qword [_x]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 168], rbx
	mov rbx, qword [rbp - 168]
	mov r10, rbx
	mov rbx, qword [_y]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 176], rbx
	mov rbx, qword [rbp - 176]
	mov qword [_now], rbx
	mov rbx, 0
	mov qword [_j], rbx
	jmp L_47
L_47:
	mov rbx, qword [_j]
	mov rcx, 8
	cmp rbx, rcx
	setl byte [rbp - 184]
	cmp byte [rbp - 184], 0
	jz L_49
L_48:
	mov rbx, qword [_dx]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [_x]
	mov rcx, qword [r10 + r11*8]
	mov qword [rbp - 192], rbx
	add qword [rbp - 192], rcx
	mov rbx, qword [_dy]
	mov r10, rbx
	mov rbx, qword [_j]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 200], rbx
	mov rbx, qword [_y]
	mov rcx, qword [rbp - 200]
	mov qword [rbp - 208], rbx
	add qword [rbp - 208], rcx
	mov rsi, qword [rbp - 208]
	mov rdi, qword [rbp - 192]
	call _addList
	mov rbx, rax
	mov qword [rbp - 216], rbx
	mov rbx, qword [_j]
	mov qword [rbp - 224], rbx
	inc qword [_j]
	jmp L_47
L_49:
	mov rbx, qword [_ok]
	mov rcx, 1
	cmp rbx, rcx
	sete byte [rbp - 232]
	cmp byte [rbp - 232], 0
	jz L_51
L_50:
	jmp L_46
L_46:
	mov rbx, qword [_ok]
	mov rcx, 1
	cmp rbx, rcx
	sete byte [rbp - 248]
	cmp byte [rbp - 248], 0
	jz L_53
L_52:
	mov rbx, qword [_step]
	mov r10, rbx
	mov rbx, qword [_targetx]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 256], rbx
	mov rbx, qword [rbp - 256]
	mov r10, rbx
	mov rbx, qword [_targety]
	mov r11, rbx
	mov rbx, qword [r10 + r11*8]
	mov qword [rbp - 264], rbx
	mov rdi, qword [rbp - 264]
	call toString
	mov rbx, rax
	mov qword [rbp - 272], rbx
	mov rdi, qword [rbp - 272]
	call puts
	mov rbx, rax
	mov qword [rbp - 280], rbx
	jmp L_54
L_54:
	mov rbx, 0
	mov rax, rbx
	jmp L_37
L_37:
	leave
	ret
L_53:
	mov rdi, _string_0
	call print
	mov rbx, rax
	mov qword [rbp - 288], rbx
	jmp L_54
	jmp L_51
L_51:
	mov rbx, qword [_head]
	mov qword [rbp - 240], rbx
	inc qword [_head]
	jmp L_44
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
_N: dq 0
_head: dq 0
_startx: dq 0
_starty: dq 0
_targetx: dq 0
_targety: dq 0
_x: dq 0
_y: dq 0
_tail: dq 0
_ok: dq 0
_now: dq 0
_i: dq 0
_j: dq 0
_string_0_size: dq 13
_string_0: db 110, 111, 32, 115, 111, 108, 117, 116, 105, 111, 110, 33, 10, 0
SECTION .bss
stringbuffer: resb 256
_xlist: dq 0
_ylist: dq 0
_dx: dq 0
_dy: dq 0
_step: dq 0
