/*
 * Problem Name: Min Stack
 *
 * input:
 * push 5
 * push 2
 * push 8
 *
 * output:
 * min = 2
 *
 * Example:
 *
 * stack should return minimum value
 * in constant time
 *
 * Approach:
 *
 * use 2 stacks
 *
 * one normal stack
 *
 * second stack stores minimum
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day88_LinkedList_Stack_Queue;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Stack<Integer> minStack = new Stack<>();

        push(stack, minStack, 5);
        push(stack, minStack, 2);
        push(stack, minStack, 8);

        System.out.println(minStack.peek());
    }

    static void push(Stack<Integer> stack, Stack<Integer> minStack, int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {

            minStack.push(val);
        }
    }
}