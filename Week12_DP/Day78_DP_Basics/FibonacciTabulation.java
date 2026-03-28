/*
 * Problem Name: Fibonacci using Tabulation (Bottom Up DP)
 *
 * input:
 * n = 6
 *
 * output:
 * 8
 *
 * Example:
 * Build dp array step by step:
 *
 * dp[0] = 0
 * dp[1] = 1
 *
 * dp[2] = 1
 * dp[3] = 2
 * dp[4] = 3
 * dp[5] = 5
 * dp[6] = 8
 *
 * Approach:
 * 1. Start from base case.
 * 2. Build solution bottom-up.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week12_DP.Day78_DP_Basics;

public class FibonacciTabulation {

    public static void main(String[] args) {

        int n = 6;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
