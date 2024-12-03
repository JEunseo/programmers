import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        String[] parts = myString.split("x", -1);
        
        for(String part : parts){
            answer.add(part.length());
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}