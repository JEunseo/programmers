import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i = 0; i < num_str.length(); i++){
            char ch = num_str.charAt(i);
            answer += ch - '0';
        }

        return answer;
    }
}