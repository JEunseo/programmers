import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String str1 = a.replaceAll("","");
        String str2 = b.replaceAll("","");
        
        System.out.print(str1);
        System.out.print(str2);
    }
}