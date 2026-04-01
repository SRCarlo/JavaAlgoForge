/*
 * Problem Name: Subset Sum
 *
 * input:
 * arr = [2,3,7,8,10]
 * target = 11
 *
 * output:
 * true
 *
 * Example:
 *
 * subset:
 * 3 + 8 = 11
 *
 * Approach:
 *
 * For each number:
 *
 * we can either:
 * take it
 * OR
 * skip it
 *
 * dp[i][j] =
 * true if sum possible
 *
 * if current value <= target:
 *
 * dp[i][j] =
 * take
 * OR
 * skip
 *
 * Time Complexity: O(n*sum)
 * Space Complexity: O(n*sum)
 */

package Week01_Basics_Logic.Week12_DP.Day82_Subsequence_DP;

public class SubsetSum {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 7, 8, 10 };
        int target = 11;

        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= target; j++) {

                if (arr[i - 1] <= j) {

                    dp[i][j] = dp[i - 1][j]
                            ||
                            dp[i - 1][j - arr[i - 1]];

                } else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][target]);
    }
}