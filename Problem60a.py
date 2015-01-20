import Primechecker
def add_prime(a, b):
    prime_list = []
    while a <= b:
        if Primechecker.prime_check(a):
            prime_list = prime_list + [a]
        a = a + 1
    return prime_list
def prime_test(x, li):
    i = 0
    while i < len(li):
        if x == li[i]:
            return True
        i = i + 1
    return False        
def conc(x, y, li):
    a = str(x)
    b = str(y)
    if prime_test(int(a + b), li):
        return prime_test(int(b + a), li)
    else:
        return False
def prime_set(e, f):
    li = add_prime(e, pow(f, 2))
    a = 0
    while a < len(li):
        b = a + 1
        while b < len(li):
            c = b + 1
            if conc(li[a], li[b], li):
                while c < len(li):
                    d = c + 1
                    if conc(li[a], li[c], li) and conc(li[b], li[c], li):
                        while d < len(li):
                            e = d + 1
                            if conc(li[a], li[d], li) and conc(li[b], li[d], li) and conc(li[c], li[d], li):
                                while e < len(li):
                                    if conc(li[a], li[e], li) and conc(li[b], li[e], li) and conc(li[c], li[e], li) and conc(li[d], li[e], li):
                                        print(li[a], li[b], li[c], li[d], li[e])
                                        a, b, c, d, e = f, f, f, f, f
                                    e = e + 1
                            d = d + 1
                    c = c + 1
            b = b + 1
        a = a + 1
prime_set(3, 10000)
