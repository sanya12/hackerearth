#!/bin/python

import sys


n = int(raw_input().strip())
a = map(int,raw_input().strip().split(' '))
s=sorted(a)
res=[]
for i in range(len(s)):
    if(a[i]+1 in s):
        res.append(a[i])
        res.append(a[i]+1)
res=sorted(res)
for i in range(len(res)-2):
    if(res.count(res[i])+res.count(res[i+1])) < (res.count(res[i+1])+res.count(res[i+2])):
        value=res.count(res[i])+res.count(res[i+1])
    else:
         value=res.count(res[i+1])+res.count(res[i+2])
#print res
print value