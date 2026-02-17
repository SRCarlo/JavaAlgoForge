/**
 * Question: Find Intersection Point of Two Linked Lists
 *
 * Example:
 * ListA: 1 -> 2 -> 3 \
 *                  -> 6 -> 7
 * ListB:      4 -> 5 /
 *
 * Output: Node with value 6
 *
 * Algo:
 * - Use two pointers
 * - When pointer reaches end, switch to other list
 * - They meet at intersection node
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day39_LinkedList_Sorting_Merge;

public class IntersectionOfTwoLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Common part: 6 -> 7
        Node common = new Node(6);
        common.next = new Node(7);

        // ListA: 1 -> 2 -> 3 -> 6 -> 7
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = common;

        // ListB: 4 -> 5 -> 6 -> 7
        Node b = new Node(4);
        b.next = new Node(5);
        b.next.next = common;

        Node intersection = getIntersection(a, b);

        System.out.println("Intersection Node: " + intersection.data);

    }

    static Node getIntersection(Node headA, Node headB) {

        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }
}
