public class knapsackProblem {

    public static int knapsackProblemMethod(int wt[], int p[], int w, int n, int[][] dp) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) {
            dp[n][w] = Math.max(
                p[n - 1] + knapsackProblemMethod(wt, p, w - wt[n - 1], n - 1, dp),
                knapsackProblemMethod(wt, p, w, n - 1, dp)
            );
        } else {
            dp[n][w] = knapsackProblemMethod(wt, p, w, n - 1, dp);
        }

        return dp[n][w];
    }


       public static int knapsackTopDown(int wt[], int p[], int W, int n) {
        int[][] dp = new int[n + 1][W + 1];

        // Initialize the first row and column to 0 (already default in Java)
        // dp[i][j] represents the max profit with i items and capacity j

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        p[i - 1] + dp[i - 1][w - wt[i - 1]],  // include the item
                        dp[i - 1][w]                         // exclude the item
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];  // can't include the item
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args) {
        int wt[] = {2, 3, 2, 6, 3};
        int p[] = {2, 33, 2, 22, 88};
        int w = 8;
        int n = wt.length;

        // Initialize dp array only once
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("The maximum profit will be " + knapsackProblemMethod(wt, p, w, n, dp));
        System.out.println("The maximum profit will be " + knapsackTopDown(wt, p, w, n));
    }
}
