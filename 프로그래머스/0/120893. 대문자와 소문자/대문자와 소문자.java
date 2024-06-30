class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (Character.isLowerCase(a)) {
                answer.append(Character.toUpperCase(a)); 
            } else if (Character.isUpperCase(a)) {
                answer.append(Character.toLowerCase(a)); 
            }
        }
        
        return answer.toString();
    }
}