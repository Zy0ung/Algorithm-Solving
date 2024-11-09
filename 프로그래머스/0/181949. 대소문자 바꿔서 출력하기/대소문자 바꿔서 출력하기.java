import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char keyword;
        String answer = "";
        
        for (int i = 0; i < a.length(); i++){
            
            keyword = a.charAt(i);
            
            if (Character.isUpperCase(keyword)) {
                answer += Character.toLowerCase(keyword);   
            } else {
                answer += Character.toUpperCase(keyword);      
            }
        }
        System.out.println(answer);
    }
}