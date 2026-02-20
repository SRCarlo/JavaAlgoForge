/*
 * Question: Check if Linked List is Palindrome
 *
 * Example:
 * 1 -> 2 -> 2 -> 1
 * Output: true
 *
 * ALGORITHM:
 * 1. Find middle
 * 2. Reverse second half
 * 3. Compare both halves
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day42_LinkedList_Revision;

public class CheckPalindromeLinkedList {

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
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Given List Is Palindrome ? " + isPalindrome(head));
    }

    static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        // Step 1 : Find Middle
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2 : Reverse Second Half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3 : Comapara
        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.next;

        }

        return true;
    }

}
