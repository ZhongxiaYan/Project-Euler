def digit(x):
    """
    >>> digit(240873)
    6
    """
    digit_count = 0
    while x:
        x = x//10
        digit_count = digit_count + 1
    return digit_count
from math import pow
def count(start = 1):
    count = 0
    n = True
    while n:
        b = count
        power = 1
        a = True
        while a:
            a = False
            num = pow(start, power)
            if digit(num) == power:
                count = count + 1
                a = True
            power = power + 1
        if b == count:
            n = False
        start = start + 1
    return count
e = count(1)
print(e)