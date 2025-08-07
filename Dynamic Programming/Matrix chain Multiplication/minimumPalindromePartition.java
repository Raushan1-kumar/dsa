import java.util.Arrays;

public class minimumPalindromePartition {

    public static boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }

    public static int minimumPalindromePartitionMethod(String s, int i, int j) {
        int ans = Integer.MAX_VALUE;
        int temp_ans = 0;

        if (i >= j) {
            return 0;
        }
        if (isPalindrome(s, i, j)) {
            return 0;
        }

        for (int k = i; k < j; k++) {
            temp_ans = minimumPalindromePartitionMethod(s, i, k) + minimumPalindromePartitionMethod(s, k + 1, j) + 1;
            ans = Math.min(temp_ans, ans);
        }

        return ans;
    }
 
    public static int minimumPalindromePartitionMemoization(String s, int dp[][], int i ,int j){
        int temp_ans=0;
        int ans= Integer.MAX_VALUE;

        if(i>=j){
            return 0;
        }
        if(isPalindrome(s, i, j)){
            return 0;
        }

        if(dp[i][j] != -1){
             return dp[i][j];
        }

        for(int k=i; k<j; k++){
            dp[i][j] = minimumPalindromePartitionMemoization(s, dp, i, k)+minimumPalindromePartitionMemoization(s, dp, k+1, j)+1;
            ans = Math.min(ans, dp[i][j]);
        }

        return ans;
    }


    public static void main(String[] args) {
        String s = "nitisn";
        int i = 0;
        int j = s.length() - 1;
        
        int n=s.length();
        int dp[][] = new int[n][n];

        for(int [] row:dp){
            Arrays.fill(row, -1);
        }


        System.out.println("The number of palindrome partition is " + minimumPalindromePartitionMethod(s, i, j));
        System.out.println("The number of palindrome partition is " + minimumPalindromePartitionMemoization(s, dp,i, j));

    }
}
