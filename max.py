#!/usr/bin/env python
#!-*coding:utf-8-*-
import random
length=0
array=[]
x='x'
while True:
  eleman=input('Lütfen eklemek istediğiniz sayiyi giriniz. Çıkış için x e basiniz')
  if eleman==x:
      break;
  else:
      length=length+1
      array.append(eleman)

max=array[0]
i=1
while i<length:
   if array[i]>=max:
       max=array[i]
   i=i+1

print max
