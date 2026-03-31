/*
 * Problem Name: Longest Common Subsequence (LCS)
 *
 * input:
 * text1 = "abcde"
 * text2 = "ace"
 *
 * output:
 * 3
 *
 * Example:
 *
 * common subsequence = "ace"
 *
 * length = 3
 *
 * subsequence:
 * characters in same order (not necessarily continuous)
 *
 * Approach:
 *
 * if characters match:
 *    1 + diagonal value
 *
 * else:
 *    max(left, top)
 *
 * dp[i][j] =
 *
 *  if match: 1 + dp[i-1][j-1]
 *
 *  else:
 *  max(dp[i-1][j], dp[i][j-1])
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 */

package Week01_Basics_Logic.Week12_DP.Day81_DP_Strings;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ace";

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                } else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
