import java.util.Arrays;
import java.util.Scanner;

public class isAnagramsString {
    public static boolean anagramString(String s1, String s2){
         if(s1.length() != s2.length()){
            return false;
         }
         else{
            char [] arr1= s1.toCharArray();
            char [] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr1)+"  "+Arrays.toString(arr2));
            if(Arrays.equals(arr1, arr2)){
                return true;
            }
            else{
                return false;
            }
         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = scanner.next();
        System.out.println("Enter second String");
        String s2 = scanner.next();

        boolean ans = anagramString(s1,s2);
        if(ans==true){
            System.out.println("given strings are anagrams");
        }
        else{
            System.out.println("Given string are not anagrams");
        }
    }
}
