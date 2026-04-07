/*
 * Problem Name: Reverse Linked List
 *
 * input:
 * 1 -> 2 -> 3 -> 4 -> 5
 *
 * output:
 * 5 -> 4 -> 3 -> 2 -> 1
 *
 * Example:
 *
 * reverse direction of pointers
 *
 * Approach:
 *
 * keep 3 pointers
 *
 * prev
 * curr
 * next
 *
 * reverse links step by step
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day88_LinkedList_Stack_Queue;

public class ReverseLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);

        head.next.next = new Node(3);

        head.next.next.next = new Node(4);

        head.next.next.next.next = new Node(5);

        Node prev = null;

        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        while (prev != null) {

            System.out.print(prev.data + " ");

            prev = prev.next;
        }
    }
}