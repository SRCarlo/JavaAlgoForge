/**
 * Question:
 * Design a stack that supports:
 * push()
 * pop()
 * top()
 * getMin() in O(1)
 *
 * Idea:
 * Use two stacks:
 * 1. main stack
 * 2. min stack
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day43_Stack_Basics;

import java.util.Stack;

public class MinStack {

    static class MyStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        void push(int val) {

            stack.push(val);

            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        void pop() {

            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }

            stack.pop();
        }

        int top() {
            return stack.peek();
        }

        int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(5);
        stack.push(3);
        stack.push(7);

        System.out.println("Minimum: " + stack.getMin());

        stack.pop();

        System.out.println("Top: " + stack.top());
    }
}
