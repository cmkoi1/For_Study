class Solution {
    public int[] solution(long n) {
        String numberStr = Long.toString(n);
        
        int[] answer = new int[numberStr.length()];
        int index = 0;
        
       for (int i = 0; i < numberStr.length(); i++) {
            answer[i] = Character.getNumericValue(numberStr.charAt(numberStr.length() - 1 - i));
        }
        

        
        return answer;
    }
}