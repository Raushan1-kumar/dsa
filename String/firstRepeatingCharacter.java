import java.util.HashSet;
import java.util.Scanner;

public class firstRepeatingCharacter {
    public static char firstcharacter(String s){
       HashSet<Character> set = new HashSet<>();
       for(char ch : s.toCharArray()){
         if(!set.contains(ch)){
            set.add(ch);
         }
         else{
            return ch;
         }
       }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string :");
        String s = scanner.next();
        System.out.println("First repeating character is : "+firstcharacter(s));
        scanner.close();
    }
}
