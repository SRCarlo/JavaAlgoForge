/*
 * Question:
 * For each day, find how many days until a warmer temperature.
 *
 * Example:
 * Input: [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 *
 * Pattern:
 * Monotonic Stack (decreasing)
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day49_Stack_Queue_Revision;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int n = temp.length;

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }

            stack.push(i);
        }

        System.out.println(Arrays.toString(result));
    }
}