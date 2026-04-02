/*
 * Problem Name: Coin Change (Total Ways)
 *
 * input:
 * coins = [1,2,5]
 * target = 5
 *
 * output:
 * 4
 *
 * Example:
 *
 * ways:
 *
 * 1+1+1+1+1
 * 1+1+1+2
 * 1+2+2
 * 5
 *
 * total ways = 4
 *
 * Approach:
 *
 * unlimited coins allowed
 *
 * dp[i][j] =
 *
 * take coin
 * +
 * skip coin
 *
 * dp[i][j] =
 * dp[i][j-coin]
 * +
 * dp[i-1][j]
 *
 * Time Complexity: O(n*target)
 * Space Complexity: O(n*target)
 */

package Week01_Basics_Logic.Week12_DP.Day83_Knapsack_Pattern;

public class CoinChangeWays {

    public static void main(String[] args) {

        int[] coins = { 1, 2, 5 };

        int target = 5;

        int n = coins.length;

        int[][] dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= target; j++) {

                if (coins[i - 1] <= j) {

                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][target]);
    }
}
