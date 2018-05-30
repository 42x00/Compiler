





default rel

global main


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     dword [rbp-8H], 0
        cmp     dword [rbp-8H], 0
        sete    al
        movzx   eax, al
        mov     dword [rbp-4H], eax
        mov     eax, dword [rbp-4H]
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


