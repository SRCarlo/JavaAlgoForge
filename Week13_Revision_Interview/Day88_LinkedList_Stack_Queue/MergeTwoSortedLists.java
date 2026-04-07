/*
 * Problem Name: Merge Two Sorted Linked Lists
 *
 * input:
 * list1 = 1 -> 3 -> 5
 * list2 = 2 -> 4 -> 6
 *
 * output:
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 *
 * Example:
 *
 * choose smaller value each step
 *
 * Approach:
 *
 * compare nodes
 *
 * attach smaller node
 *
 * move pointer
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day88_LinkedList_Stack_Queue;

public class MergeTwoSortedLists {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {

        Node l1 = new Node(1);

        l1.next = new Node(3);

        l1.next.next = new Node(5);

        Node l2 = new Node(2);

        l2.next = new Node(4);

        l2.next.next = new Node(6);

        Node dummy = new Node(0);

        Node curr = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data < l2.data) {

                curr.next = l1;

                l1 = l1.next;

            } else {

                curr.next = l2;

                l2 = l2.next;
            }

            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;

        Node temp = dummy.next;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }
}