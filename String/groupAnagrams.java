import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams{
   public static List<List<String>> groupAnagram(String[] s){
     Map<String, List<String>> map = new HashMap<>();

     for(String str: s){
       char[] chars = str.toCharArray();
       Arrays.sort(chars);
       String sortedstr = new String(chars);
       System.out.println(sortedstr);
       map.putIfAbsent(sortedstr, new ArrayList<>());
       map.get(sortedstr).add(str);
       System.out.println(map);

     }
     return new ArrayList<>(map.values());
   }



    public static void main(String[] args) {
        String [] words ={"eat", "tea", "tan","bat","ant"};
        
        List<List<String>> result = groupAnagram(words);
        System.out.println("Group anagrams is "+result);



    }
}
///abcdefghij
/// efg
/// dce