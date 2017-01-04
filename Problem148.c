#include <stdio.h>

int min(int x, int y) {
    return (x > y) ? y : x;
}

const unsigned long long N = 1000000000;
// const unsigned long long N = 100;

int main(int argc, char **argv) {
    // counts number of grids in a Sierpinski's Triangle pattern
    unsigned long long rows_remaining = N;
    unsigned long long triangle_height = 7;
    unsigned long long triangle_count = 28;
    while (triangle_height < rows_remaining) {
        triangle_height *= 7;
        triangle_count *= 28;
    }
    unsigned long long count = 0;
    int multiplier = 1;
    while (rows_remaining > 0) {
        if (triangle_height > rows_remaining) {
            triangle_height /= 7;
            triangle_count /= 28;
            int num_times = rows_remaining / triangle_height;
            if (num_times == 0) {
                continue;
            }
            count += multiplier * (num_times * (num_times + 1) / 2) * triangle_count;
            rows_remaining %= triangle_height;
            multiplier *= num_times + 1;
        }
    }
    printf("%llu\n", count);
}