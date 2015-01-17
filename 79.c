#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *keys;
    keys = fopen("79_keylog.txt", "r");
    if (keys == NULL) {
        printf("Error, unable to open file");
        return 0;
    }
    char *str = (char *) malloc(3);
    int i = 0;
    do {
        fscanf(keys, "%s", str);
        printf("%s\n", str);
    } while (++i < 50);
    fclose(keys);
    return 0;
}
