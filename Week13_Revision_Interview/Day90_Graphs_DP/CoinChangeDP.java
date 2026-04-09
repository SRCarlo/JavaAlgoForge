/*
 * Problem Name: Coin Change (Minimum Coins)
 *
 * input:
 * coins = [1,2,5]
 * amount = 11
 *
 * output:
 * 3
 *
 * Example:
 *
 * 5 + 5 + 1 = 11
 *
 * minimum coins = 3
 *
 * Approach:
 *
 * try every coin
 *
 * choose minimum count
 *
 * dp array
 *
 * Time Complexity: O(n * amount)
 * Space Complexity: O(amount)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day90_Graphs_DP;

import java.util.Arrays;

public class CoinChangeDP {

    public static void main(String[] args) {

        int[] coins = { 1, 2, 5 };

        int amount = 11;

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (i - coin >= 0) {

                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        if (dp[amount] > amount)

            System.out.println(-1);

        else
            System.out.println(dp[amount]);
    }
}