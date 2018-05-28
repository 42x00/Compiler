





default rel

global main
global x


SECTION .text   

main:
        push    rbp
        mov     rbp, rsp
        mov     dword [rel x], 20
        mov     eax, dword [rel x]
        pop     rbp
        ret



SECTION .data   align=4

x:
        dd 0000000AH


SECTION .bss    


