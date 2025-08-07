public class longestCommonSubstring {


    public static int longestCommonSubstringMethod(String s1, String s2, int m , int n){
         int dp[][] = new int[m+1][n+1];

         int maxLength = 0; // To keep track of the maximum length of common substring
         for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
         }
        
         

         for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
               
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    maxLength = Math.max(maxLength, dp[i][j]); // Update maxLength if current length is greater
                }
                else{
                    dp[i][j] = 0;
                }
            }
         }


        return maxLength;
    }

     public static void main(String[] args) {
        String s1 = "aabaags";
        String s2 = "aabaksg";
        int m=s1.length();
        int n = s2.length();


        System.out.println("the length of longest common substring is "+longestCommonSubstringMethod(s1, s2, m, n));
     }
}