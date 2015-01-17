#include <stdio.h>
#include <stdlib.h>

struct nm {
    int n;
    int m;
    int result;
};

int main() {
    struct nm *cache = NULL;
    int cacheSize = 0;
    int partition(int, int, struct nm **, int *);
    printf("%d %d", partition(100, 99, &cache, &cacheSize), cacheSize);
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

int partition(int n, int m, struct nm **cache, int *size) {
    int result;
    if (m == 0 || n < 0)
        return 0;
    else if (n == 0 || m == 1)
        return 1;
    else if (m > n) 
        m = n;
    if (result = in(*cache, size, n, m)) 
        return result;
    else {
        result = partition(n - m, m, cache, size) + partition(n, m - 1, cache, size);
        *cache = (struct nm *) realloc(*cache, ++*size * sizeof(struct nm));
        (*cache + *size - 1)->n = n;
        (*cache + *size - 1)->m = m;
        (*cache + *size - 1)->result = result;
        return result;
    }
}
