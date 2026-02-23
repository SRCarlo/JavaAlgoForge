/**
 * Question:
 * Implement Queue using Array.
 *
 * Queue follows FIFO (First In First Out).
 *
 * Example:
 * enqueue(10)
 * enqueue(20)
 * dequeue() → 10
 *
 * Algorithm:
 * - Maintain front and rear pointers
 * - Enqueue → increase rear
 * - Dequeue → increase front
 *
 * Time Complexity:
 * Enqueue → O(1)
 * Dequeue → O(1)
 *
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day45_Queue_Basics;

public class QueueUsingArray {

    static class Queue {

        int[] arr;
        int front, rear, size;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        void enqueue(int value) {

            if (rear == size - 1) {
                System.out.println("Queue Overflow.");
                return;
            }

            arr[++rear] = value;
        }

        int dequeue() {

            if (front > rear) {
                System.out.println("Queue Underflow.");
                return -1;
            }
            return arr[front++];
        }

        int peek() {
            if (front > rear)
                return -1;
            return arr[front];
        }

        boolean isEmpty() {
            return front > rear;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeue : " + q.dequeue());
        System.out.println("Peek : " + q.peek());

    }

}
