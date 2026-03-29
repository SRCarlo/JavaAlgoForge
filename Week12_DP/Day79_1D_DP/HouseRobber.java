/*
 * Problem Name: House Robber
 *
 * input:
 * houses money = [2,7,9,3,1]
 *
 * output:
 * 12
 *
 * Example:
 *
 * Cannot rob adjacent houses.
 *
 * Best choice:
 * rob 2 + 9 + 1 = 12
 *
 * Approach:
 * At each house we have 2 choices:
 *
 * 1. Rob current house
 *    add money + dp[i-2]
 *
 * 2. Skip current house
 *    take dp[i-1]
 *
 * Formula: dp[i] = max( dp[i-1],money[i] + dp[i-2])
 *            
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week12_DP.Day79_1D_DP;

public class HouseRobber {

    public static void main(String[] args) {

        int[] money = { 2, 7, 9, 3, 1 };

        int n = money.length;

        int[] dp = new int[n];

        dp[0] = money[0];

        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < n; i++) {

            dp[i] = Math.max(dp[i - 1], money[i] + dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
    }
}
