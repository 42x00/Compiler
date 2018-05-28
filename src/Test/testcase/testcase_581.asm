default rel

global main


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-8H], 10
        mov     dword [rbp-4H], 10
        mov     eax, dword [rbp-4H]
        add     dword [rbp-8H], eax
        mov     eax, dword [rbp-8H]
        mov     dword [rbp-4H], eax
        cmp     dword [rbp-8H], 10
        jnz     L_001
        mov     dword [rbp-8H], 20
        jmp     L_002

L_001:  mov     dword [rbp-8H], 30
L_002:  mov     eax, dword [rbp-8H]
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


