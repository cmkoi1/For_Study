#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
double solution(int numbers[], size_t numbers_len) {
    double answer = 0;
    double val = 0;
    
    for(int i=0; i < numbers_len; i++){
        val += numbers[i];
    }
    
    answer = val/numbers_len;
    return answer;
}