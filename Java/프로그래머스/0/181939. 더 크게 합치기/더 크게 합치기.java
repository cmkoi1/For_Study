class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int bigA = 0, bigB = 0;
        
        bigA = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        bigB = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        
        answer = bigA>bigB || bigA==bigB ? bigA : bigB;

        
        
        return answer;
    }
}