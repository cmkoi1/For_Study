class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length+1-n];
        int a = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i>=n-1){
                answer[a]=num_list[i];
                a++;
            }
        }
        
        return answer;
    }
}