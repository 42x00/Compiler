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
global _global_h
global _global_i
global _global_j
global _global_k
global _global_total
global main

SECTION .text
main:
	push rbp
	mov rbp, rsp
	sub rsp, 832
	mov qword [_global_h], 99
	mov qword [_global_i], 100
	mov qword [_global_j], 101
	mov qword [_global_k], 102
	mov qword [_global_total], 0
	call getInt
	mov r12, rax
	mov qword [_global_N], r12
	mov r13, 1
L_2:
	cmp r13, qword [_global_N]
	setle r12b
	cmp r12b, 0
	jz L_4
L_3:
	mov qword [rbp - 16], 1
L_5:
	mov rcx, qword [_global_N]
	cmp qword [rbp - 16], rcx
	setle r12b
	cmp r12b, 0
	jz L_7
L_6:
	mov rbx, 1
L_8:
	cmp rbx, qword [_global_N]
	setle r12b
	cmp r12b, 0
	jz L_10
L_9:
	mov qword [rbp - 32], 1
L_11:
	mov rcx, qword [_global_N]
	cmp qword [rbp - 32], rcx
	setle r12b
	cmp r12b, 0
	jz L_13
L_12:
	mov r14, 1
L_14:
	cmp r14, qword [_global_N]
	setle r12b
	cmp r12b, 0
	jz L_16
L_15:
	mov r15, 1
L_17:
	cmp r15, qword [_global_N]
	setle r12b
	cmp r12b, 0
	jz L_19
L_18:
	cmp r13, qword [rbp - 16]
	setne r12b
L_140:
	cmp r12b, 0
	jz L_139
L_141:
	cmp r13, rbx
	setne r12b
L_142:
	cmp r12b, 0
	jz L_139
L_143:
	mov r12, 1
L_137:
	cmp r12b, 0
	jz L_136
L_138:
	cmp r13, qword [rbp - 32]
	setne r12b
L_144:
	cmp r12b, 0
	jz L_136
L_145:
	mov r12, 1
L_134:
	cmp r12b, 0
	jz L_133
L_135:
	cmp r13, r14
	setne r12b
L_146:
	cmp r12b, 0
	jz L_133
L_147:
	mov r12, 1
L_131:
	cmp r12b, 0
	jz L_130
L_132:
	cmp r13, r15
	setne r12b
L_148:
	cmp r12b, 0
	jz L_130
L_149:
	mov r12, 1
L_128:
	cmp r12b, 0
	jz L_127
L_129:
	cmp r13, qword [_global_h]
	setne r12b
L_150:
	cmp r12b, 0
	jz L_127
L_151:
	mov r12, 1
L_125:
	cmp r12b, 0
	jz L_124
L_126:
	cmp r13, qword [_global_i]
	setne r12b
L_152:
	cmp r12b, 0
	jz L_124
L_153:
	mov r12, 1
L_122:
	cmp r12b, 0
	jz L_121
L_123:
	cmp r13, qword [_global_j]
	setne r12b
L_154:
	cmp r12b, 0
	jz L_121
L_155:
	mov r12, 1
L_119:
	cmp r12b, 0
	jz L_118
L_120:
	cmp r13, qword [_global_k]
	setne r12b
L_156:
	cmp r12b, 0
	jz L_118
L_157:
	mov r12, 1
L_116:
	cmp r12b, 0
	jz L_115
L_117:
	cmp qword [rbp - 16], rbx
	setne r12b
L_158:
	cmp r12b, 0
	jz L_115
L_159:
	mov r12, 1
L_113:
	cmp r12b, 0
	jz L_112
L_114:
	mov rcx, qword [rbp - 32]
	cmp qword [rbp - 16], rcx
	setne r12b
L_160:
	cmp r12b, 0
	jz L_112
L_161:
	mov r12, 1
L_110:
	cmp r12b, 0
	jz L_109
L_111:
	cmp qword [rbp - 16], r14
	setne r12b
L_162:
	cmp r12b, 0
	jz L_109
L_163:
	mov r12, 1
L_107:
	cmp r12b, 0
	jz L_106
L_108:
	cmp qword [rbp - 16], r15
	setne r12b
L_164:
	cmp r12b, 0
	jz L_106
L_165:
	mov r12, 1
L_104:
	cmp r12b, 0
	jz L_103
L_105:
	mov rcx, qword [_global_h]
	cmp qword [rbp - 16], rcx
	setne r12b
L_166:
	cmp r12b, 0
	jz L_103
L_167:
	mov r12, 1
L_101:
	cmp r12b, 0
	jz L_100
L_102:
	mov rcx, qword [_global_i]
	cmp qword [rbp - 16], rcx
	setne r12b
L_168:
	cmp r12b, 0
	jz L_100
L_169:
	mov r12, 1
