#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const int N = 1000000000;

int main(int argc, char **argv) {
    char buffer[10];
    char revbuffer[10];
    buffer[9] = '\0';
    revbuffer[9] = '\0';
    int count = 0;
    for (int i = 1; i < N; i++) {
        if (i % 1000000 == 0) {
            printf("finished %d\n", i);
        }
        if (i % 10 == 0) {
            continue;
        }
        sprintf(buffer, "%d", i);
        int digits = strlen(buffer);
        for (int i = 0; i < digits; i++) {
            revbuffer[i] = buffer[digits - 1 - i];
        }
        int rev = atoi(revbuffer);
        int total = rev + i;
        int reversible = 1;
        while (total != 0) {
            if ((total & 1) == 0) {
                reversible = 0;
                break;
            }
            total /= 10;
        }
        count += reversible;
    }
    printf("%d\n", count);
}