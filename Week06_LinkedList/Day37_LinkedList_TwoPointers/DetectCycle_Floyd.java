/*
 Question: Detect Cycle in Linked List (Floyd Cycle Detection)

 Example:
 Input  : 1 -> 2 -> 3 -> 4 -> 5 -> back to 3
 Output : Cycle Detected

 Algo:
 - Use slow and fast pointers
 - slow moves 1 step
 - fast moves 2 steps
 - If cycle exists → they will meet

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day37_LinkedList_TwoPointers;

public class DetectCycle_Floyd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Create List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        Node slow = head;
        Node fast = head;

        boolean cycleFound = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleFound = true;
                break;
            }
        }

        if (cycleFound)
            System.out.println("Cycle Detected!");
        else
            System.out.println("No Cycle Found.");
    }
}
