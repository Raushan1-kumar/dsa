

public class subsetSumProblem {
   
    public static boolean subsetSumMethod(int [] arr, int sum, int n)
    {
       boolean dp[][] = new boolean[n+1][sum+1];

       //initialization of first row and first column
     for (int i = 0; i <= n; i++) {
            dp[i][0] = true; // sum 0 is always possible with any number of elements (by taking nothing)
        }

        for (int j = 1; j <= sum; j++) {
            dp[0][j] = false; // sum > 0 is not possible with 0 elements
        }


       for(int i=1; i<n+1; i++){
          for(int j=1; j<sum+1; j++){

            if(arr[i-1] <=j){
                dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j];
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
          }
       }



        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,2,7,5};
        int sum=12;
        int n=arr.length;
        System.out.println(subsetSumMethod(arr, sum, n));
    }
}
