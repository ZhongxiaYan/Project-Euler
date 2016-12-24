#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "util.c"

const unsigned long long N = 150000000;

int main(int argc, char **argv) {
    unsigned long long sum = 0;

    for (unsigned long long x = 2; x < N; x += 2) {
        if (x % 3 && x % 7 && x % 13) {
            unsigned long long x2 = x * x;
            if (is_prime(x2 + 1)
             && is_prime(x2 + 3)
             && is_prime(x2 + 7) 
             && is_prime(x2 + 9) 
             && is_prime(x2 + 13) 
             && is_prime(x2 + 27)
             && !is_prime(x2 + 5)
             && !is_prime(x2 + 11)
             && !is_prime(x2 + 15)
             && !is_prime(x2 + 17)
             && !is_prime(x2 + 19)
             && !is_prime(x2 + 21)
             && !is_prime(x2 + 23)
             && !is_prime(x2 + 25)) {
                sum += x;
            }
        }
        if (x % 1000000 == 0) {
            printf("finished %llu\n", x);
        }
    }
    printf("%llu\n", sum);
}