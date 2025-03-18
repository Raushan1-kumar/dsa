import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class firstNonRepeatingString {
    public static String firsString(String s){
       String temp="";
       Map<String, Integer> map = new LinkedHashMap<>();
       for(char ch: s.toCharArray()){
         if(ch ==' '){
            map.put(temp, map.getOrDefault(temp,0)+1);
            temp="";
         }
         else{
            temp += ch;
         }
       }
       map.put(temp, map.getOrDefault(temp, 0)+1);
       for(String key : map.keySet()){
          if(map.get(key)==1){
            return key;
          }
       }
        return "-";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a full sentence : ");
        String s = scanner.nextLine();
        System.out.println("First not repeating String is -> "+firsString(s));
        scanner.close();
    }
}
