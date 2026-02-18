/**
 * Question: Reverse Linked List Between Positions m and n
 *
 * Example:
 * Input : 1 -> 2 -> 3 -> 4 -> 5, m=2, n=4
 * Output: 1 -> 4 -> 3 -> 2 -> 5
 *
 * Algo:
 * - Skip first (m-1) nodes
 * - Reverse next (n-m+1) nodes
 * - Connect back to list
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day40_LinkedList_Hard_Problems;

public class ReverseLinkedListII {
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

        head = reverseBetween(head, 2, 4);

        System.out.print("Reversed List: ");
        printList(head);
    }

    static Node reverseBetween(Node head, int m, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        // Step 1: Move prev to node before m
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;

        // Step 2: Reverse between m and n
        for (int i = 0; i < n - m; i++) {

            Node temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
