import java.util.Scanner;

public class wordBreak {
    public static Boolean checkWordBreak(String s, String[] dict){
        return true;
    }
    public static void main(String[] args) {
        String[] arr = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word in the dictionary");
        for(int i=0; i<arr.length; i++){
           arr[i] = scanner.next();
        }
        System.out.print("Enter any String -> ");
        String s = scanner.next();
        System.out.println(checkWordBreak(s, arr));
        scanner.close();
    }
}
