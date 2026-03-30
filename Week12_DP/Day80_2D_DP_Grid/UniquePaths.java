/*
 * Problem Name: Unique Paths
 *
 * input:
 * m = 3, n = 3
 *
 * output:
 * 6
 *
 * Example:
 *
 * Robot can move only:
 * right →
 * down ↓
 *
 * Grid:
 *
 *  S → →
 *  ↓   ↓
 *  → → E
 *
 * Total ways = 6
 *
 * Approach:
 * From each cell:
 *
 * ways =
 * top cell + left cell
 * 
 * 
 * Formula:
 *
 * dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
 *
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */

package Week01_Basics_Logic.Week12_DP.Day80_2D_DP_Grid;

public class UniquePaths {

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++)
            dp[i][0] = 1;

        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        System.out.println(dp[m - 1][n - 1]);
    }
}
