class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int one = 0;
        int two = 0;
        
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                one = one+ arr1[i];
                two = two+ arr2[i];
            }
            if(one == two){
                answer = 0;
            } else if(one > two){
                answer = 1;
            } else {
                answer = -1;
            }
        }else if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        }
    
        
        return answer;
    }
}