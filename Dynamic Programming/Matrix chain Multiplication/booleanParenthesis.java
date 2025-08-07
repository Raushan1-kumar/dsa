*-public class booleanParenthesis {

    public static int countBooleanParenthesis(String s, int i, int j){


        for(int k=i+1; k<j-1; k=k+2){
           boolean ans=(countBooleanParenthesis(s, i, k-1))((boolean)s.charAt(k))(countBooleanParenthesis)(s, k+1, j));
        }
    }
    public static void main(String[] args) {-
        String s="T|F&T^F";
        int n= s.length();
        int i=0;
        int j=n-1;

    }
}
