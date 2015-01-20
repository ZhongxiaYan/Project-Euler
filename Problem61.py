def f3(x):
    return x*(x + 1)//2
def f4(x):
    return x*x
def f5(x):
    return x*(3*x - 1)//2
def f6(x):
    return x*(2*x - 1)
def f7(x):
    return x*(5*x - 3)//2
def f8(x):
    return x*(3*x - 2)
l3 = []
l4 = []
l5 = []
l6 = []
l7 = []
l8 = []
def store(f, lx):
    i = 0
    while i < 150:
        if f(i) > 1000 and f(i) < 10000 and (f(i)//10)%10 != 0:
            lx = lx + [f(i)]
        elif f(i) > 10000:
            i = 200
        i = i + 1
    return lx
l3 = store(f3, l3)
l4 = store(f4, l4)
l5 = store(f5, l5)
l6 = store(f6, l6)
l7 = store(f7, l7)
l8 = store(f8, l8)
print(len(l3), len(l4), len(l5), len(l6), len(l7), len(l8))
def split(listx):
    """a gives the first 2 numbers
    b gives the second 2 numbers"""
    a = [x//100 for x in listx]
    b = [x%100 for x in listx]
    return a, b
l3a, l3b = split(l3)
l4a, l4b = split(l4)
l5a, l5b = split(l5)
l6a, l6b = split(l6)
l7a, l7b = split(l7)
l8a, l8b = split(l8)
def checker(list1, list1x, list2, list3, list4, list5, list6):
    i = 0
    while i < len(list1):
        j = 0
        check = False
        while j < len(list2):
            if list1[i] == list2[j]:
                check = True
                j = 200
            j = j + 1
        j = 0
        while j < len(list3) and check == False:
            if list1[i] == list3[j]:
                check = True
                j = 200
            j = j + 1
        j = 0
        while j < len(list4) and check == False:
            if list1[i] == list4[j]:
                check = True
                j = 200
            j = j + 1
        j = 0
        while j < len(list5) and check == False:
            if list1[i] == list5[j]:
                check = True
                j = 200
            j = j + 1
        j = 0
        while j < len(list6) and check == False:
            if list1[i] == list6[j]:
                check = True
                j = 200
            j = j + 1
        if check == False:
            del list1[i]
            del list1x[i]
            i = i - 1
        i = i + 1
    return list1, list1x
"""checker(l3a, l3b, l4b,l5b,l6b,l7b,l8b)
checker(l4a, l4b, l3b,l5b,l6b,l7b,l8b)
checker(l5a, l5b, l4b,l3b,l6b,l7b,l8b)
checker(l6a, l6b, l4b,l5b,l3b,l7b,l8b)
checker(l7a, l7b, l4b,l5b,l6b,l3b,l8b)
checker(l8a, l8b, l4b,l5b,l3b,l7b,l8b)

checker(l3b, l3a, l4a, l5a, l6a, l7a, l8a)
checker(l4b, l4a, l3a, l5a, l6a, l7a, l8a)
checker(l5b, l5a, l4a, l3a, l6a, l7a, l8a)
checker(l6b, l6a, l4a, l5a, l3a, l7a, l8a)
checker(l7b, l7a, l4a, l5a, l6a, l3a, l8a)
checker(l8b, l8a, l4a, l5a, l6a, l7a, l3a)

checker(l3a, l3b, l4b,l5b,l6b,l7b,l8b)
checker(l4a, l4b, l3b,l5b,l6b,l7b,l8b)
checker(l5a, l5b, l4b,l3b,l6b,l7b,l8b)
checker(l6a, l6b, l4b,l5b,l3b,l7b,l8b)
checker(l7a, l7b, l4b,l5b,l6b,l3b,l8b)
checker(l8a, l8b, l4b,l5b,l3b,l7b,l8b)

checker(l3b, l3a, l4a, l5a, l6a, l7a, l8a)
checker(l4b, l4a, l3a, l5a, l6a, l7a, l8a)
checker(l5b, l5a, l4a, l3a, l6a, l7a, l8a)
checker(l6b, l6a, l4a, l5a, l3a, l7a, l8a)
checker(l7b, l7a, l4a, l5a, l6a, l3a, l8a)
checker(l8b, l8a, l4a, l5a, l6a, l7a, l3a)

checker(l3a, l3b, l4b,l5b,l6b,l7b,l8b)
checker(l4a, l4b, l3b,l5b,l6b,l7b,l8b)
checker(l5a, l5b, l4b,l3b,l6b,l7b,l8b)
checker(l6a, l6b, l4b,l5b,l3b,l7b,l8b)
checker(l7a, l7b, l4b,l5b,l6b,l3b,l8b)
checker(l8a, l8b, l4b,l5b,l3b,l7b,l8b)

checker(l3b, l3a, l4a, l5a, l6a, l7a, l8a)
checker(l4b, l4a, l3a, l5a, l6a, l7a, l8a)
checker(l5b, l5a, l4a, l3a, l6a, l7a, l8a)
checker(l6b, l6a, l4a, l5a, l3a, l7a, l8a)
checker(l7b, l7a, l4a, l5a, l6a, l3a, l8a)
checker(l8b, l8a, l4a, l5a, l6a, l7a, l3a)"""

main1 = [l3a, l4a, l5a, l6a, l7a, l8a]
main2 = [l3b, l4b, l5b, l6b, l7b, l8b]


def compare(ynum, xlist, i = 0):
    term = False
    while i < len(xlist):
        if ynum == xlist[i]:
            term = i
            i = 200
            return term
        i = i + 1
    else:
        return 200
def compare1(ynum, xlist, term):
    if term < len(xlist) and xlist[term] == ynum:
        return term
    else:
        return 200

def repeater():
    i = 0
    while i < len(l3a): 
        z4, z5, z6 ,z7, z8 = 200, 200, 200, 200, 200
        a, b, c, d, e, f, g = checker2(i, l3b[i], z4, z5, z6, z7, z8, 10)
        """print(a, i, b, c, d, e, f, g)"""
        if a == True:
            print(i, b, c, d, e, f, g)
            print(l3a[i]*100 + l3b[i], l4a[b]*100 +l4b[b], l5a[c]*100 + l5b[c], l6a[d] *100+ l6b[d], l7a[e] *100+ l7b[e], l8a[f] *100+l8b[f])
            i = i + 1
        else:
            i = i + 1

def checker2(i, start, z4, z5, z6, z7, z8, lastlist):
    if z4 != 200 and z5 != 200 and z6 != 200 and z7 != 200 and z8 != 200:
        if lastlist == 4:
            x = l4b[z4]
        elif lastlist == 5:
            x = l5b[z5]
        elif lastlist == 6:
            x = l6b[z6]
        elif lastlist == 7:
            x = l7b[z7]
        elif lastlist == 8:
            x = l8b[z8]
        """print(True, z4, z5, z6, z7, z8, lastlist)"""
        if l3a[i] == x:
            return True, z4, z5, z6, z7, z8, lastlist
    if z4 == 200:
        z4 = compare(start, l4a, 0)
        if z4 != 200:
            start1 = l4b[z4]
            lastlist = 4
            a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 4)
            if a == True:
                return a, b, c, d, e, f, lastlist
            else:
        
                z4 = compare1(start1, l4a, z4 + 1)
                if z4 != 200:
                    start1 = l4b[z4]
                    lastlist = 4
                    a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 4)
                    if a == True:
                        return a, b, c, d, e, f, lastlist
        else:
            z4 = 200
    if z5 == 200:
        z5 = compare(start, l5a, 0)
        if z5 != 200:
            start1 = l5b[z5]
            lastlist = 5
            a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 5)
            if a == True:
                return a, b, c, d, e, f, lastlist
            else:
        
                z5 = compare1(start1, l5a, z5 + 1)
                if z5 != 200:
                    start1 = l5b[z5]
                    lastlist = 5
                    a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 5)
                    if a == True:
                        return a, b, c, d, e, f, lastlist
        else:
            z5 = 200
    if z6 == 200:
        z6 = compare(start, l6a, 0)
        if z6 != 200:
            start1 = l6b[z6]
            lastlist = 6
            a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 6)
            if a == True:
                return a, b, c, d, e, f, lastlist
            else:
        
                z6 = compare1(start1, l6a, z6 + 1)
                if z6 != 200:
                    start1 = l6b[z6]
                    lastlist = 6
                    a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 6)
                    if a == True:
                        return a, b, c, d, e, f, lastlist
        else:
            z6 = 200
    if z7 == 200:
        z7 = compare(start, l7a, 0)
        if z7 != 200:
            start1 = l7b[z7]
            lastlist = 7
            a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 7)
            if a == True:
                return a, b, c, d, e, f, lastlist
            else:
        
                z7 = compare1(start1, l7a, z7 + 1)
                if z7 != 200:
                    start1 = l7b[z7]
                    lastlist = 7
                    a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 7)
                    if a == True:
                        return a, b, c, d, e, f, lastlist
        else:
            z7 = 200
    if z8 == 200:
        z8 = compare(start, l8a, 0)
        if z8 != 200:
            start1 = l8b[z8]
            lastlist = 8
            a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 8)
            if a == True:
                return a, b, c, d, e, f, lastlist
            else:
        
                z8 = compare1(start1, l8a, z8 + 1)
                if z8 != 200:
                    start1 = l8b[z8]
                    lastlist = 8
                    a, b, c, d, e, f, lastlist = checker2(i, start1, z4, z5, z6, z7, z8, 8)
                    if a == True:
                        return a, b, c, d, e, f, lastlist
        else:
            z8 = 200
    return False, z4, z5, z6, z7, z8, lastlist

repeater()    
"""
print(l3a)
print(l3b)
print('')
print(l4a)
print(l4b)
print('')
print(l5a)
print(l5b)
print('')
print(l6a)
print(l6b)
print('')
print(l7a)
print(l7b)
print('')
print(l8a)
print(l8b)"""