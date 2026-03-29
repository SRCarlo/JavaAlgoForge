/*
 * Problem Name: Minimum Cost Climbing Stairs
 *
 * input:
 * cost = [10,15,20]
 *
 * output:
 * 15
 *
 * Example:
 *
 * climb 10 → 20 = 30
 * climb 15 → top = 15 (minimum)
 *
 * Approach:
 * From step i, we can move:
 *
 * 1 step
 * 2 step
 *
 * choose minimum cost path
 *
 * Formula:
 * dp[i] = cost[i] + min(dp[i-1], dp[i-2])
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 */

package Week01_Basics_Logic.Week12_DP.Day79_1D_DP;

public class MinCostClimbingStairs {

    public static void main(String[] args) {

        int[] cost = { 10, 15, 20 };

        int n = cost.length;

        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {

            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        int result = Math.min(dp[n - 1], dp[n - 2]);

        System.out.println(result);
    }
}
