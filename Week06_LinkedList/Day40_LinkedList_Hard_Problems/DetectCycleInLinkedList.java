/**
 * Question: Detect Cycle in Linked List
 *
 * Example:
 * 1 -> 2 -> 3 -> 4 -> 2 (cycle)
 *
 * Output: true
 *
 * Algo (Floyd Cycle Detection):
 * - Use slow pointer (1 step)
 * - Use fast pointer (2 steps)
 * - If they meet → cycle exists
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day40_LinkedList_Hard_Problems;

public class DetectCycleInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: 4 -> 2
        fourth.next = second;

        System.out.println("Cycle Exists? " + hasCycle(head));
    }

    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next; // Move 1 step
            fast = fast.next.next; // Move 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
