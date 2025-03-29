import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class countFreqOfCharacter {
    
    public static void countingFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
        }
        System.out.println();
    }
    public static void countingFrequency2(String s) {
        int count = 0;
        char c = s.charAt(0);
        for (char ch : s.toCharArray()) {
            if (c == ch) {
                count++;
            } else {
                System.out.print(c + ":" + count+" ");
                count = 1;
                c = ch;
            }
        }
        System.out.println(c + ":" + count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string :");
        String s = scanner.next();
        countingFrequency(s);
        countingFrequency2(s);
        scanner.close();

    }
}