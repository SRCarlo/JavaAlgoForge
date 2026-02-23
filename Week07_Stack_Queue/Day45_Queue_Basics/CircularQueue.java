/**
 * Question:
 * Implement Circular Queue
 *
 * Why?
 * Normal queue wastes space after dequeue.
 *
 * Circular Queue reuses empty space.
 *
 * Key Formula:
 * rear = (rear + 1) % size
 * front = (front + 1) % size
 *
 * Time Complexity: O(1)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day45_Queue_Basics;

public class CircularQueue {

    static class Queue {

        int[] arr;
        int front, rear, size;
        int count;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
            count = 0;
        }

        void enqueue(int value) {

            if (count == size) {
                System.out.println("Queue Full");
                return;
            }

            rear = (rear + 1) % size;
            arr[rear] = value;
            count++;
        }

        int dequeue() {

            if (count == 0) {
                System.out.println("Queue Empty");
                return -1;
            }

            int value = arr[front];
            front = (front + 1) % size;
            count--;

            return value;
        }

        int peek() {
            if (count == 0)
                return -1;
            return arr[front];
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeue: " + q.dequeue());

        q.enqueue(40); // Reuses space

        System.out.println("Peek: " + q.peek());
    }
}
