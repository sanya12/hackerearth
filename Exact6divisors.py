import math
import sys
count_for_six_divisors=0
for i in range(1,101):
    count=0
    for x in range(1,i+1):
        if i%x == 0:
            count=count+1
        if count>6:
            break
    if count==6:
        count_for_six_divisors+=1
        print (i)
print("Answer",count_for_six_divisors)
