/*
 * Problem Name: Climbing Stairs
 *
 * input:
 * n = 5
 *
 * output:
 * 8
 *
 * Example:
 *
 * 1 step or 2 step
 *
 * ways to reach top
 *
 * Approach:
 *
 * dp[i] =
 * dp[i-1] + dp[i-2]
 *
 * fibonacci pattern
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day90_Graphs_DP;

public class ClimbingStairsDP {

    public static void main(String[] args) {

        int n = 5;

        int a = 1;
        int b = 1;

        for (int i = 2; i <= n; i++) {

            int c = a + b;

            a = b;

            b = c;
        }

        System.out.println(b);
    }
}
