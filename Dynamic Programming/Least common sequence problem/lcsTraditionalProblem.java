
public class lcsTraditionalProblem {

    public static int lcsMemoization(String s1, String s2, int m, int n, int dp[][]) {

        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return dp[m][n] = 1 + lcsMemoization(s1, s2, m - 1, n - 1, dp);
        } else {
            // Else, move one index at a time and take the max
            return dp[m][n] = Math.max(lcsMemoization(s1, s2, m - 1, n, dp), lcsMemoization(s1, s2, m, n - 1, dp));
        }
    }
    
    public static int lcsTopDownApproach(String s1, String s2, int m, int n){
     
        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<=m;i++){
            for(int j=0; j<=n; j++){
                if(i==0|| j==0){
                    dp[i][j] =0;
                }
            }
        }

        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(s1.charAt(i-1)== s2.charAt(j-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }

                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        





        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1; // Initialize the dp array with -1
            }
        }
        System.out.println("The longest common subsequence of given two string is " + lcsMemoization(s1, s2, m, n, dp));
        System.out.println("The longest common subsequence of given two string is " + lcsTopDownApproach(s1, s2, m, n));
    }
}
