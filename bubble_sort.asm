.model small
.data
a dw 1520,-2100,-100,25
.code
mov ax,@data
mov ds, ax
mov dx,04
dec dx
outer:mov cx,dx
      lea si,a
again:mov ax,[si]
      cmp ax,[si+2]
      jle l1
      xchg ax,[si+2]
      xchg ax,[si]
l1: inc si
    inc si
  dec cx
  jnz again
  dec dx
  jnz outer
 mov ah,4ch
 int 21h
 end
