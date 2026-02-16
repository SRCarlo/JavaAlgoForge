/**
 * Question: Check if Linked List is Palindrome
 *
 * Example:
 * Input  : 1 -> 2 -> 2 -> 1
 * Output : true
 *
 * Algo:
 * Step 1: Find middle node
 * Step 2: Reverse second half
 * Step 3: Compare both halves
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day38_LinkedList_Reversal;

public class PalindromeLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is Palindrome? " + isPalindrome(head));
    }

    static boolean isPalindrome(Node head) {

        if (head == null)
            return true;

        // Step 1: Find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare first and second half
        Node first = head;
        Node second = secondHalf;

        while (second != null) {

            if (first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }

    // Reverse helper
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}
