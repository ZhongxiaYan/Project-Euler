#include <math.h>
#include <stdlib.h>
#include <stdio.h>

int main() {
    char in(int *, int, int);
    int sumFact(int);
    int x;
    int count = 0;
    int *list;
    int listLen;
    int i;
    for (x = 4; x < 1000000; ++x) {
        listLen = 0;
        list = NULL;
        i = x;
        while (!in(list, listLen, i)) {
            list = (int *) realloc(list, ++listLen * sizeof(int));
            *(list + listLen - 1) = i;
            i = sumFact(i);
        }
        if (listLen == 60)
            count++;
        free(list);
        if (x % 10000 == 0)
            printf("%d\n", x);
    }
    printf("%d", count);
    return 0;
}

char in(int *a, int len, int x) {
    for (; len > 0; --len) {
        if (x == *(a++))
            return 1;
    }
    return 0;
}

int sumFact(int y) {
    int sum = 0;
    int x;
    int result;
    for (; y > 0; y /= 10) {
        x = y % 10;
        result = 1;
        while (x > 0)
            result *= x--;
        sum += result;
    }
    return sum;
}
