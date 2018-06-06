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
	sub rsp, 1032
	call getInt
	mov r12, rax
	mov qword [rbp - 64], r12
	mov rbx, 0
	mov qword [rbp - 80], rbx
	mov r13, 0
	jmp L_2
L_2:
	mov rbx, r13
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_4
L_3:
	mov rbx, 0
	mov qword [rbp - 16], rbx
	jmp L_5
L_5:
	mov rbx, qword [rbp - 16]
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_7
L_6:
	mov rbx, 0
	mov qword [rbp - 24], rbx
	jmp L_8
L_8:
	mov rbx, qword [rbp - 24]
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_10
L_9:
	mov r15, 0
	jmp L_11
L_11:
	mov rbx, r15
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_13
L_12:
	mov rbx, 0
	mov qword [rbp - 40], rbx
	jmp L_14
L_14:
	mov rbx, qword [rbp - 40]
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_16
L_15:
	mov rbx, 0
	mov qword [rbp - 48], rbx
	jmp L_17
L_17:
	mov rbx, qword [rbp - 48]
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_19
L_18:
	mov rbx, 0
	mov qword [rbp - 56], rbx
	jmp L_20
L_20:
	mov rbx, qword [rbp - 56]
	mov rcx, qword [rbp - 64]
	cmp rbx, rcx
	setl r12b
	cmp r12b, 0
	jz L_22
L_21:
	mov rbx, r13
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	sete r12b
	jmp L_34
L_34:
	cmp r12b, 0
	jz L_33
L_35:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_36
L_36:
	cmp r12b, 0
	jz L_33
L_37:
	mov r12, 1
	jmp L_31
L_31:
	cmp r12b, 0
	jz L_32
L_30:
	mov r12, 1
	jmp L_28
L_28:
	cmp r12b, 0
	jz L_29
L_27:
	mov r12, 1
	jmp L_25
L_25:
	cmp r12b, 0
	jz L_26
L_24:
	mov r12, 1
	jmp L_23
L_23:
	mov qword [rbp - 144], r12
	mov rbx, r13
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	sete r12b
	jmp L_70
L_70:
	cmp r12b, 0
	jz L_69
L_71:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_72
L_72:
	cmp r12b, 0
	jz L_69
L_73:
	mov r12, 1
	jmp L_67
L_67:
	cmp r12b, 0
	jz L_68
L_66:
	mov r12, 1
	jmp L_64
L_64:
	cmp r12b, 0
	jz L_65
L_63:
	mov r12, 1
	jmp L_61
L_61:
	cmp r12b, 0
	jz L_62
L_60:
	mov r12, 1
	jmp L_59
L_59:
	mov qword [rbp - 272], r12
	mov rbx, r13
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	sete r12b
	jmp L_106
L_106:
	cmp r12b, 0
	jz L_105
L_107:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_108
L_108:
	cmp r12b, 0
	jz L_105
L_109:
	mov r12, 1
	jmp L_103
L_103:
	cmp r12b, 0
	jz L_104
L_102:
	mov r12, 1
	jmp L_100
L_100:
	cmp r12b, 0
	jz L_101
L_99:
	mov r12, 1
	jmp L_97
L_97:
	cmp r12b, 0
	jz L_98
L_96:
	mov r12, 1
	jmp L_95
L_95:
	mov r14, r12
	mov rbx, r13
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	sete r12b
	jmp L_142
L_142:
	cmp r12b, 0
	jz L_141
L_143:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_144
L_144:
	cmp r12b, 0
	jz L_141
L_145:
	mov r12, 1
	jmp L_139
L_139:
	cmp r12b, 0
	jz L_140
L_138:
	mov r12, 1
	jmp L_136
L_136:
	cmp r12b, 0
	jz L_137
L_135:
	mov r12, 1
	jmp L_133
L_133:
	cmp r12b, 0
	jz L_134
L_132:
	mov r12, 1
	jmp L_131
L_131:
	mov qword [rbp - 528], r12
	mov rbx, r13
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	sete r12b
	jmp L_178
