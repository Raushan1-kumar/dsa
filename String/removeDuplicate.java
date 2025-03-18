
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicate {
    public static void uniqueOnly(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scanner.next();

        uniqueOnly(s);
        scanner.close();
    }
}
