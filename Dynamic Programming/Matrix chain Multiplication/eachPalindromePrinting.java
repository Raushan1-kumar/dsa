import java.util.Arrays;

public class eachPalindromePrinting {
     
    public static void isPalindrome(String s, int i, int j){
        int ans=0;
        int temp1=i;
        int temp2=j;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return;
            }
        }
        System.out.println(s.substring(temp1,temp2+1));
    }

    public static int minimumPalindromePartition(String s, int dp[][], int i, int j){
       int ans = Integer.MAX_VALUE;

       if(i>j){
        System.out.println("hit");
          return 0;
       }

       if(dp[i][j] != -1){
          return dp[i][j];
       }
       isPalindrome(s, i, j);

       for(int k=i; k<j; k++){
          dp[i][j]=minimumPalindromePartition(s, dp, i, k)+minimumPalindromePartition(s, dp, k+1, j)+1;
          ans = Math.min(ans, dp[i][j]);
       }
        return ans;
    }

    public static void main(String[] args) {
        String s = "nitin";
        int n=s.length();
        int i=0;
        int j=n-1;
        int dp[][] = new int[n][n];
        
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        minimumPalindromePartition(s, dp, i, j);
    }
}
