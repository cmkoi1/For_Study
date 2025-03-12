class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int mul = 2 * a * b;
        int sum = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        return answer = (mul > sum) ? mul : sum;
    }
}