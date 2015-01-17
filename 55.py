def place_counter(x):
    place = 1
    while x >= 10:
        place, x = place + 1, x//10
    return place
def palindrome(x):
    n = place_counter(x)
    k = 0
    result = 0
    while k < n:
        result = result + x // pow(10, k) % 10 * pow(10, n-k-1)
        k = k + 1
    return result
def test(x, count = 1):
    if count > 50:
        return 1
    elif x == palindrome(x) and count > 1:
        return 0
    else:
        return test(x + palindrome(x), count + 1)
def test_all(a, b):
    eventual_palindromes = 0
    original_a = a
    while a <= b:
        eventual_palindromes, a = eventual_palindromes + test(a), a + 1
    print(eventual_palindromes)
test_all(1, 9999)
        
