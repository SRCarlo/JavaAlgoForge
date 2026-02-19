
/**
 * Question: Implement Circular Linked List Basics
 *
 * Example:
 * Insert: 1,2,3
 *
 * Output:
 * 1 -> 2 -> 3 -> (back to head)
 *
 * Algo:
 * - Last node points back to head
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day41_DoublyCircularLinkedList;

public class CircularLinkedListBasics {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);

        System.out.println("Circular Linked List:");
        printCircular(head);
    }

    // Insert at end in circular list
    static Node insert(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode; // Points to itself
            return newNode;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

        return head;
    }

    // Print circular list (limited)
    static void printCircular(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}
