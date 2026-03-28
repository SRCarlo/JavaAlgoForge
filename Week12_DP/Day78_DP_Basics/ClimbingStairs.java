/*
 * Problem Name: Climbing Stairs
 *
 * input:
 * n = 5 steps
 *
 * output:
 * 8 ways
 *
 * Example:
 *
 * You can climb 1 or 2 steps.
 *
 * Ways:
 *
 * 1 1 1 1 1
 * 1 1 1 2
 * 1 1 2 1
 * 1 2 1 1
 * 2 1 1 1
 * 1 2 2
 * 2 1 2
 * 2 2 1
 *
 * Total = 8
 *
 * Approach:
 * Same as Fibonacci
 *
 * ways(n) =
 * ways(n-1) + ways(n-2)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week12_DP.Day78_DP_Basics;

public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 5;

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
