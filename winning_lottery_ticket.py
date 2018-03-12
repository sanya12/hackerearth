#!/bin/python

import sys

def winningLotteryTicket(tickets):
    # Complete this function
    cnt=[0 for _ in xrange(1024)]
    res=0
    for i in tickets:
        mask=0;
        for s in i:
            mask|=1 << (ord(s) - ord('0'))
        cnt[mask]=cnt[mask]+1;
    for i in range(1,1023):
        for j in range(i+1,1024):
            if(i|j==1023):
                res+=cnt[i]*cnt[j]
    res+=cnt[1023]*(cnt[1023]-1)/2
    return res
            
    

if __name__ == "__main__":
    n = int(raw_input().strip())
    tickets = []
    tickets_i = 0
    for tickets_i in xrange(n):
        tickets_t = str(raw_input().strip())
        tickets.append(tickets_t)
    result = winningLotteryTicket(tickets)
    print result
