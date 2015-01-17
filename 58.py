from math import sqrt
def prime_test(x, count):
    a = 3
    if x % 2 == 0:
        a = x
    else:
        while a <= sqrt(x):
            if x % a == 0:
                a = x
            else:
                a = a + 2
    if 1 < x < 4:
        return count + 1
    elif a < x:
        return count + 1
    else:
        return count
def test_spiral(fraction):
    num_total = 1
    side_length = 1
    prime = 0
    corner_num = 1
    while prime/num_total > fraction or num_total < 5:
        side_num = 1
        side_length = side_length + 2
        while side_num < 5:
            corner_num = corner_num + side_length - 1
            prime = prime_test(corner_num, prime)
            side_num = side_num + 1
            '''print(prime)'''
        num_total = 1 + 2*(side_length - 1)
        '''print(prime, num_total)'''
        '''print(side_length)'''
    return side_length
print(test_spiral(.1))
