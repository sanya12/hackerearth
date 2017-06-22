'''
# Read input from stdin and provide input before running code

name = raw_input()
print 'Hi, %s.' % name
'''


N=int(input())
a=[]
count=N
a = map(int, raw_input().split())
for i in range(0,N):
    if (i+1)+a[i]>N:
        count=i+1
        break
print count
