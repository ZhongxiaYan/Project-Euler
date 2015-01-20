original = open('Problem54_poker.txt').read().split()
def sort(x, n=10):
    return [x[i: i +n] for i in range(0, len(x), n)]
tens = sort(original)

def hands(num, suit):
    num = [14 if x=='A' else x for x in num]
    num = [13 if x=='K' else x for x in num]
    num = [12 if x=='Q' else x for x in num]
    num = [11 if x=='J' else x for x in num]
    num = [10 if x=='T' else x for x in num]
    s = len(set(num))
    num = [int(x) for x in num]
    def repeat(num):
        if s == 5:
            max1 = max(num)
            num1 = [x for x in num if x != max1]
            max2 = max(num1)
            num2 = [x for x in num1 if x != max2]
            max3 = max(num2)
            num3 = [x for x in num2 if x != max3]
            max4 = max(num3)
            max5 = max([x for x in num3 if x != max4])
            return 1, max1, max2, max3, max4, max5
        elif s == 4:
            repeat1 = 0
            for i in range(0,5):
                for j in range(0,5):
                    if num[i] == num[j] and i != j:
                        repeat1 = num[j]
            norepeat = [x for x in num if x != repeat1]
            max1 = max(norepeat)
            norepeat2 = [x for x in norepeat if x != max1]
            max2 = max(norepeat2)
            max3 = max([x for x in norepeat2 if x != max2])
            return 2, repeat1, max1, max2, max3, None
        elif s == 3:
            maxcounter = 0
            repeat1, repeat2 = 0, 0
            for i in range(0,5):
                counter = 1
                for j in range(0,5):
                    if num[i] == num[j] and i != j:
                        counter = counter + 1
                        if repeat1 == 0:
                            repeat1 = num[j]
                        elif repeat2 == 0 and repeat1 != num[j]:
                            repeat2 = num[j]
                maxcounter = max(counter, maxcounter)
            if maxcounter == 2:
                maxpair1 = max(repeat1, repeat2)
                num1 = [x for x in num if x != maxpair1]
                maxpair2 = min(repeat1, repeat2)
                max3 = max([x for x in num1 if x != maxpair2])
                return 22, maxpair1, maxpair2, max3, None, None
            else:
                triple = repeat1
                return 3, triple, None, None, None, None
        else:
            maxcounter = 0
            repeat1, repeat2 = 0, 0
            for i in range(0,5):
                counter = 1
                for j in range(0,5):
                    if num[i] == num[j] and i != j:
                        if repeat1 == 0:
                            repeat1 = num[j]
                        elif repeat2 == 0 and repeat1 != num[j]:
                            repeat2 = num[j]
                        counter = counter + 1
                maxcounter = max(counter, maxcounter)
            if maxcounter == 4:
                quad = repeat1
                return 4, quad, None, None, None, None
            else:
                num1 = [x for x in num if x != repeat1]
                num2 = [x for x in num if x != repeat2]
                if len(num2) > len(num1):
                    triple = repeat1
                else:
                    triple = repeat2
                return 32, triple, None, None, None, None
    def straight(num):
        a = min(num)
        if int(a) + 4 in num and int(a) + 1 in num and int(a) + 2 in num and int(a) + 3 in num:
            return True
        else:
            return False
    def flush(suit):
        a = suit[0]
        flush = [x for x in suit if x != a]
        if not flush:
            return True
        else:
            return False
    a, b, c, d, e, f = repeat(num)
    g, h = False, False
    if a == 1:
        g = straight(num)
        h = flush(suit)
    if g == True and h == True:
        return 100, b, None, None, None, None
    elif a == 4:
        return 99, b, None, None, None, None
    elif a == 32:
        return 98, b, None, None, None, None
    elif h == True:
        return 97, b, None, None, None, None
    elif g == True:
        return 96, b, None, None, None, None
    elif a == 3:
        return 95, b, None, None, None, None
    elif a == 22:
        return 94, b, c, d, None, None
    elif a == 2:
        return 93, b, c, d, e, None
    elif a == 1:
        return 92, b, c, d, e, f
def match(num1, num2, suit1, suit2):
    a1, b1, c1, d1, e1, f1 = hands(num1, suit1)
    a2, b2, c2, d2, e2, f2 = hands(num2, suit2)
    if a1 > a2:
        return True
    elif a1 == a2:
        if b1 > b2:
            return True
        elif b1 == b2:
            if c1 > c2:
                return True
            elif c1 == c2:
                if d1 > d2:
                    return True
                elif d1 == d2:
                    if e1 > e2:
                        return True
                    elif e1 == e2:
                        if f1 > f2:
                            return True
    else:
        return False
def counter(list1):
    i = 0
    counter = 0
    for i in range(0, 1000):
        li = list1[i]
        a, b, c, d = reader(list1, i)
        if match(a, b, c, d) == True:
            counter = counter + 1
    return counter
def reader(tencards, j):
    numlist1 = []
    numlist2 = []
    suitlist1 = []
    suitlist2 = []
    for i in range(0, 5):
        numlist1 = numlist1 + [tencards[j][i][0]]
        suitlist1 = suitlist1 + [tencards[j][i][1]]
    for i in range(5, 10):
        numlist2 = numlist2 + [tencards[j][i][0]]
        suitlist2 = suitlist2 + [tencards[j][i][1]]
    return numlist1, numlist2, suitlist1, suitlist2
print(counter(tens))