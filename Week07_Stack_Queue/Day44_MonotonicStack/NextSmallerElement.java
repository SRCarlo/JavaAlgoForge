/*
* Question :
* Find Next Samller Element
*
* Example : 
* Input:[4,8,5,2]
* Output:[2,5,2,-1]
*
*Time Complexity: O(n)

 */
package Week01_Basics_Logic.Week07_Stack_Queue.Day44_MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {

        int[] arr = { 4, 8, 5, 2 };
        int n = arr.length;

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }

}
