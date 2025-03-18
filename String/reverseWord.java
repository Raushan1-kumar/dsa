import java.util.Scanner;

public class reverseWord {
    public static void reverseString(String s){
        String[] ans = s.split(" ");
        int length=ans.length;
        for(int i=length-1; i>=0; i--){
            System.out.print(ans[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String s = scanner.nextLine();
        scanner.close();
        reverseString(s);
    }
}
