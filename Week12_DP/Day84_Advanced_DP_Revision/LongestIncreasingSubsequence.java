/*
 * Problem Name: Longest Increasing Subsequence (LIS)
 *
 * input:
 * arr = [10,9,2,5,3,7,101,18]
 *
 * output:
 * 4
 *
 * Example:
 *
 * increasing subsequence:
 * 2 → 3 → 7 → 101
 *
 * length = 4
 *
 * Approach:
 *
 * for each element:
 * check all previous elements
 *
 * if current > previous:
 * update LIS length
 *
 * dp[i] =
 * longest increasing subsequence ending at i
 *
 * dp[i] = max(dp[i], 1 + dp[j])
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week12_DP.Day84_Advanced_DP_Revision;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };

        int n = arr.length;

        int[] dp = new int[n];

        for (int i = 0; i < n; i++)
            dp[i] = 1;

        int max = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {

                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}