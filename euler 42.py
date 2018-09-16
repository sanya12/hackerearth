import math
import sys

T = int(input())
for x in range(0, T):
    n = int(input())
    r = (((1 + (8 * n)) ** 0.5) - 1) / 2
    if (r - int(r)) == 0.0:
        print(int(r))
    else:
        print(-1)

