import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in this format '2.1.2.1' ");  // output should be 2[.]1[.]2[.]1
        String s = scanner.next();
        String ans = "";
        int length = s.length();
        int i = 0;
        while (i < length) {
            if (s.charAt(i) == '.') {
                ans += "[.]";
            } else {
                ans += s.charAt(i);
            }

            i++;
        }

        System.out.println("Answer is " + ans);
        scanner.close();
    }
}
