/**
 * Question: Reverse a Linked List
 *
 * Example:
 * 1 -> 2 -> 3 -> 4
 * Output:
 * 4 -> 3 -> 2 -> 1
 *
 * ALGORITHM:
 * 1. Use three pointers:
 *    prev = null
 *    curr = head
 *    next = null
 * 2. Reverse links one by one
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day42_LinkedList_Revision;

public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Creating Linked List : 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverse(head);

        System.out.print("Reversed List : ");
        printList(head);
    }

    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next; // Save next node
            curr.next = prev; // Reverse link
            prev = curr; // Move prev
            curr = next; // Move curr
        }
        return prev; // New Head
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }
    }

}
