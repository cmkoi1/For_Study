import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length-m; i>= 0; i -= m){
            int min = score[i];
            answer += min * m;
        }
        
        return answer;
    }
}