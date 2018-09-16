import sys

count_length = [0] * 5001
count_nvalue = []
count_nvalue.append(0)


def fibb():
    a = 1
    b = 1
    n = 2
    l = 0
    count_length[1] = 1
    count_nvalue.append(1)
    while (l != 5000):
        value = a + b
        n = n + 1
        l = len(str(value))
        if count_length[l] == 0:
            count_length[l] = value
            count_nvalue.append(n)
        a = b
        b = value


fibb()
T = int(input())
for i in range(0, T):
    N = int(input())
    print(count_nvalue[N])