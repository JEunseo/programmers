class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = ""; 
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                odd += Integer.toString(num_list[i]);
            } else {
                even += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd); 
        return answer;
    }
}