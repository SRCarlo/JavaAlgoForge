
/**
 * Question: Reverse a Linked List (Iterative)
 *
 * Example:
 * Input  : 10 -> 20 -> 30 -> 40 -> null
 * Output : 40 -> 30 -> 20 -> 10 -> null
 *
 * Algo:
 * - We reverse the direction of links
 * - Use 3 pointers:
 *   prev = null
 *   curr = head
 *   next = store curr.next
 *
 * Dry Run:
 * curr=10 → reverse link → 10 points to null
 * curr=20 → reverse link → 20 points to 10
 * curr=30 → reverse link → 30 points to 20
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day38_LinkedList_Reversal;

public class ReverseLinkedListIterative {

        // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Creating Linked List: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Step 1: Initialize pointers
        Node prev = null;   // Previous node (starts as null)
        Node curr = head;   // Current node (starts at head)

        // Step 2: Reverse the links one by one
        while (curr != null) {

            Node next = curr.next; // Save next node before breaking link

            curr.next = prev;      // Reverse current node link

            prev = curr;           // Move prev forward
            curr = next;           // Move curr forward
        }

        // Step 3: prev becomes the new head
        head = prev;

        System.out.print("Reversed Linked List: ");
        printList(head);
    }

    // Utility function to print linked list
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}