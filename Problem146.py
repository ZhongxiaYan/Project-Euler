from util import *

N = 150000000
N = 1000000
sum = 0
for i in range(10, N, 2):
    if i % 1000000 == 0:
        print('finished %s' % (i))
    if i % 3 == 0:
        continue
    elif i % 7 == 0:
        continue
    elif i % 13 == 0:
        continue
    i2 = i * i
    if is_prime(i2 + 1) and is_prime(i2 + 3) and is_prime(i2 + 7) and is_prime(i2 + 9) and is_prime(i2 + 13) and is_prime(i2 + 27):
        print(i)
        sum += i
print(sum)