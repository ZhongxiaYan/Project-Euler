#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct nm {
    int n;
    int m;
    int result;
};

int *primeGen() {
    int *x = NULL;
    int len = 0;
    int i;
    int k;
    x = (int *) realloc(x, ++len * sizeof(int));
    *(x + len - 1) = 0;
    char prime;
    for (i = 2; i < 500; ++i) {
        prime = 1;
        for (k = 2; k <= sqrt(i); ++k) {
            if (i % k == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1) {
            x = (int *) realloc(x, ++len * sizeof(int));
            *(x + len - 1) = i;
        }
    }
    return x;
}

int main() {
    struct nm *cache = NULL;
    int cacheSize = 0;
    int partition(int, struct nm **, int *, int *, int *);
    int *prime = primeGen();
    int start;
    int x;
    int total;
    for (x = 10, total = 0; total <= 5000 && x <= 500; ++x) {
        start = 0;
        while (*(prime + start++) <= x);
        --start;
        total = partition(x, &cache, &cacheSize, prime, &start);
    }
    printf("%d %d", --x, total);
    free(prime);
    free(cache);
    return 0;
}

int in(struct nm *cache, int *size, int n, int m) {
    int i;
    for (i = 0; i < *size; ++i, ++cache) {
        if (n == cache->n && m == cache->m)
            return cache->result;
    }
    return 0;
}

int partition(int n, struct nm **cache, int *size, int *prime, int *m) {
    int result;
    if (*m == 0 || n < 0)
        return 0;
    else if (n == 0)
        return 1;
    else if (result = in(*cache, size, n, *(prime + *m))) 
        return result;
    else {
        int *b = (int *) malloc(sizeof(int));
        *b = *m - 1;
        result = partition(n - *(prime + *m), cache, size, prime, m) + partition(n, cache, size, prime, b);
//        printf("%d %d %d\n", n, *(prime + *m), result);
        free(b);
        *cache = (struct nm *) realloc(*cache, ++*size * sizeof(struct nm));
        (*cache + *size - 1)->n = n;
        (*cache + *size - 1)->m = *(prime + *m);
        (*cache + *size - 1)->result = result;
        return result;
    }
}
