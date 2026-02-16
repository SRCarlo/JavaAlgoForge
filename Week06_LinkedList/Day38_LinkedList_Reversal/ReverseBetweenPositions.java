/**
 * Question: Reverse Linked List Between Two Positions
 *
 * Example:
 * Input  : 1 -> 2 -> 3 -> 4 -> 5
 * Reverse between left=2 and right=4
 *
 * Output : 1 -> 4 -> 3 -> 2 -> 5
 *
 * Algo:
 * - Reach node before left
 * - Reverse sublist using insertion method
 * - Reconnect list
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day38_LinkedList_Reversal;

public class ReverseBetweenPositions {
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

        System.out.print("After Reverse Between: ");
        printList(head);
    }

    static Node reverseBetween(Node head, int left, int right) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        // Move prev to node before left
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;

        // Reverse sublist
        for (int i = 0; i < right - left; i++) {

            Node temp = curr.next;
            curr.next = temp.next;

            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;
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
