import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int resultLen = 1;
        
        while(resultLen < length){
            resultLen *= 2;
        }
        
        int[] result = new int[resultLen];
        for(int i = 0; i < length; i++){
            result[i] = arr[i];
        }
        
        return result;
    }
}