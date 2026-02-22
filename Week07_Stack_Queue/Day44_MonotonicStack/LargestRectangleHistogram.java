/**
 * Question:
 * Largest Rectangle in Histogram
 *
 * Example:
 * Input:  [2,1,5,6,2,3]
 * Output: 10
 *
 * Idea:
 * For each bar:
 * Find Previous Smaller and Next Smaller
 *
 * Area = height * width
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day44_MonotonicStack;

import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {

        int[] heights = { 2, 1, 5, 6, 2, 3 };
        int n = heights.length;

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            int height = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && height < heights[stack.peek()]) {

                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, h * width);
            }

            stack.push(i);
        }
        System.out.println("Max Area is : " + maxArea);
    }
}