L_98:
	cmp r12b, 0
	jz L_97
L_99:
	mov rcx, qword [_global_j]
	cmp qword [rbp - 16], rcx
	setne r12b
L_170:
	cmp r12b, 0
	jz L_97
L_171:
	mov r12, 1
L_95:
	cmp r12b, 0
	jz L_94
L_96:
	mov rcx, qword [_global_k]
	cmp qword [rbp - 16], rcx
	setne r12b
L_172:
	cmp r12b, 0
	jz L_94
L_173:
	mov r12, 1
L_92:
	cmp r12b, 0
	jz L_91
L_93:
	cmp rbx, qword [rbp - 32]
	setne r12b
L_174:
	cmp r12b, 0
	jz L_91
L_175:
	mov r12, 1
L_89:
	cmp r12b, 0
	jz L_88
L_90:
	cmp rbx, r14
	setne r12b
L_176:
	cmp r12b, 0
	jz L_88
L_177:
	mov r12, 1
L_86:
	cmp r12b, 0
	jz L_85
L_87:
	cmp rbx, r15
	setne r12b
L_178:
	cmp r12b, 0
	jz L_85
L_179:
	mov r12, 1
L_83:
	cmp r12b, 0
	jz L_82
L_84:
	cmp rbx, qword [_global_h]
	setne r12b
L_180:
	cmp r12b, 0
	jz L_82
L_181:
	mov r12, 1
L_80:
	cmp r12b, 0
	jz L_79
L_81:
	cmp rbx, qword [_global_i]
	setne r12b
L_182:
	cmp r12b, 0
	jz L_79
L_183:
	mov r12, 1
L_77:
	cmp r12b, 0
	jz L_76
L_78:
	cmp rbx, qword [_global_j]
	setne r12b
L_184:
	cmp r12b, 0
	jz L_76
L_185:
	mov r12, 1
L_74:
	cmp r12b, 0
	jz L_73
L_75:
	cmp rbx, qword [_global_k]
	setne r12b
L_186:
	cmp r12b, 0
	jz L_73
L_187:
	mov r12, 1
L_71:
	cmp r12b, 0
	jz L_70
L_72:
	cmp qword [rbp - 32], r14
	setne r12b
L_188:
	cmp r12b, 0
	jz L_70
L_189:
	mov r12, 1
L_68:
	cmp r12b, 0
	jz L_67
L_69:
	cmp qword [rbp - 32], r15
	setne r12b
L_190:
	cmp r12b, 0
	jz L_67
L_191:
	mov r12, 1
L_65:
	cmp r12b, 0
	jz L_64
L_66:
	mov rcx, qword [_global_h]
	cmp qword [rbp - 32], rcx
	setne r12b
L_192:
	cmp r12b, 0
	jz L_64
L_193:
	mov r12, 1
L_62:
	cmp r12b, 0
	jz L_61
L_63:
	mov rcx, qword [_global_i]
	cmp qword [rbp - 32], rcx
	setne r12b
L_194:
	cmp r12b, 0
	jz L_61
L_195:
	mov r12, 1
L_59:
	cmp r12b, 0
	jz L_58
L_60:
	mov rcx, qword [_global_j]
	cmp qword [rbp - 32], rcx
	setne r12b
L_196:
	cmp r12b, 0
	jz L_58
L_197:
	mov r12, 1
L_56:
	cmp r12b, 0
	jz L_55
L_57:
	mov rcx, qword [_global_k]
	cmp qword [rbp - 32], rcx
	setne r12b
L_198:
	cmp r12b, 0
	jz L_55
L_199:
	mov r12, 1
L_53:
	cmp r12b, 0
	jz L_52
L_54:
	cmp r14, r15
	setne r12b
L_200:
	cmp r12b, 0
	jz L_52
L_201:
	mov r12, 1
L_50:
	cmp r12b, 0
	jz L_49
L_51:
	cmp r14, qword [_global_h]
	setne r12b
L_202:
	cmp r12b, 0
	jz L_49
L_203:
	mov r12, 1
L_47:
	cmp r12b, 0
	jz L_46
L_48:
	cmp r14, qword [_global_i]
	setne r12b
L_204:
	cmp r12b, 0
	jz L_46
L_205:
	mov r12, 1
L_44:
	cmp r12b, 0
	jz L_43
L_45:
	cmp r14, qword [_global_j]
	setne r12b
L_206:
	cmp r12b, 0
	jz L_43
L_207:
	mov r12, 1
L_41:
	cmp r12b, 0
	jz L_40
L_42:
	cmp r14, qword [_global_k]
	setne r12b
L_208:
	cmp r12b, 0
	jz L_40
L_209:
	mov r12, 1
L_38:
	cmp r12b, 0
	jz L_37
