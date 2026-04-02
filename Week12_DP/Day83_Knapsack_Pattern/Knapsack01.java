/*
 * Problem Name: 0/1 Knapsack
 *
 * input:
 * weights = [1,3,4,5]
 * values = [1,4,5,7]
 * capacity = 7
 *
 * output:
 * 9
 *
 * Example:
 *
 * choose items:
 *
 * weight 3 value 4
 * weight 4 value 5
 *
 * total value = 9
 *
 * Approach:
 *
 * for each item:
 *
 * we have 2 choices:
 *
 * take item
 * OR
 * skip item
 *
 * dp[i][w] = max(take value + dp[i-1][remaining weight],skip = dp[i-1][w])
 *
 * Time Complexity: O(n*capacity)
 * Space Complexity: O(n*capacity)
 */

package Week01_Basics_Logic.Week12_DP.Day83_Knapsack_Pattern;

public class Knapsack01 {

    public static void main(String[] args) {

        int[] weights = { 1, 3, 4, 5 };
        int[] values = { 1, 4, 5, 7 };

        int capacity = 7;

        int n = weights.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {

            for (int w = 1; w <= capacity; w++) {

                if (weights[i - 1] <= w) {

                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);

                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println(dp[n][capacity]);
    }
}
