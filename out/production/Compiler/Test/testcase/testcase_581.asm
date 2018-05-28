





default rel

global main


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-4H], 10
        cmp     dword [rbp-4H], 10
        jnz     L_001
        mov     dword [rbp-4H], 20
        jmp     L_002

L_001:  mov     dword [rbp-4H], 30
L_002:  mov     eax, dword [rbp-4H]
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


