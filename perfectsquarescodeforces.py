from math import *
n=int(input())
a=[n]*0
a = [int(x) for x in input().split()]
a=sorted(a, reverse=True)
#print(a)
if(a[0]<0):
    print(a[0])
else:
    for x in range(0,n):
       if(a[x]<0):
           print(a[x])
           break
       else:
          r= pow(a[x],0.5)
          if((r!=int(r))):
             print(a[x])
             break
