// Given a string s find the length of the longest substring without repeating characters

import java.util.HashSet;

public class longestSubstring {
    public static int lengthOfLongestSubstring(String k) {
        int n = k.length();
        HashSet<Character> substring = new HashSet<>();
        int left = 0, right;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            right = i;
            while (substring.contains(k.charAt(right))) {
                substring.remove(k.charAt(left));
                left++;
            }
            substring.add(k.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("abcdakek"));
    }
}