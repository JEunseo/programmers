import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> numList = new ArrayList<>();
        for (int num : num_list) {
            numList.add(num);
        }
        
        List<Integer> arr1 = numList.subList(0, n);
        List<Integer> arr2 = numList.subList(n, num_list.length);
        
        List<Integer> combined = new ArrayList<>(arr2);
        combined.addAll(arr1);
        
        return combined.stream().mapToInt(Integer::intValue).toArray();
    }
}