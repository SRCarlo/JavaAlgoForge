/**
 * Question: Merge Two Sorted Linked Lists
 *
 * Example:
 * List1: 1 -> 3 -> 5
 * List2: 2 -> 4 -> 6
 *
 * Output:
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 *
 * ALGORITHM:
 * - Use dummy node
 * - Compare nodes and attach smaller one
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day42_LinkedList_Revision;

public class MergeTwoSortedLists {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node merged = merge(l1, l2);

        System.out.print("Merged List is : ");
        printList(merged);
    }

    static Node merge(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        // Attach Remaining Nodes
        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;

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
