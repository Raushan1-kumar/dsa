import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class findTheFirstNonRepeatingcharacter {
    public static char firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        for(char c: map.keySet()){
            if(map.get(c)==1){
                return c;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.next();
        char ans = firstUniqueChar(s);
        System.out.println(ans);
        scanner.close();
    }
}
