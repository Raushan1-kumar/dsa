

public class checkIsRotatedStringOrNot {
     public static void main(String[] args) {
        String s="abcd";
        String rotated="cdad";
        if((s.length()==rotated.length())&&(s+s).contains(rotated)){
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }
        
     }
}

// 