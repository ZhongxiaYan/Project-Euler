"""def expansion(previous_term):
    return 1 + 1/(1 + previous_term)

def place_counter(x):
    place = 1
    while x >= 10:
        place, x = place + 1, x//10
    return place
def test_all(a, b, denom = 1):
    term = 1
    count = 0
    def fraction(x, denom):
        denominator = denom
        while round((denominator*x), 8) % 1 > 0.00000001:
            denominator = denominator + 1
            '''print(denominator, denominator*x)'''
        return x * denominator, denominator
    while a <= b:
        term = expansion(term)
        num, denom = fraction(term, denom)
        print(a, num, denom)
        if place_counter(num) > place_counter(denom):
            count = count + 1    
        a = a + 1
    return(count)"""
def term(prev_num, prev_denom):
    num = 2 * prev_denom + prev_num
    denom = prev_num + prev_denom
    return(num, denom)
def place_counter(x):
    place = 1
    while x >= 10:
        place, x = place + 1, x//10
    return place
def test(x, y, d):
    if place_counter(x) > place_counter(y):
        return d + 1
    else:
        return d
def test_all(num, denom, repeat):
    counter = 0
    term_count = 0
    while  term_count < repeat:
        num, denom = term(num, denom)
        counter = test(num, denom, counter)
        term_count = term_count + 1
    return counter
print(test_all(1,1, 1000))
