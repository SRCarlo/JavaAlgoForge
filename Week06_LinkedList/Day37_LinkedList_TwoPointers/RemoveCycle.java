/*
 Question: Remove Cycle from Linked List

 Example:
 Input  : 1 -> 2 -> 3 -> 4 -> 5 -> back to 3
 Output : Cycle Removed

 Algo:
 Step 1: Detect cycle using Floyd
 Step 2: Move one pointer to head
 Step 3: Move both pointers 1 step
 Step 4: Meeting point is start of cycle
 Step 5: Break the cycle

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day37_LinkedList_TwoPointers;

public class RemoveCycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        boolean cycleFound = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleFound = true;
                break;
            }
        }

        if (!cycleFound) {
            System.out.println("No cycle present.");
            return;
        }

        // Step 2: Find start of cycle
        slow = head;

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        fast.next = null;

        System.out.println("Cycle Removed Successfully!");
    }
}
