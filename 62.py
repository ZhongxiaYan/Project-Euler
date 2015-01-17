def compdig(x, y):
    """
    compares the digits of x and y
    >>> compdig(345, 543)
    True
    >>> compdig(4524, 5442)
    True
    >>> compdig(234, 334)
    False
    """
    a = intlist(x)
    b = intlist(y)
    i = 0
    if len(a) != len(b):
        return False
    elif complist(a, b):
        return True
    else:
        return False
def intlist(n):
    """
    return list of digits of a number
    >>> intlist(45234)
    [4, 3, 2, 5, 4]
    """
    list1 = []
    while n:
        list1.append(n % 10)
        n = n//10
    return list1
def complist(list1, list2):
    list1.sort()
    list2.sort()
    i = 0
    while i < len(list1):
        if list1[i] != list2[i]:
            return False
        i = i + 1
    return True
def cubelist(start, end):
    """
    creates list of cube
    >>> cubelist(3, 6)
    [27, 64, 125, 216]
    """
    list1 = []
    while start <= end:
        list1 = list1 + [start*start*start]
        start = start + 1
    return list1
def findcubes(start, end):
    list1 = cubelist(start, end)
    i = 0
    while i < len(list1):
        count = 1
        j = i + 1
        while j < len(list1):
            if compdig(list1[i], list1[j]):
                count = count + 1
            if count == 5:
                print(list1[i])
                return
            j = j + 1
        del list1[i]
    print('end')
    return
print(findcubes(4800, 10000))