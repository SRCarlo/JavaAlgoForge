/**
 * Question: Merge K Sorted Linked Lists
 *
 * Example:
 * List1: 1 -> 4
 * List2: 2 -> 5
 * List3: 3 -> 6
 *
 * Output:
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 *
 * Algo (Simple for Beginners):
 * - Merge lists one by one
 * - First merge list1 & list2
 * - Then merge result with list3
 *
 * Time Complexity: O(k * n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day39_LinkedList_Sorting_Merge;

public class MergeKSortedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List1: 1 -> 4
        Node l1 = new Node(1);
        l1.next = new Node(4);

        // List2: 2 -> 5
        Node l2 = new Node(2);
        l2.next = new Node(5);

        // List3: 3 -> 6
        Node l3 = new Node(3);
        l3.next = new Node(6);

        Node[] lists = { l1, l2, l3 };

        Node result = mergeKLists(lists);

        System.out.print("Merged K Lists: ");
        printList(result);
    }

    static Node mergeKLists(Node[] lists) {

        Node result = null;

        for (Node list : lists) {
            result = mergeTwo(result, list);
        }

        return result;
    }

    // Merge Two Sorted Lists Helper
    static Node mergeTwo(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null)
            tail.next = a;
        if (b != null)
            tail.next = b;

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
