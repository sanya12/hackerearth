import sys
import math

count = [0] * 1001
print("hello")


def fact(num):
    counter = 0
    for i in range(1, num + 1):
        if num % i == 0:
            counter = counter + 1
    return counter


def calculate():
    start = 2
    trian = 1
    N = 1
    count[1] = 1

    while (N != 1000):
        trian = trian + start
        print(trian)
        factors_no = fact(trian)
        if count[factors_no] == 0:
            count[factors_no] = trian;
            print(count[factors_no])
            N = N + 1
            print(                                  N)
        start = start + 1


print("value1")
calculate()
T = int(input())
for x in range(0, T):
    n = int(input())
    print(count[n + 1])


