class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = -1;
        
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                answer[0] = array[i];
                answer[1] = i;
                max = array[i];
            }
        }
        
        return answer;
    }
}