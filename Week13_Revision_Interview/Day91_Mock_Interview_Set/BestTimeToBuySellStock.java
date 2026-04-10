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
 * calculate max profit
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day91_Mock_Interview_Set;

public class BestTimeToBuySellStock {

        public static void main(String[] args) {

                int[] prices = { 7, 1, 5, 3, 6, 4 };

                int min = Integer.MAX_VALUE;

                int profit = 0;

                for (int price : prices) {

                        min = Math.min(min, price);

                        profit = Math.max(profit, price - min);
                }

                System.out.println(profit);
        }
}
