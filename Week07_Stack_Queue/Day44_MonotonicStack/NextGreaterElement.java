/**
 * Question:
 * Find Next Greater Element for each element in array.
 *
 * Example:
 * Input:  [4, 5, 2, 10]
 * Output: [5, 10, 10, -1]
 *
 * Algorithm:
 * 1. Traverse from right to left
 * 2. Maintain decreasing stack
 * 3. Pop smaller elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day44_MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 10 };
        int n = arr.length;

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If empty, no greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current Element
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));

    }

}
