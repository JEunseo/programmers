import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();

        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            reverse(answer, s, e); 
        }        
        return new String(answer);
    }
    
    private void reverse(char[] arr, int s, int e){
        while (s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    } 
}