T=int(input())
for i in range(0,T):
     n,m,x,y = map(int, input().split(" "))
     n=n-1
     m=m-1
     if (n % x == 0 and m % y == 0):
         print("Chefirnemo")
     elif (n % x == 1 and m  % y == 1):
         print("Chefirnemo")
     elif (n  == 0 and m  % y == 0) :
         print("Chefirnemo")
     elif (m  == 0 and n % x == 0):
         print("Chefirnemo")
     elif(n==1 and m ==1):
         print("Chefirnemo")
     elif (n == 0) and (m  == 0):
         print("Chefirnemo")
     elif (n == 1 and m  % y == 1) :
         print("Chefirnemo")
     elif (m  == 1 and n  % x == 1):
         print("Chefirnemo")
     elif(n%x==0 and x==1 and m%y==1 and n>0):
        print("Chefirnemo")
     elif(n%x==1 and y==1 and m%y==0 and m>0):
        print("Chefirnemo")
     else:
           print("Pofik")