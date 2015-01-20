import Primechecker
def add_prime(a, b):
    prime_list = []
    while a <= b:
        if Primechecker.prime_check(a):
            prime_list = prime_list + [a]
        a = a + 1
    return prime_list
def conc(x, y):
    a = str(x)
    b = str(y)
    if Primechecker.prime_check(int(a + b)):
        return Primechecker.prime_check(int(b + a))
    else:
        return False
def prime_set(e, f):
    li = add_prime(e, f)
    a = 0
    while a < len(li):
        b = a + 1
        while b < len(li):
            c = b + 1
            if conc(li[a], li[b]):
                while c < len(li):
                    d = c + 1
                    if conc(li[a], li[c]) and conc(li[b], li[c]):
                        while d < len(li):
                            e = d + 1
                            if conc(li[a], li[d]) and conc(li[b], li[d]) and conc(li[c], li[d]):
                                while e < len(li):
                                    if conc(li[a], li[e]) and conc(li[b], li[e]) and conc(li[c], li[e]) and conc(li[d], li[e]):
                                        print(li[a], li[b], li[c], li[d], li[e])
                                        a, b, c, d, e = f, f, f, f, f
                                    e = e + 1
                            d = d + 1
                    c = c + 1
            b = b + 1
        a = a + 1
prime_set(3, 10000)
