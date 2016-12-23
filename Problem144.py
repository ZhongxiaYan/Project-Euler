import numpy as np

coef = np.array([-4, 1])

prev = np.array([0, 10.1])
curr = np.array([1.4, -9.6])
vector = curr - prev
vector /= np.linalg.norm(vector)
count = 0

while not curr[1] > 9.5 or curr[0] > 0.01 or curr[0] < -0.01:
    count += 1
    tangent = coef * curr
    tangent /= np.linalg.norm(tangent)
    tangent[0], tangent[1] = tangent[1], tangent[0]
    vector = -vector + 2 * np.dot(vector, tangent) * tangent
    a, c = curr
    b, d = vector
    a, b, c = (4 * b * b + d * d), (8 * a * b + 2 * c * d), (4 * a * a + c * c - 100)
    t = (-b + np.sqrt(b * b - 4 * a * c)) / (2 * a)
    prev = curr
    curr = prev + t * vector
    if count % 100 == 0:
        print(count)
print(count)
print(prev)
print(curr)