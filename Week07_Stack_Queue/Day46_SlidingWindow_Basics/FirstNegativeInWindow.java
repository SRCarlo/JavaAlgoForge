/*
 * Question:
 * Find first negative number in every window of size K.
 *
 * Example:
 * Input: [12,-1,-7,8,-15,30,16,28], k = 3
 * Output: [-1,-1,-7,-15,-15,0]
 *
 * Idea:
 * Use Queue to store negative numbers
 *
 * Time Complexity: O(n)
 */


package Week01_Basics_Logic.Week07_Stack_Queue.Day46_SlidingWindow_Basics;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {

    public static void main(String[] args) {

        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                queue.add(i);
            }

            // When window size reached
            if (i >= k - 1) {

                // Remove out of window indices
                while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                    queue.poll();
                }

                if (queue.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[queue.peek()] + " ");
                }
            }
        }
    }
}
