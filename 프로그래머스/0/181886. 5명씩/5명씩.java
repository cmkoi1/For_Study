import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String[] names) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < names.length; i+=5){
            answer.add(names[i]);
        }
        
        return answer;
    }
}