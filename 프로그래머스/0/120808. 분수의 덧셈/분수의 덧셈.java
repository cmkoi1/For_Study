class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int num1 = numer1*denom2+numer2*denom1;
        int num2 = denom1*denom2; 
        
        int num3 = 0;
        
        for(int i = 1; i<=num2; i++){
            if(num1%i == 0 & num2%i == 0){
                num3 = i;
            }
        }
        
        int[] answer = {num1/num3, num2/num3};
        
        return answer;
    }
}