import sys
T=int(input())
for i in range(0,T):
    value=""
    n,k=map(int,input().split(" "))
    a=[n]
    a = [int(x) for x in input().split()]
    for x in a:
        if(x<=k):
            value=value+"1"
            k=k-x
        else:
            value=value+"0"

 