import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
         int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = (arr.length % 2 == 0 && i % 2 != 0) || (arr.length % 2 != 0 && i % 2 == 0) ? arr[i] + n : arr[i];
        }

        return answer;
    }
}