import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            String[] len = picture[i].split("");
            String str = "";
            for(int j = 0; j < len.length; j++){
                str += len[j].repeat(k);
            }
            for(int j = 0; j < k; j++){
                answer.add(str);
            }
                
        }
        return answer.toArray(new String[answer.size()]);
    }
}