L_178:
	cmp r12b, 0
	jz L_177
L_179:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_180
L_180:
	cmp r12b, 0
	jz L_177
L_181:
	mov r12, 1
	jmp L_175
L_175:
	cmp r12b, 0
	jz L_176
L_174:
	mov r12, 1
	jmp L_172
L_172:
	cmp r12b, 0
	jz L_173
L_171:
	mov r12, 1
	jmp L_169
L_169:
	cmp r12b, 0
	jz L_170
L_168:
	mov r12, 1
	jmp L_167
L_167:
	mov qword [rbp - 656], r12
	mov rbx, r13
	mov rcx, qword [rbp - 16]
	cmp rbx, rcx
	sete r12b
	jmp L_214
L_214:
	cmp r12b, 0
	jz L_213
L_215:
	mov rbx, qword [rbp - 24]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_216
L_216:
	cmp r12b, 0
	jz L_213
L_217:
	mov r12, 1
	jmp L_211
L_211:
	cmp r12b, 0
	jz L_212
L_210:
	mov r12, 1
	jmp L_208
L_208:
	cmp r12b, 0
	jz L_209
L_207:
	mov r12, 1
	jmp L_205
L_205:
	cmp r12b, 0
	jz L_206
L_204:
	mov r12, 1
	jmp L_203
L_203:
	mov qword [rbp - 784], r12
	cmp byte [rbp - 144], 0
	jz L_240
L_239:
	mov r12, qword [rbp - 80]
	inc qword [rbp - 80]
	jmp L_240
L_240:
	cmp byte [rbp - 272], 0
	jz L_242
L_241:
	mov r12, qword [rbp - 80]
	inc qword [rbp - 80]
	jmp L_242
L_242:
	cmp r14b, 0
	jz L_244
L_243:
	mov r12, qword [rbp - 80]
	inc qword [rbp - 80]
	jmp L_244
L_244:
	cmp byte [rbp - 528], 0
	jz L_246
L_245:
	mov r12, qword [rbp - 80]
	inc qword [rbp - 80]
	jmp L_246
L_246:
	cmp byte [rbp - 656], 0
	jz L_248
L_247:
	mov r12, qword [rbp - 80]
	inc qword [rbp - 80]
	jmp L_248
L_248:
	cmp byte [rbp - 784], 0
	jz L_250
L_249:
	mov r12, qword [rbp - 80]
	inc qword [rbp - 80]
	jmp L_250
L_250:
	inc qword [rbp - 56]
mov rcx, qword [rbp - 56]
	mov r12, rcx
	jmp L_20
L_206:
	mov rbx, r15
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_235
L_235:
	cmp r12b, 0
	jz L_234
L_236:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_237
L_237:
	cmp r12b, 0
	jz L_234
L_238:
	mov r12, 1
	jmp L_232
L_232:
	cmp r12b, 0
	jnz L_204
L_233:
	mov r12, 0
	jmp L_203
L_234:
	mov r12, 0
	jmp L_232
L_209:
	mov rbx, r13
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete r12b
	jmp L_230
L_230:
	cmp r12b, 0
	jnz L_207
L_231:
	mov r12, 0
	jmp L_205
L_212:
	mov rbx, r15
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete r12b
	jmp L_224
L_224:
	cmp r12b, 0
	jz L_223
L_225:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_226
L_226:
	cmp r12b, 0
	jz L_223
L_227:
	mov r12, 1
	jmp L_221
L_221:
	cmp r12b, 0
	jz L_220
L_222:
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_228
L_228:
	cmp r12b, 0
	jz L_220
L_229:
	mov r12, 1
	jmp L_218
L_218:
	cmp r12b, 0
	jnz L_210
L_219:
	mov r12, 0
	jmp L_208
L_220:
	mov r12, 0
	jmp L_218
L_223:
	mov r12, 0
	jmp L_221
L_213:
	mov r12, 0
	jmp L_211
