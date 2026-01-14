#include <stdio.h>
#include <stdlib.h>

void passingarguments(int argc, char *argv[]) {
    for (int i = 0; i < argc; i++) {
        printf("Argument %d: %s\n", i, argv[i]);
    }
}

void bitmanipulation(int num) {
    printf("Original number: %d\n", num);
    printf("Set bit 1 using OR (|): %d\n", num | (1 << 1));
    printf("Check bit 1 using AND (&): %d\n", num & (1 << 1));
    printf("Toggle bit 1 using XOR (^): %d\n", num ^ (1 << 1));
    printf("Left shift by 2: %d\n", num << 2);
    printf("Right shift by 2: %d\n", num >> 2);
}

int main(int argc, char *argv[]) {
    passingarguments(argc, argv);
    int num = 20;
    bitmanipulation(num);
    return 0;
}