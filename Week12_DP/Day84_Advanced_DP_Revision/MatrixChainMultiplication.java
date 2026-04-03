/*
 * Problem Name: Matrix Chain Multiplication
 *
 * input:
 * arr = [1,2,3,4]
 *
 * matrices:
 * A(1x2), B(2x3), C(3x4)
 *
 * output:
 * 18
 *
 * Example:
 *
 * (AB)C cost:
 * = (1*2*3) + (1*3*4)
 * = 6 + 12 = 18
 *
 * minimum multiplication cost
 *
 * Approach:
 *
 * try all partitions
 *
 * dp[i][j] = minimum cost to multiply matrices from i to j
 *
 * try every k between i and j
 *
 * cost = left part + right part + multiplication cost
 *
 * Time Complexity: O(n³)
 * Space Complexity: O(n²)
 */

package Week01_Basics_Logic.Week12_DP.Day84_Advanced_DP_Revision;

public class MatrixChainMultiplication {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        int n = arr.length;

        int[][] dp = new int[n][n];

        for (int len = 2; len < n; len++) {

            for (int i = 1; i < n - len + 1; i++) {

                int j = i + len - 1;

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(
                            dp[i][j],
                            cost);
                }
            }
        }

        System.out.println(dp[1][n - 1]);
    }
}