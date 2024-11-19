import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i += m){
            String sub = my_string.substring(i, i+m);
            answer.add(sub);
        }
        
        String result = "";
        for(String str : answer){
            result += str.substring(c-1, c);
        }
        
        return result;
    }
}