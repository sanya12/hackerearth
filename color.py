T=input()
for i in range(0,T):
    N=raw_input()
    a=raw_input().split()
    a1=set(a)
    print len(a)-len(a1)