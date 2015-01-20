#include <stdio.h>
#include <stdlib.h>

inline int pent(int x) {
    return x * (3 * x - 1) / 2;
}

int main() {
    int x = 1;
    int maxPent = 100000;
    int *pents = NULL;
    int pentsLen = 0;
    int curr;
    do {
        curr = pent(x);
        x = (x > 0) ? -x : -x + 1;
        pents = (int *) realloc(pents, ++pentsLen * sizeof(int));
        *(pents + pentsLen - 1) = curr;
    } while (curr < maxPent);
    int *partitions = (int *) malloc(sizeof(int));
    *partitions = 1;
    int pSize = 1;
    int result;
    do {
        for (result = x = 0; (curr = *(pents + x)) <= pSize; ++x) {
            result += (x % 4 < 2) ? *(partitions + pSize - curr) : -*(partitions + pSize - curr);
            if (result < 0) {
                result += 1000000;
            }
            result %= 1000000;
        }
        partitions = (int *) realloc(partitions, ++pSize * sizeof(int));
        *(partitions + pSize - 1) = result;
        if (pSize % 100 == 0) 
            printf("partition: %d  result: %d\n", pSize - 1, result);
    } while (result != 0 && pSize < maxPent);
    printf("%d %d\n", pSize - 1, result);
    free(partitions);
    free(pents);
    return 0;
}
