/*
 * Problem Name: Fibonacci using Memoization (Top Down DP)
 *
 * input:
 * n = 6
 *
 * output:
 * 8
 *
 * Example:
 * Fibonacci series:
 * 0 1 1 2 3 5 8
 *
 * fib(6) = 8
 *
 * Approach:
 * 1. Fibonacci formula:
 *    fib(n) = fib(n-1) + fib(n-2)
 *
 * 2. Use recursion + dp array to store already calculated values.
 *
 * 3. Avoid repeated calculations.
 *
 * Dry Run:
 * fib(6)
 * = fib(5) + fib(4)
 *
 * store values in dp[]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week12_DP.Day78_DP_Basics;

import java.util.Arrays;

public class FibonacciMemoization {

    static int fib(int n, int[] dp) {

        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 6;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        System.out.println(fib(n, dp));
    }
}
