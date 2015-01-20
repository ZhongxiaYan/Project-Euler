#include <stdio.h>
#include <stdlib.h>

void copy(int *a, int *b, int len) {
    int i = 0;
    for (; i < len; ++i) {
        *a = *b;
        ++a;
        ++b;
    }
}

int main() {

    FILE *fp;

    fp = fopen("Problem67_triangle.txt", "r");
    
    int row;
    int column;
    int c;
    int carr[100];
    int parr[100];
    parr[0] = 0;
    int *cp;
    for (row = 1; row <= 100; ++row) {
        cp = carr;
        for (column = 1; column <= row; ++column) {
            fscanf(fp, "%d", &c);
            *cp++ = c;
        }
        
        for (column = 0; column < row; ++column) {
            if (column == 0) 
                carr[column] += parr[column];
            else if (column == row - 1) 
                carr[column] += parr[column - 1];
            else carr[column] += (parr[column - 1] > parr[column]) ? parr[column - 1] : parr[column];
        }
        copy(parr, carr, row);
    }
    fclose(fp);
    int max = 0;
    for (column = 0; column < 100; column++) {
        max = (max > parr[column]) ? max : parr[column];
    }
    printf("%d", max);
    return 0;
}


