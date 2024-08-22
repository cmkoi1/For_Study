class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        for(int i = 0; i < k-1; i++){
            answer += 2;
            if(answer >= numbers.length){
                answer -= numbers.length;
            }
        }
        
        return numbers[answer];
    }
}