import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longestSubarray {

    public static void findingLongestSubarray(String s ){
        List<Character> list = new ArrayList<>();
        int count =0;
        int i=0;
        for(char ch: s.toCharArray()){
            if(!list.contains(ch)){
                list.add(ch);
                System.out.println(list);
            }
            else{
                count= Math.max(count, list.size());
                System.out.println(list.size());
                list.remove(i);
            }
        }
      if(count==0){
        System.out.println(1);
      }
      else{
        System.out.println(count);
      }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string :");
        String s = scanner.next();
        findingLongestSubarray(s);
    }
}
