class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int a = n;
        
        for(int i = 0; i<num_list.length; i++){
            if(a>num_list.length-1){
                answer[i] = num_list[a-num_list.length];
            } else {
                answer[i] = num_list[a];
            }
            a++;
        }
        
        return answer;
    }
}