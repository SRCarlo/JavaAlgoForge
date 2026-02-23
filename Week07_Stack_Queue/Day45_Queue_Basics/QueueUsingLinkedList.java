/**
 * Question:
 * Implement Queue using Linked List
 *
 * Advantage:
 * No fixed size limitation
 *
 * Time Complexity:
 * Enqueue → O(1)
 * Dequeue → O(1)
 */
package Week01_Basics_Logic.Week07_Stack_Queue.Day45_Queue_Basics;

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Queue {

        Node front, rear;

        void enqueue(int value) {

            Node newNode = new Node(value);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        int dequeue() {

            if (front == null) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int value = front.data;
            front = front.next;

            if (front == null)
                rear = null;

            return value;
        }

        int peek() {
            if (front == null)
                return -1;
            return front.data;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);

        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Peek: " + q.peek());
    }
}