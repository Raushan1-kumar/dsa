import java.util.*;

public class longestSubStringWithKDistinctCharacter {

    public static int longestSubstring(String str, int k) {
        int n = str.length();
        int i = 0, j = 0, maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (j < n) {
            // Add current character to the map
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

            // Shrink the window if we have more than k distinct characters
            while (map.size() > k) {
                char ch = str.charAt(i);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                i++;
            }

            // Update max length when we have k or fewer distinct characters
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "aabaacd";
        int k = 2;
        System.out.println("The longest substring is " + longestSubstring(str, k));
    }
}
