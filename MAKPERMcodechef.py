T=int(input())
for i in range(0,T):
    count=0
    b=[]
    c=[]
    n=int(input())
    a=[n]
    a=[int(x) for x in input().split()]
    for i in a:
        if(i<=n and i not in b):
            b.append(i)
        else:
            c.append(i)
    value=len(c)

    print(value)