# N = 6
# array = [0, 15, -14, -7, 20, -13, -5, -3, 8, 23, -26, 1, -4, -5, -18, 5, -16, 31, 2, 9, 28, 3]
N = 1000
array = [0]
pow_2_19 = 2 ** 19
pow_2_20 = 2 ** 20
t = 0
for k in range(1, N * (N + 1) // 2 + 1):
    t = (615949 * t + 797807) % pow_2_20
    array.append(t - pow_2_19)

best = float('inf')

prev_tris = {} # start position, base size of triangle ending in previous row
for row in range(1, N + 1):
    curr_tris = {}
    last_end = row * (row - 1) // 2
    for i in range(1, row + 1):
        k = last_end + i
        initial = array[k]
        curr_tris[(i, 1)] = initial
        best = min(best, initial)

    for last_length in range(1, row):
        curr_sum = 0
        k = last_end + 1
        for _ in range(last_length):
            curr_sum += array[k]
            k += 1
        for start in range(1, row - last_length + 1):
            curr_sum += array[k]
            curr = curr_sum + prev_tris[(start, last_length)]
            curr_tris[(start, last_length + 1)] = curr
            best = min(best, curr)
            curr_sum -= array[k - last_length]
            k += 1
    prev_tris = curr_tris
    if row % 10 == 0:
        print('%s done' % (row))
print(best)