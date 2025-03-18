
import java.util.HashSet;
import java.util.Scanner;

public class firstRepeatingString {
    public static String firstString(String s) {
        String temp = "";
        HashSet<String> result = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (result.contains(temp)) {
                    return temp;
                } else {
                    result.add(temp);
                    temp = "";
                }
            } else {
                temp += ch;
            }
        }
        return "all string are unique";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string of multiple word and repeat one word atleast : ");
        String s = scanner.nextLine();
        System.out.println("The first repeated String is : " + firstString(s));
        scanner.close();
    }
}
