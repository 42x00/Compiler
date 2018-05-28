default rel

global main


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     edx, dword [rbp-0CH]
        mov     eax, dword [rbp-8H]
        add     eax, edx
        mov     dword [rbp-4H], eax
        mov     eax, 0
        pop     rbp
        ret



SECTION .data   


SECTION .bss    


