/*
 * Problem Name: Edit Distance
 *
 * input:
 * word1 = "horse"
 * word2 = "ros"
 *
 * output:
 * 3
 *
 * Example:
 *
 * horse → rorse (replace h → r)
 * rorse → rose (remove r)
 * rose → ros (remove e)
 *
 * operations:
 * insert
 * delete
 * replace
 *
 * Approach:
 *
 * if characters match:
 * diagonal value
 *
 * else:
 * 1 + min(insert, delete, replace)
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 */

package Week01_Basics_Logic.Week12_DP.Day81_DP_Strings;

public class EditDistance {

    public static void main(String[] args) {

        String w1 = "horse";
        String w2 = "ros";

        int n = w1.length();
        int m = w2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = i;

        for (int j = 0; j <= m; j++)
            dp[0][j] = j;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (w1.charAt(i - 1) == w2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1];

                } else {

                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