L_170:
	mov rbx, r15
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_199
L_199:
	cmp r12b, 0
	jz L_198
L_200:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_201
L_201:
	cmp r12b, 0
	jz L_198
L_202:
	mov r12, 1
	jmp L_196
L_196:
	cmp r12b, 0
	jnz L_168
L_197:
	mov r12, 0
	jmp L_167
L_198:
	mov r12, 0
	jmp L_196
L_173:
	mov rbx, r13
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete r12b
	jmp L_194
L_194:
	cmp r12b, 0
	jnz L_171
L_195:
	mov r12, 0
	jmp L_169
L_176:
	mov rbx, r15
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete r12b
	jmp L_188
L_188:
	cmp r12b, 0
	jz L_187
L_189:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_190
L_190:
	cmp r12b, 0
	jz L_187
L_191:
	mov r12, 1
	jmp L_185
L_185:
	cmp r12b, 0
	jz L_184
L_186:
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_192
L_192:
	cmp r12b, 0
	jz L_184
L_193:
	mov r12, 1
	jmp L_182
L_182:
	cmp r12b, 0
	jnz L_174
L_183:
	mov r12, 0
	jmp L_172
L_184:
	mov r12, 0
	jmp L_182
L_187:
	mov r12, 0
	jmp L_185
L_177:
	mov r12, 0
	jmp L_175
L_134:
	mov rbx, r15
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_163
L_163:
	cmp r12b, 0
	jz L_162
L_164:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_165
L_165:
	cmp r12b, 0
	jz L_162
L_166:
	mov r12, 1
	jmp L_160
L_160:
	cmp r12b, 0
	jnz L_132
L_161:
	mov r12, 0
	jmp L_131
L_162:
	mov r12, 0
	jmp L_160
L_137:
	mov rbx, r13
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete r12b
	jmp L_158
L_158:
	cmp r12b, 0
	jnz L_135
L_159:
	mov r12, 0
	jmp L_133
L_140:
	mov rbx, r15
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete r12b
	jmp L_152
L_152:
	cmp r12b, 0
	jz L_151
L_153:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_154
L_154:
	cmp r12b, 0
	jz L_151
L_155:
	mov r12, 1
	jmp L_149
L_149:
	cmp r12b, 0
	jz L_148
L_150:
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_156
L_156:
	cmp r12b, 0
	jz L_148
L_157:
	mov r12, 1
	jmp L_146
L_146:
	cmp r12b, 0
	jnz L_138
L_147:
	mov r12, 0
	jmp L_136
L_148:
	mov r12, 0
	jmp L_146
L_151:
	mov r12, 0
	jmp L_149
L_141:
	mov r12, 0
	jmp L_139
L_98:
	mov rbx, r15
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_127
L_127:
	cmp r12b, 0
	jz L_126
L_128:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_129
L_129:
	cmp r12b, 0
	jz L_126
L_130:
	mov r12, 1
	jmp L_124
L_124:
	cmp r12b, 0
	jnz L_96
L_125:
	mov r12, 0
	jmp L_95
L_126:
	mov r12, 0
	jmp L_124
L_101:
	mov rbx, r13
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete r12b
	jmp L_122
L_122:
	cmp r12b, 0
	jnz L_99
L_123:
	mov r12, 0
	jmp L_97
L_104:
	mov rbx, r15
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete r12b
	jmp L_116
L_116:
	cmp r12b, 0
	jz L_115
L_117:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_118
L_118:
	cmp r12b, 0
	jz L_115
L_119:
	mov r12, 1
	jmp L_113
L_113:
	cmp r12b, 0
	jz L_112
L_114:
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_120
L_120:
	cmp r12b, 0
	jz L_112
L_121:
	mov r12, 1
	jmp L_110
L_110:
	cmp r12b, 0
	jnz L_102
L_111:
	mov r12, 0
	jmp L_100
L_112:
	mov r12, 0
	jmp L_110
L_115:
	mov r12, 0
	jmp L_113
L_105:
	mov r12, 0
	jmp L_103
