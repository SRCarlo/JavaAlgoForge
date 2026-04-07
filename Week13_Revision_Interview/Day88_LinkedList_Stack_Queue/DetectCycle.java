/*
 * Problem Name: Detect Cycle in Linked List
 *
 * input:
 * 1 -> 2 -> 3 -> 4 -> 5
 *           ^         |
 *           |_________|
 *
 * output:
 * true
 *
 * Example:
 *
 * loop exists
 *
 * Approach:
 *
 * slow pointer moves 1 step
 * fast pointer moves 2 steps
 *
 * if they meet → cycle exists
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day88_LinkedList_Stack_Queue;

public class DetectCycle {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);

        head.next.next = new Node(3);

        head.next.next.next = new Node(4);

        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = head.next.next; // cycle

        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast) {

                cycle = true;
                break;
            }
        }

        System.out.println(cycle);
    }
}