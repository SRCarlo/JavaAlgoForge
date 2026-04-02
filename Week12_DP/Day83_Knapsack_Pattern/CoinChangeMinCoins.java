/*
 * Problem Name: Coin Change (Minimum Coins)
 *
 * input:
 * coins = [1,2,5]
 * target = 11
 *
 * output:
 * 3
 *
 * Example:
 *
 * 5 + 5 + 1 = 3 coins
 *
 * minimum coins needed
 *
 * Approach:
 *
 * dp[j] =
 * minimum coins needed
 *
 * dp[j] = min( 1 + dp[j-coin])
 *
 * Time Complexity: O(n*target)
 * Space Complexity: O(target)
 */

package Week01_Basics_Logic.Week12_DP.Day83_Knapsack_Pattern;

import java.util.Arrays;

public class CoinChangeMinCoins {

    public static void main(String[] args) {

        int[] coins = { 1, 2, 5 };

        int target = 11;

        int[] dp = new int[target + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int coin : coins) {

            for (int j = coin; j <= target; j++) {

                if (dp[j - coin] != Integer.MAX_VALUE) {

                    dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
                }
            }
        }
        System.out.println(dp[target]);
    }
}
