/*
 * Question: Reverse Nodes in K Group
 *
 * Example:
 * Input  : 1 -> 2 -> 3 -> 4 -> 5, k = 2
 * Output : 2 -> 1 -> 4 -> 3 -> 5
 *
 * Explanation:
 * Reverse every group of 2 nodes.
 *
 * Algo:
 * - Reverse first k nodes
 * - Recursively reverse remaining nodes
 * - Connect both parts
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) recursion
 */

package Week01_Basics_Logic.Week06_LinkedList.Day38_LinkedList_Reversal;

public class ReverseKGroup {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        head = reverseK(head, k);

        System.out.print("Reverse in K Group: ");
        printList(head);
    }

    static Node reverseK(Node head, int k) {

        Node prev = null;
        Node curr = head;
        Node next = null;

        int count = 0;

        // Reverse first k nodes
        while (curr != null && count < k) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

            count++;
        }

        // Recursively reverse remaining list
        if (next != null) {
            head.next = reverseK(next, k);
        }

        // prev is new head of this group
        return prev;
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
