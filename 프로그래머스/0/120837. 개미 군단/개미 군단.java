class Solution {
    public int solution(int hp) {
        int answer = 0;
        int val = 0;
        
        answer += hp/5;
        val = hp%5;
        answer+= val/3;
        val = val%3;
        answer+= val/1;
        val= val%1;
        
        return answer;
    }
}