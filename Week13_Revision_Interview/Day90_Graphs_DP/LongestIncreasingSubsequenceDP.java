/**
 * Problem Name: Longest Increasing Subsequence
 *
 * input:
 * nums = [10,9,2,5,3,7,101,18]
 *
 * output:
 * 4
 *
 * Example:
 *
 * increasing subsequence:
 *
 * 2,3,7,101
 *
 * length = 4
 *
 * Approach:
 *
 * dp[i] =
 * longest sequence ending at i
 *
 * compare previous elements
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day90_Graphs_DP;

import java.util.Arrays;

public class LongestIncreasingSubsequenceDP {

    public static void main(String[] args) {

        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };

        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);

        int max = 1;

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
