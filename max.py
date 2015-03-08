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

max=array[0]
i=1
while i<length:
   if array[i]>=max:
       max=array[i]
   i=i+1

print max
