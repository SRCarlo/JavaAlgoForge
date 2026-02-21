/**
 * Question:
 * Implement Stack using Array.
 *
 * Stack follows LIFO (Last In First Out)
 *
 * Example:
 * push(10)
 * push(20)
 * pop() → 20
 *
 * Algorithm:
 * 1. Create array
 * 2. Maintain top pointer
 * 3. push → increment top, insert value
 * 4. pop → return arr[top], decrement top
 *
 * Time Complexity:
 * push → O(1)
 * pop → O(1)
 *
 * Space Complexity:
 * O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day43_Stack_Basics;

public class StackUsingArray {

    static class Stack {

        int[] arr;
        int top;
        int size;

        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1; // Initially empty
        }

        void push(int value) {

            if (top == size - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            top++;
            arr[top] = value;
        }

        int pop() {

            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return arr[top--];
        }

        int peek() {
            if (top == -1)
                return -1;
            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());
    }
}