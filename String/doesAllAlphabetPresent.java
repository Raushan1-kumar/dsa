
import java.util.HashSet;
public class doesAllAlphabetPresent {
    public static void main(String[] args) {
        String s="abcde3@fghijklmnopqrstuvwxyz";
        HashSet<String> ans= new HashSet<>();
        for(char ch: s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                ans.add(String.valueOf(ch));
            }
        }
        System.out.println(ans.size());
        if(ans.size()==26){
            System.out.println("all alphabet presents");
        }
        else{
            System.out.println("all alphabets are not present");
        }
        
    }
}
