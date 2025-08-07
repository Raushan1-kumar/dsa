import java.util.Arrays;

public class mcm {

    public static int mcmMethod(int arr[],int i, int j){
       int temp_ans=0;
       int ans=Integer.MAX_VALUE;
    
       if(i >=j){
         return 0;
       }
       for(int k=i; k<j; k++){
         temp_ans=mcmMethod(arr, i, k)+mcmMethod(arr, k+1, j)+arr[i-1]*arr[k]*arr[j];
         ans=Math.min(ans, temp_ans);
         System.out.println(ans);
       }
        return ans;
    }

    public static int mcmMethodMemoization(int arr[], int dp[][],int i ,int j){
        int ans=Integer.MAX_VALUE;
        if(i==j){
            return 0;
        }
        if(dp[i][j] !=-1){
            return dp[i][j];
        }
       for(int k=i; k<j; k++){

         dp[i][j]=mcmMethodMemoization(arr, dp, i, k)+mcmMethodMemoization(arr, dp, k+1, j)+arr[i-1]*arr[k]*arr[j];
         ans=Math.min(ans, dp[i][j]);
       }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]={20,30,10,40,20};
        int n=arr.length;
        int i=1;
        int j=arr.length-1;
        int dp[][] = new int[n+1][n+1];

        for(int [] row:dp){
            Arrays.fill(row, -1);
        }

        System.out.println("The minimum cost is "+ mcmMethod(arr, i, j));
        System.out.println("the minimum cost is "+mcmMethodMemoization(arr, dp, i, j));
    }
}
