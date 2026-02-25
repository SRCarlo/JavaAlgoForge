/*
 * Question:
 * Implement Queue using Stack.
 *
 * Idea:
 * - Use two stacks
 * - stack1 for input
 * - stack2 for output
 *
 * Time Complexity:
 * Amortized O(1)
 */
package Week01_Basics_Logic.Week07_Stack_Queue.Day47_StackQueue_Conversions;

import java.util.Stack;

public class ImplementQueueUsingStack {

    static class MyQueue {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        void enqueue(int x) {
            stack1.push(x);
        }

        int dequeue() {

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        int peek() {

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }
    }

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
    }
}