class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String arr[] = new String[my_string.length()];
        
        arr = my_string.split("");
        for(int i = 0; i<arr.length; i++){
            answer += arr[i].repeat(n);
        }
        
        
        return answer;
    }
}