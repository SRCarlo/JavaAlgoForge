/*
 * Problem Name: Best Time to Buy and Sell Stock
 *
 * input:
 * prices = [7,1,5,3,6,4]
 *
 * output:
 * 5
 *
 * Example:
 *
 * buy at 1
 * sell at 6
 *
 * profit = 5
 *
 * Approach:
 *
 * track minimum price
 *
 * calculate profit each day
 *
 * keep maximum profit
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day85_Arrays_Revision;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int price : prices) {

            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);
    }
}