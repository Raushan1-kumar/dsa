

public class countOfSubsetSum {

    public static int countOfSubsetSumMethod(int arr[] , int sum, int n){
        int dp[][] = new int[n+1][sum+1];

        for(int i=0; i<n+1; i++){
            dp[i][0]= 1;
        }

        for(int j=1; j<sum+1; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }


        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,5,2};
        int sum=5;
        int n=arr.length;
        System.out.println("The total no. of subsets whose sum is equal to "+sum +" is " +countOfSubsetSumMethod(arr, sum, n));
    }
}
