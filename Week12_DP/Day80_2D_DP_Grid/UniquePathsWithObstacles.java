/*
 * Problem Name: Unique Paths with Obstacles
 *
 * input:
 * grid =
 *  [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 *  ]
 *
 * output:
 * 2
 *
 * Example:
 *
 * 0 = free cell
 * 1 = obstacle ❌
 *
 * Only 2 valid paths to reach end.
 *
 * Approach:
 *
 * If obstacle → dp[i][j] = 0
 *
 * otherwise:
 * dp[i][j] = dp[i - 1][j] +  dp[i][j - 1]
 *
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */

package Week01_Basics_Logic.Week12_DP.Day80_2D_DP_Grid;

public class UniquePathsWithObstacles {

    public static void main(String[] args) {

        int[][] grid = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        if (grid[0][0] == 1) {

            System.out.println(0);
            return;
        }

        dp[0][0] = 1;

        for (int i = 1; i < m; i++)
            dp[i][0] = grid[i][0] == 0
                    ? dp[i - 1][0]
                    : 0;

        for (int j = 1; j < n; j++)
            dp[0][j] = grid[0][j] == 0
                    ? dp[0][j - 1]
                    : 0;

        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                if (grid[i][j] == 0) {

                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        System.out.println(dp[m - 1][n - 1]);
    }
}