L_39:
	cmp r15, qword [_global_h]
	setne r12b
L_210:
	cmp r12b, 0
	jz L_37
L_211:
	mov r12, 1
L_35:
	cmp r12b, 0
	jz L_34
L_36:
	cmp r15, qword [_global_i]
	setne r12b
L_212:
	cmp r12b, 0
	jz L_34
L_213:
	mov r12, 1
L_32:
	cmp r12b, 0
	jz L_31
L_33:
	cmp r15, qword [_global_j]
	setne r12b
L_214:
	cmp r12b, 0
	jz L_31
L_215:
	mov r12, 1
L_29:
	cmp r12b, 0
	jz L_28
L_30:
	cmp r15, qword [_global_k]
	setne r12b
L_216:
	cmp r12b, 0
	jz L_28
L_217:
	mov r12, 1
L_26:
	cmp r12b, 0
	jz L_25
L_27:
	mov rcx, qword [_global_j]
	cmp qword [_global_i], rcx
	setne r12b
L_218:
	cmp r12b, 0
	jz L_25
L_219:
	mov r12, 1
L_23:
	cmp r12b, 0
	jz L_22
L_24:
	mov rcx, qword [_global_k]
	cmp qword [_global_h], rcx
	setne r12b
L_220:
	cmp r12b, 0
	jz L_22
L_221:
	mov r12, 1
	cmp r12b, 0
	jz L_21
L_20:
	mov r12, qword [_global_total]
	inc qword [_global_total]
	mov rcx, qword [_global_total]
	mov qword [_global_total], rcx
L_21:
	mov r12, r15
	inc r15
		jmp L_17
L_22:
	mov r12, 0
	jmp L_21
L_25:
	mov r12, 0
	jmp L_23
L_28:
	mov r12, 0
	jmp L_26
L_31:
	mov r12, 0
	jmp L_29
L_34:
	mov r12, 0
	jmp L_32
L_37:
	mov r12, 0
	jmp L_35
L_40:
	mov r12, 0
	jmp L_38
L_43:
	mov r12, 0
	jmp L_41
L_46:
	mov r12, 0
	jmp L_44
L_49:
	mov r12, 0
	jmp L_47
L_52:
	mov r12, 0
	jmp L_50
L_55:
	mov r12, 0
	jmp L_53
L_58:
	mov r12, 0
	jmp L_56
L_61:
	mov r12, 0
	jmp L_59
L_64:
	mov r12, 0
	jmp L_62
L_67:
	mov r12, 0
	jmp L_65
L_70:
	mov r12, 0
	jmp L_68
L_73:
	mov r12, 0
	jmp L_71
L_76:
	mov r12, 0
	jmp L_74
L_79:
	mov r12, 0
	jmp L_77
L_82:
	mov r12, 0
	jmp L_80
L_85:
	mov r12, 0
	jmp L_83
L_88:
	mov r12, 0
	jmp L_86
L_91:
	mov r12, 0
	jmp L_89
L_94:
	mov r12, 0
	jmp L_92
L_97:
	mov r12, 0
	jmp L_95
L_100:
	mov r12, 0
	jmp L_98
L_103:
	mov r12, 0
	jmp L_101
L_106:
	mov r12, 0
	jmp L_104
L_109:
	mov r12, 0
	jmp L_107
L_112:
	mov r12, 0
	jmp L_110
L_115:
	mov r12, 0
	jmp L_113
L_118:
	mov r12, 0
	jmp L_116
L_121:
	mov r12, 0
	jmp L_119
L_124:
	mov r12, 0
	jmp L_122
L_127:
	mov r12, 0
	jmp L_125
L_130:
	mov r12, 0
	jmp L_128
L_133:
	mov r12, 0
	jmp L_131
L_136:
	mov r12, 0
	jmp L_134
L_139:
	mov r12, 0
	jmp L_137
L_19:
	mov r12, r14
	inc r14
		jmp L_14
L_16:
	mov r12, qword [rbp - 32]
	inc qword [rbp - 32]
	mov rcx, qword [rbp - 32]
	mov qword [rbp - 32], rcx
	jmp L_11
L_13:
	mov r12, rbx
	inc rbx
		jmp L_8
L_10:
	mov r12, qword [rbp - 16]
	inc qword [rbp - 16]
	mov rcx, qword [rbp - 16]
	mov qword [rbp - 16], rcx
	jmp L_5
L_7:
	mov r12, r13
	inc r13
		jmp L_2
L_4:
	mov rdi, qword [_global_total]
	call toString
	mov r12, rax
	mov rdi, r12
	call puts
	mov r12, rax
	mov rax, 0
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
_global_h: dq 0
_global_i: dq 0
_global_j: dq 0
_global_k: dq 0
_global_total: dq 0
SECTION .bss
stringbuffer: resb 256
