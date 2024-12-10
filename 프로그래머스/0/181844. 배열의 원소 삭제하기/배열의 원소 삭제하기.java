import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr)
                     .filter(item -> Arrays.stream(delete_list).noneMatch(del -> del == item))
                     .toArray();

    }
}