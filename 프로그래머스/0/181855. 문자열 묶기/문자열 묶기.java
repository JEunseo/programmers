import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        List<Integer> answer = new ArrayList<>();
        
        for(String str : strArr){
            answer.add(str.length());
        }
        
        Map<Integer, Integer> count = new HashMap<>();
        for(int len : answer){
            count.put(len, count.getOrDefault(len, 0) +1);
        }
        
        int max = 0;
        
        for(int num : count.values()){
             max = Math.max(max, num);
        }
        return max;
    }
}