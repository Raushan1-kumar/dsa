public class longestSubstringWithoutChange {
    
     public static int longestSubstring(String str){

        int currentlength = 1, maxLength=0;
         int i=0, j=1, n=str.length();
          if(n==0 || n==1){
            return n;
          }


         while(j < n){
          
            if(str.charAt(i)==str.charAt(j)){
                currentlength++;
                i++;
                j++;
            }

            else{
                maxLength= Math.max(currentlength, maxLength);
                currentlength = 1;
                i++;
                j++;
            }
            
         }
         
         maxLength= Math.max(currentlength, maxLength);
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "accca";
        System.out.println("The length of longest substring without repeating character " + longestSubstring(str));
    }
}
