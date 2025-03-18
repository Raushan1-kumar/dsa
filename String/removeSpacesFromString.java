
import java.util.Scanner;

public class removeSpacesFromString {
    public static String removeSpaces(String s){
         String result = "";
         for(char ch: s.toCharArray()){
            if(ch ==' '){
            }
            else{
                result +=ch;
            }
         }
        return result;
        
    }

    public static String removeSpaces2(String s){
        return s.replaceAll("\\s","");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string :");
        String s =scanner.nextLine();
        System.out.println(removeSpaces(s));
        System.out.println(removeSpaces2(s));
        scanner.close();
    }
}
