rectangles = {}
diamonds = {}

def count_rectangles(width, height):
    total = 0
    for i in range(1, width + 1):
        for j in range(1, height + 1):
            total += (width - i + 1) * (height - j + 1)
    return total

def count_diamonds(width, height):
    if height == 1:
        return diamonds[(width, height)]
    width2 = 2 * width
    height2 = 2 * height
    new_squares = [(x, height2 - 2) for x in range(1, width2, 2)]
    new_squares += [(x, height2 - 1) for x in range(2, width2, 2)]
    # u is the (-1, -1) diagonal, v is the (1, -1) diagonal
    ux = -1
    vx = 1
    # M_xy_to_uv = 0.5 * [[-1, -1], [1, -1]]
    total = diamonds[(width, height - 1)]
    cX = 1
    while cX < width2:
        cY = cX % 2 + 1
        while cY < height2:
            for x, y in new_squares:
                dx = cX - x
                dy = cY - y
                du = -0.5 * (dx + dy)
                dv = 0.5 * (dx - dy)
                if du < 0 or dv < 0 or x - du <= 0 or x + dv >= width2:
                    continue
                total += 1
            cY += 2
        cX += 1
    return total

W = 47
H = 43

for w in range(1, W + 1):
    diamonds[(w, 1)] = w - 1

total = 0
for w in range(1, W + 1):
    print('w = %s' % w)
    for h in range(1, H + 1):
        total_rectangles = count_rectangles(w, h)
        total_diamonds = count_diamonds(w, h)
        diamonds[(w, h)] = total_diamonds
        total += total_diamonds + total_rectangles
print(total)

