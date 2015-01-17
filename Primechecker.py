from math import sqrt
def prime_check(x):
    a = 3
    if 1 < x < 4:
        return True
    elif x % 2 == 0:
        return False
    else:
        while a <= sqrt(x):
            if x % a == 0:
                return False
            else:
                a = a + 2
    if not False:
        return True
