#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int coprime(int a, int b) {
    if (b == 0)
        return a;
    else if (b == 1)
        return 0;
    else
        return coprime(b, a % b);
}

int main() {
    int m, n, total, s;
    int half = 750000;
    s = (int) sqrt(2 * half);
    int *arr = (int *) malloc((half + 1) * sizeof(int));
    int index, multiple, i;
    int a;
    int b;
    for (m = 0; m <= s; ++m) {
        *(arr + m) = 0;
    }
    for (m = 1; m <= s; ++m) {
        for (n = 1; n < m && (index = m * (m + n)) <= half; ++n) {
            if (!coprime(n, m) && (m - n) % 2 == 1) {
                if (n == 1) {
                    a = m * m - n * n;
                    b = 2 * m * n;
                    if (coprime(a, b))
                        continue;
                }
                for (i = 1; (multiple = i * index) <= half; ++i) {
                    ++*(arr + multiple);
 //                   printf("%d %d %d %d\n", m*m-n*n, 2*m*n, m*m+n*n, multiple);
                }
            }
        }
    }
    for (total = 0, m = 1; m <= half; ++m) {
   //     printf("%d\n", *(arr + m));
        if (*(arr + m) == 1) 
            ++total;
    }
    printf("%d\n", total);
    free(arr);
    return 0;
}
