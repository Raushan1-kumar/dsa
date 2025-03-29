

public class checkIsRotatedStringOrNot {

    static public String reveString(String s){
        String a =s;
        int size = s.length();
        String b="";
        for(int i=size-1; i>=0; i--){
            b+=a.charAt(i);
        }
        System.out.println("reverse string is :"+b);
        return " ";
    }
     public static void main(String[] args) {
        String s="abcd";
        reveString(s);
        String rotated="cdad";
        if((s.length()==rotated.length())&&(s+s).contains(rotated)){
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }
     }
}

