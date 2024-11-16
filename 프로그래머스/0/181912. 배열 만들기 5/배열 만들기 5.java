import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String str : intStrs) {
            if (s >= 0 && s + l <= str.length()) {
                String str1 = str.substring(s, s + l);
                int num = Integer.parseInt(str1);

                if (num > k) {
                    answer.add(num);
                }
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}