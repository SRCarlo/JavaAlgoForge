/*
 * Problem Name: Equal Sum Partition
 *
 * input:
 * arr = [1,5,11,5]
 *
 * output:
 * true
 *
 * Example:
 *
 * total sum = 22
 *
 * subset1 = 11
 * subset2 = 11
 *
 * possible partition
 *
 * Approach:
 *
 * find total sum
 *
 * if sum is odd → not possible
 *
 * find subset with sum/2
 *
 * same as subset sum problem
 *
 * Time Complexity: O(n*sum)
 * Space Complexity: O(n*sum)
 */

package Week01_Basics_Logic.Week12_DP.Day82_Subsequence_DP;

public class EqualPartition {

    public static void main(String[] args) {

        int[] arr = { 1, 5, 11, 5 };

        int sum = 0;

        for (int num : arr)
            sum += num;

        if (sum % 2 != 0) {

            System.out.println(false);
            return;
        }

        int target = sum / 2;

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
