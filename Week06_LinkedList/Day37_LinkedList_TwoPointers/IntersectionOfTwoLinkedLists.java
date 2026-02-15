/*
 Question: Intersection Point of Two Linked Lists

 Example:
 List1: 1 -> 2 -> 3
                  \
                   6 -> 7
                  /
 List2:      4 -> 5

 Output: Intersection Node = 6

 Algo:
 - Use two pointers
 - When pointer reaches end, switch to other list
 - They meet at intersection

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day37_LinkedList_TwoPointers;

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

        // List1: 1 -> 2 -> 3 -> 6 -> 7
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = common;

        // List2: 4 -> 5 -> 6 -> 7
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = common;

        Node p1 = head1;
        Node p2 = head2;

        // Two pointer switching technique
        while (p1 != p2) {
            p1 = (p1 == null) ? head2 : p1.next;
            p2 = (p2 == null) ? head1 : p2.next;
        }

        System.out.println("Intersection Node is: " + p1.data);
    }
}