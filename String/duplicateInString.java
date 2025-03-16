import java.util.HashMap;
import java.util.Scanner;;


public class duplicateInString {
    public static void duplicateCharacter(String s){
      HashMap <Character, Integer> map =new  HashMap<>();
      for(char c:s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0)+1);
      }

      for(char c:map.keySet()){
           if(map.get(c)>1){
              System.out.println(c+":"+map.get(c));
           }
      }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = scanner.next();
        duplicateCharacter(s);
    }
}
