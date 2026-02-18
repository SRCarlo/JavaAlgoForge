/**
 * Question: Find Starting Point of Cycle in Linked List
 *
 * Example:
 * 1 -> 2 -> 3 -> 4 -> 2...
 *
 * Output: Node with value 2
 *
 * Algo:
 * - First detect cycle using Floyd method
 * - If cycle found:
 *   Move one pointer to head
 *   Move both one step
 *   Meeting point = cycle start
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day40_LinkedList_Hard_Problems;

public class StartingPointOfCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: 4 -> 2
        fourth.next = second;

        Node start = detectCycleStart(head);

        System.out.println("Cycle Starts At Node: " + start.data);
    }

    static Node detectCycleStart(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find start point
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}