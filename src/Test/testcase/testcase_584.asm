





default rel

global main


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-4H], 5
        mov     dword [rbp-10H], 0
        mov     dword [rbp-0CH], 1
        jmp     L_004

L_001:  mov     dword [rbp-8H], 1
        jmp     L_003

L_002:  mov     eax, dword [rbp-0CH]
        add     dword [rbp-10H], eax
        add     dword [rbp-8H], 1
L_003:  mov     eax, dword [rbp-8H]
        cmp     eax, dword [rbp-4H]
        jle     L_002
        add     dword [rbp-0CH], 1
L_004:  mov     eax, dword [rbp-0CH]
        cmp     eax, dword [rbp-4H]
        jle     L_001
        mov     eax, dword [rbp-10H]
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


