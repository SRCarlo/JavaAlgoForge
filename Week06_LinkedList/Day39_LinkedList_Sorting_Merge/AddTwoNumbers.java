/**
 * Question: Add Two Numbers Represented by Linked Lists
 *
 * Example:
 * List1: 2 -> 4 -> 3   (342)
 * List2: 5 -> 6 -> 4   (465)
 *
 * Output: 7 -> 0 -> 8  (807)
 *
 * Algo:
 * - Add digit by digit
 * - Maintain carry
 *
 * Dry Run:
 * 2+5=7 carry0
 * 4+6=10 carry1
 * 3+4+1=8 carry0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day39_LinkedList_Sorting_Merge;

public class AddTwoNumbers {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // 342 = 2 -> 4 -> 3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // 465 = 5 -> 6 -> 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node sum = addNumbers(l1, l2);

        System.out.print("Sum List: ");
        printList(sum);
    }

    static Node addNumbers(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            tail.next = new Node(sum % 10);
            tail = tail.next;
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
