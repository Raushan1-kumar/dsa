public class longestPalindromicSubsequence {
 
    public static int lps(String s1, String s2, int m){
        int dp[][] = new int[m+1][m+1];

        for(int i=0; i<m+1; i++){
            for(int j=0; j<m+1; j++){
               if(i==0|| j==0){
                  dp[i][j] =0;
               }
            }
        }

        for(int i=1; i<m+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }


        return dp[m][m];
    }

    public static void main(String[] args) {
        String s1="abbakd";
        int m = s1.length(); 
        StringBuilder s2 = new StringBuilder(s1);  
        System.out.println("The longest common palindromic subsequence is "+lps(s1, s2.reverse().toString(), m));
    }
}
