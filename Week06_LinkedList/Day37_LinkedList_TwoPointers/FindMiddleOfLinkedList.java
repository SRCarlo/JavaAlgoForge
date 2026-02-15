/*
 Question: Find Middle of Linked List

 Example:
 Input  : 10 -> 20 -> 30 -> 40 -> 50
 Output : Middle = 30

 Algo:
 - Use slow and fast pointers
 - slow moves 1 step
 - fast moves 2 steps
 - When fast reaches end, slow is at middle

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day37_LinkedList_TwoPointers;

public class FindMiddleOfLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Linked List : 10 -> 20 -> 30 -> 40 -> 50
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node slow = head;
        Node fast = head;

        // Move slow by 1 and fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node is : " + slow.data);
    }

}
