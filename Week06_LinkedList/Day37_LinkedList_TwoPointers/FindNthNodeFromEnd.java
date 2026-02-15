/*
 Question: Find Nth Node from End

 Example:
 Input  : 10 -> 20 -> 30 -> 40 -> 50, n = 2
 Output : 40

 Algo:
 - Move fast pointer n steps ahead
 - Move slow and fast together
 - When fast reaches end, slow is nth from end

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day37_LinkedList_TwoPointers;

public class FindNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List: 10 -> 20 -> 30 -> 40 -> 50
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;

        Node slow = head;
        Node fast = head;

        // Move fast n steps
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(n + "th node from end is: " + slow.data);
    }
}
