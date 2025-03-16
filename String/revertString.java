import java.util.Scanner;

public class revertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=0;
        System.out.println("Enter any string");
        String s = scanner.next();
        String reverse="";
        for(char c :s.toCharArray()){
            size++;
        }
       System.out.println("size is "+size);
       int start=0, end=size-1;
       while(start<size){
          reverse += s.charAt(end);
          start++;
          end--;
       }
       System.out.println(reverse);
    }
}
