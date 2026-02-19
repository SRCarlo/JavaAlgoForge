/**
 * Question: Split Circular Linked List into Two Halves
 *
 * Example:
 * Input: 1 -> 2 -> 3 -> 4 -> 5 (circular)
 *
 * Output:
 * First Half : 1 -> 2 -> 3
 * Second Half: 4 -> 5
 *
 * Algo:
 * - Use slow and fast pointers
 * - Slow reaches middle
 * - Break into two circular lists
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day41_DoublyCircularLinkedList;

public class SplitCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Make circular
        head.next.next.next.next.next = head;

        splitList(head);
    }

    static void splitList(Node head) {

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        // Break into two circular lists
        slow.next = head1;

        Node temp = head2;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head2;

        System.out.println("First Half:");
        printCircular(head1);

        System.out.println("Second Half:");
        printCircular(head2);
    }

    static void printCircular(Node head) {

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back)");
    }
}
