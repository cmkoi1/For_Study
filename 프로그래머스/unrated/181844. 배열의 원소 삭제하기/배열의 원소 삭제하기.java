import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            boolean check = true;
            for(int j = 0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    check = false;
                    break;
                }
            }
            if(check){ //if문은 조건이 true일 때 동작
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}