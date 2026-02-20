/**
 * Question: Remove Duplicates from Sorted Linked List
 *
 * Example:
 * 1 -> 1 -> 2 -> 3 -> 3
 * Output:
 * 1 -> 2 -> 3
 *
 * ALGORITHM:
 * - Traverse list
 * - If current.data == current.next.data
 *   skip next node
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day42_LinkedList_Revision;

public class RemoveDuplicatesSortedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        head = removeDuplicates(head);

        System.out.print("After Removing Duplicates : ");
        printList(head);
    }

    static Node removeDuplicates(Node head) {

        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next; // Skip Duplicate
            } else {
                curr = curr.next;
            }
        }
        return head;
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
