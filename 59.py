values = open('59 cipher.txt').read().split(',')
values = [int(i) for i in values]
#values = values[0:50]
'''def convert(li, term_choice):
    while term_choice < len(li):
        #li[term_choice] = li[term_choice] + shift
        #print(term_choice)
        while li[term_choice] < 65:
            i = term_choice%3
            while i < len(li):
                li[i] = li[i] + 1
                i = i + 3
                #li[i] = li[i] + 1
                #i = i + 1
        term_choice = term_choice + 3
    return li
def convert_all(li):
    li = convert(li, 0)
    li = convert(li, 1)
    li = convert(li, 2)
    return li
def fine_tune(li, term_choice, shift):
    while term_choice < len(li):
        li[term_choice] = li[term_choice] + shift
        term_choice = term_choice + 3
    #print(li[0], li[1], li[2], li[3], li[4], li[5], li[6])
    return li
values = convert_all(values)
values = fine_tune(values, 0, 0)
values = fine_tune(values, 1, -2)
values = fine_tune(values, 2, 0)
s = ''.join([chr(i) for i in values])
char = [chr(i) for i in values]
print(s, char)'''
def fine_tune(li, term_choice, key):
    while term_choice < len(li):
        li[term_choice] = li[term_choice]^key
        #print(li, '\n')
        term_choice = term_choice + 3
    #print(li[0], li[1], li[2], li[3], li[4], li[5], li[6])
    return li
def mass_test(li, a, b, c):
    while a < 104:
        lis = list(li)
        lis = fine_tune(lis, 0, a)
        d = b
        while d < 112:
            lis1 = list(lis)
            lis1 = fine_tune(lis1, 1, d)
            e = c
            while e < 101:
                lis2 = list(lis1)
                lis2 = fine_tune(lis2, 2, e)
                check = 0
                for i in range(0, len(lis2)):
                    if lis2[i] < 65 or 90 < lis2[i] < 97 or lis2[i] > 122:
                        check = check
                    else:
                        check = check + 1
                if check > 35:
                    print(a, d, e)
                    s = ''.join([chr(i) for i in lis2])
                    print(s, '\n', sum(lis2))
                e = e + 1
            d = d + 1
        a = a + 1
mass_test(values, 103, 111, 100)

