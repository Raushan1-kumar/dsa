
import java.util.HashSet;
public class doesAllAlphabetPresent {
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        int length = s.length();
        System.out.println(length);
        HashSet<String> ans= new HashSet<>();
        int i=0;
        while(i<length){
            ans.add(String.valueOf(s.charAt(i)));
            i++;
        }
        if(ans.size()==26){
            System.out.println("all character are present");
        }
        else{
            System.out.println("all character are not present");
        }
    }
}
