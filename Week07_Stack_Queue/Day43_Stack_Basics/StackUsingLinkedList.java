/**
 * Question:
 * Implement Stack using Linked List
 *
 * Advantage:
 * No fixed size limitation
 *
 * Time Complexity:
 * push → O(1)
 * pop → O(1)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day43_Stack_Basics;

import java.util.Stack;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Satck {
        Node top;

        void push(int value) {

            Node newNode = new Node(value);

            newNode.next = top;
            top = newNode;
        }

        int pop() {

            if (top == null) {
                System.out.println("Stack UnderFlow.");
                return -1;
            }

            int value = top.data;
            top = top.next;

            return value;
        }

        int peek() {
            if (top == null)
                return -1;
            return top.data;
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(15);
        stack.push(15);
        stack.push(25);

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());
    }

}
