import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            boolean isChanged = false;
            
            for(int i=0; i<arr.length; i++){
                int beforeNum = arr[i];
                
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
                
                 if (arr[i] != beforeNum) {
                isChanged = true;
                }
            }
            if(!isChanged){
                break;
            }         
            count++;
        }
        return count;
    }
}