
//its code is also same as only difference in max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j])  for top-down approach
public class unboundedknapsackTraditionalProblem {
    
    public static int bottomupapproach(int wt[], int val[], int w, int n){
        int dp[][] = new int[n+1][w+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] =0;
        }
        for(int j=1; j<w+1; j++){
            dp[0][j]=0;
        }


        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(wt[i-1] <= j){
                  dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]);
                }
                else{
                   dp[i][j] = dp[i-1][j];
                }
            }
        }


        return dp[n][w];
    }

    public static void main(String[] args) {
        int wt[] = {2,5,6,3,2,9};
        int val[] = {22,5,3,66,3,63};
        int w=13;

        int n=wt.length;

      System.out.println("The maximum profit is " + bottomupapproach(wt, val, w, n));
    }
}
