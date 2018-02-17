#!/bin/python

import sys

def examRush(tm, t):
    # Complete this function
    tm.sort()
    count=0
    for i in tm:
        if(i<=t):
            count=count+1
            t=t-i
    return count        

if __name__ == "__main__":
    n, t = raw_input().strip().split(' ')
    n, t = [int(n), int(t)]
    tm = []
    tm_i = 0
    for tm_i in xrange(n):
        tm_t = int(raw_input().strip())
        tm.append(tm_t)
    result = examRush(tm, t)
    print result
