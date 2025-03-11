

public class checkIsRotatedStringOrNot {
     public static void main(String[] args) {
        String s="abcd";
        String rotated="cdab";

        int length=s.length();
        if(s.charAt(length-1)==rotated.charAt(1)){
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }
     }
}

// 