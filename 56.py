def place_counter(x):
    place = 1
    while x >= 10:
        place, x = place + 1, x//10
    return place
def sum_digit(x):
    n = place_counter(x)
    k = 0
    result = 0
    while k < n:
        result = result + x // pow(10, k) % 10
        k = k + 1
    return result
def test_all(a, b):
    sum = 0
    j = 1
    while j <= a:
        k = 1
        while k <= b:
            u, k = sum_digit(pow(j, k)), k + 1
            if u > sum:
                sum = u
                print(j, k)
        j = j + 1
    return sum
print(test_all(99, 99))
