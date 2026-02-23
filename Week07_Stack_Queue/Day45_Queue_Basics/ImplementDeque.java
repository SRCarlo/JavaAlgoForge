/**
 * Question:
 * Implement Deque (Double Ended Queue)
 *
 * Deque allows:
 * - Insert at front
 * - Insert at rear
 * - Delete from front
 * - Delete from rear
 *
 * Time Complexity: O(1)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day45_Queue_Basics;

import java.util.ArrayDeque;

public class ImplementDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add Elements
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);

        System.out.println("Deque : " + deque);

        // Remove Elements
        deque.removeFirst();
        deque.removeLast();

        System.out.println("After Removal : " + deque);
    }
}
