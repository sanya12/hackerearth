import math
import sys

T = int(input())
for i in range(0, T):
    n, x, s = map(int,input().split(" "))
    coin = x
    for j in range(0, s):
        a, b = map(int,input().split(" "))
        if coin == a:
            coin = b
        elif coin == b:
            coin = a
    print(coin)
