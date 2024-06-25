class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        boolean nonZeroFound = false;
        
        for (int i = 0; i < n_str.length(); i++) {
            char currentChar = n_str.charAt(i);
            
            if (currentChar != '0') {
                nonZeroFound = true;
            }
            
            if (nonZeroFound) {
                sb.append(currentChar);
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}