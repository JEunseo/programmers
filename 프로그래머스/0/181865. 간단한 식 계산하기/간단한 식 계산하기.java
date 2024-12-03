class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String op = parts[1];
        
        switch(op) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a * b;
                break;
        }
        return answer;
    }
}