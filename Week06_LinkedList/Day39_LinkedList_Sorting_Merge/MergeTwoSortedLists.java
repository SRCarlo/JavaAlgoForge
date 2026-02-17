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
 * Algo:
 * - Use a dummy node
 * - Compare both list nodes
 * - Attach smaller one to result
 *
 * Dry Run:
 * Compare 1 & 2 → take 1
 * Compare 3 & 2 → take 2
 * Compare 3 & 4 → take 3 ...
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day39_LinkedList_Sorting_Merge;

public class MergeTwoSortedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List1: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // List2: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node merged = merge(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }

    static Node merge(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        // Merge while both lists have nodes
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

        // Attach remaining nodes
        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;

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

/*
 * If we remove the print (null), Use that code
 * 
 * 
 * while (head != null) {
 * System.out.print(head.data);
 * 
 * if (head.next != null)
 * System.out.print(" -> ");
 * 
 * head = head.next;
 * }
 * 
 * 
 * Note -->
 * 
 *  Printing null is common because:
 *      1.It clearly shows list termination
 *      2.It avoids misunderstanding
 */
