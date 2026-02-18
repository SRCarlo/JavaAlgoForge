/**
 * Question: Remove Nth Node From End of Linked List
 *
 * Example:
 * Input : 1 -> 2 -> 3 -> 4 -> 5, n = 2
 * Output: 1 -> 2 -> 3 -> 5
 *
 * Algo:
 * - Use two pointers (fast and slow)
 * - Move fast pointer n steps ahead
 * - Then move both until fast reaches end
 * - Slow will be just before the node to remove
 *
 * Dry Run:
 * fast moves 2 steps → at node 3
 * move both → slow stops at node 3
 * remove node 4
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day40_LinkedList_Hard_Problems;

public class RemoveNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Linked List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.print("Updated List: ");
        printList(head);
    }

    static Node removeNthFromEnd(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Step 1: Move fast pointer n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // Step 2: Move both pointers together
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3: Remove the node
        slow.next = slow.next.next;

        return dummy.next;
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
