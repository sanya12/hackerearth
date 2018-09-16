#!/bin/python

import sys

def lonelyinteger(a):
    # Complete this function
    for i in a:
        if a.count(i)==1:
            return i

n = int(raw_input().strip())
a = map(int, raw_input().strip().split(' '))
result = lonelyinteger(a)
print(result)
