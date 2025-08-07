import java.util.*;


public class longestSubstringWithoutRepeat {

    public static int longestSubstring(String str){
        int n = str.length();
        int maxLength=1;
        int i=0, j=1;
       
        List<Character> uniqueCharacter = new ArrayList<>();
        uniqueCharacter.add(str.charAt(i));
        while( j < n){
           if(str.charAt(i)!=str.charAt(j)){
            uniqueCharacter.add(str.charAt(j));
             j++;
           }

           else{
              maxLength = Math.max(maxLength, uniqueCharacter.size());
              while(i<=j){
                if(str.charAt(i)==uniqueCharacter.get(0)){
                    uniqueCharacter.remove(0);
                    i++;
                    break;
                }
                uniqueCharacter.remove(0);
                i++;
              }
              uniqueCharacter.add(str.charAt(j));
              j++;
           }
        }

        maxLength = Math.max(maxLength, uniqueCharacter.size());
        return maxLength;
         
    }
    public static void main(String[] args) {
        String str = "aaaabacdg";
        System.out.println("The length of longest substring without repeating character " + longestSubstring(str));
    }
}
