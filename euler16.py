import sys
t=int(input())
for i in range(t):
    n=int(input())
    value=pow(2,n)
    ans=sum(map(int, str(value)))
    print (ans)
