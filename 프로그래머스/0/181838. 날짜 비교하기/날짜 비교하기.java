import java.time.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        
        LocalDate new1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate new2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return new1.isBefore(new2) ? 1 : 0;
    }
}