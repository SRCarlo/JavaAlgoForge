/** * Question:
 * Design class that returns stock span for each price.
 *
 * Span = number of consecutive days price <= today
 *
 * Pattern:
 * Monotonic Stack
 *
 * Time Complexity: O(1) amortized
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day49_Stack_Queue_Revision;

import java.util.Stack;

public class OnlineStockSpan {

    static class StockSpanner {

        Stack<int[]> stack = new Stack<>();
        // int[0] = price
        // int[1] = span

        public int next(int price) {

            int span = 1;

            while (!stack.isEmpty() && stack.peek()[0] <= price) {
                span += stack.pop()[1];
            }

            stack.push(new int[] { price, span });
            return span;
        }
    }

    public static void main(String[] args) {

        StockSpanner sp = new StockSpanner();

        System.out.println(sp.next(100));
        System.out.println(sp.next(80));
        System.out.println(sp.next(60));
        System.out.println(sp.next(70));
        System.out.println(sp.next(60));
        System.out.println(sp.next(75));
        System.out.println(sp.next(85));
    }
}