L_62:
	mov rbx, r15
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_91
L_91:
	cmp r12b, 0
	jz L_90
L_92:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_93
L_93:
	cmp r12b, 0
	jz L_90
L_94:
	mov r12, 1
	jmp L_88
L_88:
	cmp r12b, 0
	jnz L_60
L_89:
	mov r12, 0
	jmp L_59
L_90:
	mov r12, 0
	jmp L_88
L_65:
	mov rbx, r13
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete r12b
	jmp L_86
L_86:
	cmp r12b, 0
	jnz L_63
L_87:
	mov r12, 0
	jmp L_61
L_68:
	mov rbx, r15
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete r12b
	jmp L_80
L_80:
	cmp r12b, 0
	jz L_79
L_81:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_82
L_82:
	cmp r12b, 0
	jz L_79
L_83:
	mov r12, 1
	jmp L_77
L_77:
	cmp r12b, 0
	jz L_76
L_78:
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_84
L_84:
	cmp r12b, 0
	jz L_76
L_85:
	mov r12, 1
	jmp L_74
L_74:
	cmp r12b, 0
	jnz L_66
L_75:
	mov r12, 0
	jmp L_64
L_76:
	mov r12, 0
	jmp L_74
L_79:
	mov r12, 0
	jmp L_77
L_69:
	mov r12, 0
	jmp L_67
L_26:
	mov rbx, r15
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_55
L_55:
	cmp r12b, 0
	jz L_54
L_56:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_57
L_57:
	cmp r12b, 0
	jz L_54
L_58:
	mov r12, 1
	jmp L_52
L_52:
	cmp r12b, 0
	jnz L_24
L_53:
	mov r12, 0
	jmp L_23
L_54:
	mov r12, 0
	jmp L_52
L_29:
	mov rbx, r13
	mov rcx, qword [rbp - 56]
	cmp rbx, rcx
	sete r12b
	jmp L_50
L_50:
	cmp r12b, 0
	jnz L_27
L_51:
	mov r12, 0
	jmp L_25
L_32:
	mov rbx, r15
	mov rcx, qword [rbp - 40]
	cmp rbx, rcx
	sete r12b
	jmp L_44
L_44:
	cmp r12b, 0
	jz L_43
L_45:
	mov rbx, qword [rbp - 48]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_46
L_46:
	cmp r12b, 0
	jz L_43
L_47:
	mov r12, 1
	jmp L_41
L_41:
	cmp r12b, 0
	jz L_40
L_42:
	mov rbx, qword [rbp - 56]
	mov rcx, 0
	cmp rbx, rcx
	setg r12b
	jmp L_48
L_48:
	cmp r12b, 0
	jz L_40
L_49:
	mov r12, 1
	jmp L_38
L_38:
	cmp r12b, 0
	jnz L_30
L_39:
	mov r12, 0
	jmp L_28
L_40:
	mov r12, 0
	jmp L_38
L_43:
	mov r12, 0
	jmp L_41
L_33:
	mov r12, 0
	jmp L_31
L_22:
	inc qword [rbp - 48]
mov rcx, qword [rbp - 48]
	mov r12, rcx
	jmp L_17
L_19:
	inc qword [rbp - 40]
mov rcx, qword [rbp - 40]
	mov r12, rcx
	jmp L_14
L_16:
	inc r15
mov rcx, r15
	mov r12, rcx
	jmp L_11
L_13:
	inc qword [rbp - 24]
mov rcx, qword [rbp - 24]
	mov r12, rcx
	jmp L_8
L_10:
	inc qword [rbp - 16]
mov rcx, qword [rbp - 16]
	mov r12, rcx
	jmp L_5
L_7:
	inc r13
mov rcx, r13
	mov r12, rcx
	jmp L_2
L_4:
	mov rdi, qword [rbp - 80]
	call toString
	mov r12, rax
	mov rdi, r12
	call print
	mov r12, rax
	mov rax, 0
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
SECTION .bss
stringbuffer: resb 256
