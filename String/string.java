import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter your detail");

        String trick = "\\0";
        System.out.println("Your trick is "+trick);
        String name = myobj.nextLine();
    }
}
