#!/usr/bin/env python
#!-*coding:utf-8-*-
import random
length=0
array=[]
x='x'
while True:
element=input('Lütfen eklemek istediğiniz sayiyi giriniz. Çıkış için x e basiniz')
if element==x:
break;
else:
length=length+1
array.append(element)
i=input('Bulmak istediginiz dizi elemaninin sirasini giriniz')
print array[i-1]
