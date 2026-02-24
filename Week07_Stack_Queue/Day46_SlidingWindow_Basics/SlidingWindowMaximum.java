/*
 * Question:
 * Find maximum in every window of size K.
 *
 * Example:
 * Input: [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 *
 * Idea:
 * Use Deque to store indices
 * Keep elements in decreasing order
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day46_SlidingWindow_Basics;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove out of window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }
}
