#include <stdio.h>
#include <stdlib.h>

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
    int closeN;
    int closeD;
    double closest = 100;
    double current = 1;
    for (d = 2; d < 1000000; ++d) {
        n = 3 * d / 7;
        current = 3.0 / 7 - (double) n / d;
        if (current < closest && d != 7) {
            if (relPrime(d, n)) {
                closeN = n;
                closeD = d;
                closest = current;
            }
        }
        
    }
    printf("%f %d/%d", closest, closeN, closeD);
    return 0;
}
