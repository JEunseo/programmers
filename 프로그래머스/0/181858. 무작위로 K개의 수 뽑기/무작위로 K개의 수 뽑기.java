import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> answer = new LinkedHashSet<>();
        
        for (int num : arr) {
            if (answer.size() < k) {
                answer.add(num);
            }
        }
        
        int[] result = new int[k];
        int i = 0;
        
        for(int num : answer){
            result[i++] = num;
        }
        
        while( i < k){
            result[i++] = -1;
        }
        return result;
    }
}