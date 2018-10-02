import sys
T=int(input())
for i in range(0,T):
    count=0
    N=int(input())
    for k in range(0,N):
        s,j=map(int,input().split(" "))
        if j-s>5:
            count=count+1
    print(count)