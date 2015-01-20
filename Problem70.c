#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *primeGen(void);
    int combination(int *, int, int, int **);
    int *factor(int, int *, int *);
    int checkDigits(int, int);
    int *primes;
    int x;
    int *factors;
    primes = primeGen(); 

    int fCount;
    short add;
    int sum;
    int num;
    int *temp;
    int tempLen;
    int k;
    int i;
    float min = 100;
    float this;
    int minX;
    for (x = 2; x <= 10000000; ++x) {
        factors = factor(x, primes, &fCount);
        add = 1;
        sum = 0;
        num = x - 1;
        for (k = 1; k <= fCount; ++k) {
            tempLen = combination(factors, fCount, k, &temp);
            for (i = 0; i < tempLen; ++i) {
                sum += add * (num / *(temp + i));
            }
            add = -add;
            free(temp);
        }
        if (checkDigits(x, num - sum)) {
            this = (float) x / (num - sum);
            if (min > this) {
                min = this;
                minX = x;
            }
            printf("%d %d\n", x, num - sum);
            
        }
        free(factors);
    }
    printf("%d %f", minX, min);
    
    free(primes);
    return 0;
}

int prime(int x) {
    int i;
    for (i = 2; i <= (int) sqrt(x); ++i) {
        if (x % i == 0)
            return 0;
    }
    return 1;
}

int *primeGen(void) {
    int *primes = NULL;
    int i;
    int counter = 0;
    for (i = 2; i <= 1000000; ++i) {
        if (prime(i)) {
            primes = (int *) realloc(primes, ++counter * sizeof(int));
           *(primes + counter - 1) = i;
        }
    }
    return primes;
}

int in(int *array, int len, int x) {
    int i;
    for (i = 0; i < len; ++i) {
        if (*(array++) == x) {
            return i;
        }
    }
    return -1;
}

int checkDigits(int a, int b) {
    int *aArray = NULL;
    int aCount = 0;
    for (; a > 0; a /= 10) {
        aArray = (int *) realloc(aArray, ++aCount * sizeof(int));
        *(aArray + aCount - 1) = a % 10;
        //printf("%d\n", a);
    }
    int index;
    int bCount = 0;
    for (; b > 0; b /= 10, ++bCount) {
        index = in(aArray, aCount, b % 10);
        if (index == -1) {
            free(aArray);
            return 0;
        }
        else 
            *(aArray + index) = -1;
    }
    
    free(aArray);
    return (aCount == bCount) ? 1 : 0;
}

int *factor(int x, int *prime, int *counter) {
    int *list = NULL;
    *counter = 0;
    int s = sqrt(x);
    for (; *prime <= s; ++prime) {
        if (x % *prime == 0) {
            x /= *prime;
            list = (int *) realloc(list, ++*counter * sizeof(int));
            *(list + *counter - 1) = *prime;
            while (x % *prime == 0)
                x /= *prime;
        }
    }
    if (x != 1 && *counter != 0) {
        list = (int *) realloc(list, ++*counter * sizeof(int));
        *(list + *counter - 1) = x;
    }
    return list;
}

int combination(int *v, int len, int num, int **result) {
    if (num == 1) {
        *result = (int *) malloc(len * sizeof(int));
        int i;
        for (i = 0; i < len; ++i) {
            *(*result + i) = *(v + i);
        }
        return len;
    } else {
        *result = NULL;
        int *temp;
        --num;
        int elem;
        int tLen;
        int newLen = 0;
        int i;
        while (len >= num) {
            elem = *(v + --len);
            tLen = combination(v, len, num, &temp);
            for (i = 0; i < tLen; ++i) {
                *result = (int *) realloc(*result, ++newLen * sizeof(int));
                *(*result + newLen - 1) = *(temp + i) * elem;
            }
            free(temp);
        }
        return newLen;
    }
}
