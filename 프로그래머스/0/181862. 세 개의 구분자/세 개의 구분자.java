import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        
        String[] strsplit = myStr.split(" ");
        
        List<String> answer = new ArrayList<>();
        for(String str : strsplit){
            if(!str.isEmpty()){
                answer.add(str);
            }
        }
        if(answer.isEmpty()){
            answer.add("EMPTY");
        }
        
        return answer.toArray(new String[0]);
    }
}