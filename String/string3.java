public class string3{
    public static void main(String[] args) {
        String s="a";
        String ans="";
        int length = s.length();
        int count=0;
        char  current=s.charAt(0);

        for(int i=0; i<length; i++){
            if(s.charAt(i)==current){
                count++;
            }
           else if(s.charAt(i) != current){
                ans+=current;
                if(count!=1){
                    ans+=count;
                }
                current=s.charAt(i);
                count=1;
            }
        }
           ans+=current;
        if(count !=1){
            ans+=count;
        }
        System.out.println(ans);

    }
}