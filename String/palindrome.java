import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scanner.next(); 
        Boolean ans = true;
        int length = s.length();
        int start =0, end=length-1;

        while (start<end) {
            if(s.charAt(start)!=s.charAt(end)){
               System.out.println("Given string is not palindrome");
               ans=false;
               return;
            }
            start++;
            end--;
        }
        if(ans==true){
            System.out.println("Given string is palindrome");
        }
    }
}
