/*
 * Question:
 * Next Greater Element in Circular Array
 *
 * Example:
 * Input: [1,2,1]
 * Output: [2,-1,2]
 *
 * Trick:
 * Traverse array twice (2*n)
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day48_StackQueue_Advanced;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementCircular {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 1 };
        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                result[stack.pop()] = nums[index];
            }

            if (i < n)
                stack.push(index);
        }

        System.out.println(Arrays.toString(result));
    }
}