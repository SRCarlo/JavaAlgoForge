/*
 * Problem Name: Longest Common Substring
 *
 * input:
 * s1 = "abcde"
 * s2 = "abfce"
 *
 * output:
 * 2
 *
 * Example:
 *
 * common substring = "ab"
 *
 * substring:
 * continuous characters
 *
 * Approach:
 *
 * if match:
 * 1 + diagonal
 *
 * else:
 * 0
 *
 * dp[i][j] =
 *
 * if match:
 * 1 + dp[i-1][j-1]
 *
 * else:
 * 0
 *
 * track max length
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 */

package Week01_Basics_Logic.Week12_DP.Day81_DP_Strings;

public class LongestCommonSubstring {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "abfce";

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        int max = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        System.out.println(max);
    }
}
