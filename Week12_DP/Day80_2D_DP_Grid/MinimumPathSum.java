/*
 * Problem Name: Minimum Path Sum
 *
 * input:
 * grid =
 *  [
 *     [1,3,1],
 *     [1,5,1],
 *     [4,2,1]
 *  ]
 *
 * output:
 * 7
 *
 * Example:
 *
 * path:
 *
 * 1 → 3 → 1 → 1 → 1
 *
 * total = 7
 *
 * Approach:
 *
 * choose minimum cost path.
 *
 * dp[i][j] = grid value + min( top cell, left cell )
 *
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */

package Week01_Basics_Logic.Week12_DP.Day80_2D_DP_Grid;

public class MinimumPathSum {

    public static void main(String[] args) {

        int[][] grid = {
                { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 }
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++)
            dp[i][0] = dp[i - 1][0] + grid[i][0];

        for (int j = 1; j < n; j++)
            dp[0][j] = dp[0][j - 1] + grid[0][j];

        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println(dp[m - 1][n - 1]);
    }
}
