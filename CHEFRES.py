from bisect import bisect_right
T=int(input())
for i in range(0,T):
     N,M=map(int,input().split(' '))
     l=[]
     r=[]
     for j in range(0,N):
         L,R=map(int,input().split(" "))
         l.append(L)
         r.append(R)
     l=sorted(l)
     r=sorted(r)
     l.append(10000000)
     ans=[]
     for j in range(0, M):
         p=int(input())
         if p>=r[len(r)-1]:
                ans.append(-1)
         elif (p < l[0]):
               ans.append(l[0]-p)
         else:
            ins=bisect_right(r,p)
            if(l[ins]-p>0):
                ans.append(l[ins]-p)
            else:
                ans.append(0)

     for val in ans:
          print (val),