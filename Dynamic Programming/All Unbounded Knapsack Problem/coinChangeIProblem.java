public class coinChangeIProblem {

    public static int coinChangeIIMethod(int coin[], int sum, int n) {
        int[][] dp = new int[n + 1][sum + 1];
        int INF = sum + 1; // safe large value to avoid overflow

        // Initialize first column (0 sum needs 0 coins)
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        // Initialize first row (0 coins can't form any positive sum)
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = INF;
        }

        // Fill the table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coin[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coin[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum] >= INF ? -1 : dp[n][sum];
    }

    public static void main(String[] args) {
        int coin[] = {1, 2, 3};
        int sum = 5;
        int n = coin.length;

        System.out.println("The minimum number of coins required is " + coinChangeIIMethod(coin, sum, n));
    }
}
