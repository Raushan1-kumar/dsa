import java.util.Scanner;

public class longestWordInSentence {
    public static String longestWord(String s){
       String temp="";
       String result="";

       for(char ch: s.toCharArray()){
         if(ch ==' '){
           if(temp.length()>result.length()){
              result = temp;
           }
           temp="";
         }
         else{
            temp += ch;
         }
       }
       if(temp.length()>result.length()){
        result = temp;
       }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s = scanner.nextLine();
        System.out.println("The longest word is : "+longestWord(s));
        scanner.close();
    }
}
