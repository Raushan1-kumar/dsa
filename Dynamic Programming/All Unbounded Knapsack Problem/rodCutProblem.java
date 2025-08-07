
// this is same as unbounded knapsack but this is asked in different ways means you have given a rod and you need to cut it 
// and fixed size will be given to you and their respective profit you need to cut it such way that you can maximize profit 
// its code will also same as unbounded knapsack 
// in some case only length is given then that case you need to think for size will be equal to given length 

public class rodCutProblem {

    public static int rodCutMethod(int size[], int profit[], int length, int n){
       
        int dp[][] = new int[n+1][length+1];

        for(int i=0; i<n+1; i++){
            dp[i][0]= 0;
        }
        for(int j=1; j<length+1; j++){
            dp[0][j]=0;
        }


        for(int i=1; i<n+1; i++){
            for(int j=1; j<length+1; j++){
                
                if(size[i-1] <= j){
                    dp[i][j] = Math.max(profit[i-1]+dp[i][j-size[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }




        return dp[n][length];
    }
    
    public static void main(String[] args) {
        int size[]={1,2,3,4,5,6};
        int length=6;
        int profit[]={2,35,66,3,67,77};

       int n=size.length;

       System.out.println("the maximum profit will be "+rodCutMethod(size, profit, length, n));
    }
}
