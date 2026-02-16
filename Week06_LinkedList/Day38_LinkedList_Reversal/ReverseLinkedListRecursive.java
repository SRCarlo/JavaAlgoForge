/**
 * Question: Reverse a Linked List (Recursive)
 *
 * Example:
 * Input  : 1 -> 2 -> 3 -> 4 -> null
 * Output : 4 -> 3 -> 2 -> 1 -> null
 *
 * Algo:
 * - Recursively reverse the remaining list
 * - Fix the link of current node
 *
 * Explanation:
 * reverse(1->2->3->4)
 * reverse(2->3->4)
 * reverse(3->4)
 * reverse(4) → base case
 *
 * Then links are reversed while returning back.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */
package Week01_Basics_Logic.Week06_LinkedList.Day38_LinkedList_Reversal;

public class ReverseLinkedListRecursive {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverse(head);

        System.out.print("Reversed List (Recursive): ");
        printList(head);
    }

    // Recursive function to reverse list
    static Node reverse(Node head) {

        // Base case: last node or empty list
        if (head == null || head.next == null)
            return head;

        // Reverse rest of list
        Node newHead = reverse(head.next);

        // Fix link: next node points back to current node
        head.next.next = head;

        // Break old link
        head.next = null;

        return newHead;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}