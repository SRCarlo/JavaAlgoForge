/*
 * Problem Name: Maximum Sum of Non Adjacent Elements
 *
 * input:
 * arr = [3,2,7,10]
 *
 * output:
 * 13
 *
 * Example:
 *
 * pick 3 + 10 = 13
 *
 * cannot pick 7 because adjacent
 *
 * Approach:
 *
 * Same pattern as House Robber.
 *
 * For each element:
 *
 * pick = arr[i] + dp[i-2]
 *
 * skip = dp[i-1]
 *
 * dp[i] = max(pick, skip)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week12_DP.Day79_1D_DP;

public class MaximumSumNonAdjacent {

    public static void main(String[] args) {

        int[] arr = { 3, 2, 7, 10 };

        int n = arr.length;

        int[] dp = new int[n];

        dp[0] = arr[0];

        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {

            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
    }
}
