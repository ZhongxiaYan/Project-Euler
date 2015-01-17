#include <math.h>
#include <stdlib.h>
#include <stdio.h>

char relPrime(int x, int y) {
    if (y == 0 || x == y)
        return 0;
    else if (y == 1)
        return 1;
    else
        return relPrime(y, x % y);
}

int main() {
    int d;
    int n;
    int total = 0;
    double half = 1.0/2;
    double third = 1.0/3;
    for (d = 5; d <= 12000; ++d) {
        for (n = d / 3; 2 * n < d; ++n) {
            if (relPrime(d, n) && n * 3 > d) {
                total++;
            }
        }
    }
    printf("%d", total);
    return 0;
}
