import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> answer = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                answer.put(rank[i], i);
            }
        }
        
        List<Integer> result = new ArrayList<>(answer.keySet());
        Collections.sort(result);
        
        int a = answer.get(result.get(0));
        int b = answer.get(result.get(1));
        int c = answer.get(result.get(2));
        
        return 10000 * a  + 100 * b + c;
    }
}