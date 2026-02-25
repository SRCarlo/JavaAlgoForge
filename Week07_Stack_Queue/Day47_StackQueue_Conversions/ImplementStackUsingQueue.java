/**
 * Question:
 * Implement Stack using Queue.
 *
 * Idea:
 * - Use one queue
 * - After every push, rotate elements
 *
 * Time Complexity:
 * push → O(n)
 * pop → O(1)
 */
package Week01_Basics_Logic.Week07_Stack_Queue.Day47_StackQueue_Conversions;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    static class MyStack {

        Queue<Integer> queue = new LinkedList<>();

        void push(int x) {

            queue.add(x);

            // Rotate previous elements
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
        }

        int pop() {
            return queue.poll();
        }

        int top() {
            return queue.peek();
        }

        boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
    }
}