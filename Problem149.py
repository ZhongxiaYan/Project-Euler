nums = {}

N = 2000
for i in range(0, N):
    for j in range(1, N + 1):
        k = i * N + j
        if k <= 55:
            s_k = (100003 - 200003 * k + 300007 * k ** 3) % 1000000 - 500000
        else:
            s_k = (nums[k - 24] + nums[k - 55] + 1000000) % 1000000 - 500000
        nums[k] = s_k

# for i, x in enumerate([-2, 5, 3, 2, 9, -6, 5, 1, 3, 2, 7, 3, -1, 8, -4, 8]):
    # nums[i + 1] = x

best = -float('inf')
for row in range(0, N):
    k = row * N
    row_best = 0
    for i in range(N):
        k += 1
        row_best = max(row_best + nums[k], 0)
        best = max(best, row_best)

for column in range(1, N + 1):
    k = column
    column_best = 0
    for i in range(N):
        column_best = max(column_best + nums[k], 0)
        best = max(best, column_best)
        k += N

N2 = N ** 2
for (row, column) in [(row, 1) for row in range(N)] + [(0, column) for column in range(2, N + 1)]:
    k = row * N + column
    diag_best = 0
    while column <= N and row < N:
        diag_best = max(diag_best + nums[k], 0)
        best = max(best, diag_best)
        k += N + 1
        column += 1
        row += 1

for (row, column) in [(row, N) for row in range(N)] + [(0, column) for column in range(1, N)]:
    k = row * N + column
    diag_best = 0
    while column > 0 and row < N:
        diag_best = max(diag_best + nums[k], 0)
        best = max(best, diag_best)
        k += N - 1
        column -= 1
        row += 1

print(best)