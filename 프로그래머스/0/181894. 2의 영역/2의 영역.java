import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int num : arr){
            answer.add(num);
        }
        
        int start = answer.indexOf(2);
        int end = answer.lastIndexOf(2);
        
        if(start == -1){
            return new int[]{-1};
        }
        return Arrays.copyOfRange(arr, start, end +1);
    }
}