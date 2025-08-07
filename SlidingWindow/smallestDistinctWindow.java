// find that smallest window which has distinct k element 

import java.util.*;
public class smallestDistinctWindow {
    
    public static int smallestDistinctWindowMethod(String str, int key){
       int n= str.length();
       int i=0, j=0, minLength=100000;
       
       Map<Character, Integer> map = new HashMap<>();
       if(n <key){
        return 0;
       }
      
       while(j < n){
         char chIn = str.charAt(j);
         map.put(chIn , map.getOrDefault(chIn, 0)+1);

         if(map.size()<key){
            j++;
         }

         else{
               minLength=Math.min(minLength, j-i+1);
               while (map.size() > key) {
                char ch = str.charAt(i);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                i++;
            }
            j++;
         }
       }

      if(minLength ==10000){
        return 0;
      }
      minLength = Math.min(minLength, j-i+1);
        return minLength;
    }

    public static void main(String[] args) {
        String str = "aabeedcaaaaa";
        int key=3;
        System.out.println("The size of smallest distinct substring having k distinct element is "+smallestDistinctWindowMethod(str, key));
    }
}
