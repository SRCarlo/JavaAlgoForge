/**
 * Question: Find Middle of Linked List
 *
 * Example:
 * 1 -> 2 -> 3 -> 4 -> 5
 * Output: 3
 *
 * ALGORITHM (Slow & Fast Pointer):
 * - slow moves 1 step
 * - fast moves 2 steps
 * - When fast reaches end, slow is at middle
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day42_LinkedList_Revision;

public class MiddleOfLinkedList {

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

        Node middle = findMiddle(head);

        System.out.println("Middle Node is : " + middle.data);
    }

    static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next; // 1 Step
            fast = fast.next.next; // 2 Step
        }
        return slow;
    }
}