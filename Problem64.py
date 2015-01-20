from math import sqrt
from fractions import gcd
import math
def root(x):
	def simplify(x, y):
		a = gcd(x, y)
		return x//a, y//a
	denom = -math.floor(sqrt(x))
	num = 1
	list1 = [1]
	j = 1
	while j:
	    denom2 = x - denom*denom
	    num, denom2 = simplify(num, denom2)
	    i = 1
	    while x > (-denom - i*denom2) * (-denom - i*denom2) or (-denom - i*denom2) > 0:
	    	i = i + 1
	    i = i - 1
	    num, denom = denom2//num, -denom - i*denom2
	    list1 = list1 + [[i, num, denom]]
	    if [i, num, denom] == list1[1] and j != 1:
	    	return j - 1
	    j = j + 1
def testodd(x):
	if x % 2 != 0:
		return True
	else:
		return False
def testsquare(x):
	n = 1
	while n <= sqrt(x) + 1:
		if x == n*n:
			return True
		n = n + 1
	return False
def testall(start = 1, end = 10000):
	count = 0
	while start <= end:
		if testsquare(start) != True:
			a = root(start)
			if testodd(a):
				count = count+1
		start = start + 1
	return count
print(testall())