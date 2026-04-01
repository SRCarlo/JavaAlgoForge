/*
 * Problem Name: Count Subsets with Given Sum
 *
 * input:
 * arr = [1,2,3,3]
 * target = 6
 *
 * output:
 * 3
 *
 * Example:
 *
 * subsets:
 *
 * 1 + 2 + 3
 * 1 + 2 + 3
 * 3 + 3
 *
 * total ways = 3
 *
 * Approach:
 *
 * similar to subset sum
 *
 * instead of boolean
 * store count
 *
 * dp[i][j] =
 * number of ways
 *
 * take
 * +
 * skip
 *
 * Time Complexity: O(n*sum)
 * Space Complexity: O(n*sum)
 */

package Week01_Basics_Logic.Week12_DP.Day82_Subsequence_DP;

public class CountSubsetsWithSum {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 3 };

        int target = 6;

        int n = arr.length;

        int[][] dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= target; j++) {

                if (arr[i - 1] <= j) {

                    dp[i][j] = dp[i - 1][j]
                            +
                            dp[i - 1][j - arr[i - 1]];

                } else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][target]);
    }
}
