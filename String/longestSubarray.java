import java.util.HashMap;
import java.util.Scanner;

public class longestSubarray {

    public static void findingLongestSubarray(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charIndexMap.containsKey(ch)) {
                start = Math.max(start, charIndexMap.get(ch) + 1);
            }
            charIndexMap.put(ch, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
       System.out.println(maxLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string :");
        String s = scanner.next();
        findingLongestSubarray(s);
        scanner.close();
    }
}
