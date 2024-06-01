class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i=0; i<index_list.length; i++){
            char chars = my_string.charAt(index_list[i]);
            answer += chars;
        }
        
        return answer;
    }
}