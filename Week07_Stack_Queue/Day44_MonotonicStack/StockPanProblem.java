
/**
 * Question:
 * Stock Span Problem
 *
 * Example:
 * Prices: [100, 80, 60, 70, 60, 75, 85]
 * Output: [1, 1, 1, 2, 1, 4, 6]
 *
 * Algorithm:
 * 1. Use stack to store indices
 * 2. Pop smaller prices
 * 3. Span = i - previous greater index
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day44_MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class StockPanProblem {
    public static void main(String[] args) {

        int[] prices = { 100, 80, 60, 70, 60, 75, 85 };
        int n = prices.length;

        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }
        System.out.println(Arrays.toString(span));
    }

}
