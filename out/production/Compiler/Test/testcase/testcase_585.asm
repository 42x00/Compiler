





default rel

global main


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-8H], 5
        mov     dword [rbp-4H], 0
        cmp     dword [rbp-4H], 0
        jz      L_001
        mov     eax, dword [rbp-8H]
        cdq
        idiv    dword [rbp-4H]
        cmp     eax, 1
        jz      L_001
        mov     dword [rbp-0CH], 10
        jmp     L_002

L_001:  mov     dword [rbp-0CH], 20
L_002:  cmp     dword [rbp-0CH], 10
        jnz     L_003
        mov     eax, dword [rbp-8H]
        cdq
        idiv    dword [rbp-4H]
        test    eax, eax
        jnz     L_003
        cmp     dword [rbp-8H], 5
        jz      L_004
L_003:  mov     dword [rbp-0CH], 30
L_004:  mov     eax, dword [rbp-0CH]
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


