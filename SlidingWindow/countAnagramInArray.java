
import java.util.*;


public class countAnagramInArray {
    public static int countAnagrams(String text, String pattern){
        int count=0 ;

       Map<Character, Integer> characterFrequency= new HashMap<>();


       // store freqency of each character of pattern
       for(char ch: pattern.toCharArray()){
           characterFrequency.put(ch, characterFrequency.getOrDefault(ch, 0)+1);
       }

       int i=0 , j=0, matched=0;

       while(j < text.length()){
        char ch = text.charAt(j);
        
        // check either jth index character of text is present in Map or not if yes then decrement value by 1
           if(characterFrequency.containsKey(ch)){
              characterFrequency.put(ch, characterFrequency.get(ch)-1);
              if(characterFrequency.get(ch)==0){
                matched++;
              }
           }
           
           // if window size is less than pattern size then simply increment j
           if(j-i+1<pattern.length()){
               j++;
           }

            // if window size become equals to pattern length then  check is anagram or not
           else{
             
            if(matched == characterFrequency.size()){
                count++;
            }

            char ch2 = text.charAt(i);
            if(characterFrequency.containsKey(ch2)){
                if(characterFrequency.get(ch2)==0){
                    matched--;
                }
                characterFrequency.put(ch2, characterFrequency.getOrDefault(ch2, 0)+1);
            }

            i++;
            j++;
           }


          }
          return count;
       }


    public static void main(String[] args) {
        String text ="aaaa";
        String pattern = "aa";

        System.out.println("The total number of Anagram is " + countAnagrams(text, pattern));

    }
}