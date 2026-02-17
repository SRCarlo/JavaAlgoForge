/**
 * Question: Sort a Linked List
 *
 * Example:
 * Input: 4 -> 2 -> 1 -> 3
 * Output: 1 -> 2 -> 3 -> 4
 *
 * Algo:
 * - Copy values into array
 * - Sort array
 * - Put values back into list
 *
 * Note:
 * This is beginner-friendly.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day39_LinkedList_Sorting_Merge;

import java.util.*;

public class SortLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        head = sortList(head);

        System.out.print("Sorted List: ");
        printList(head);
    }

    static Node sortList(Node head) {

        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Store values
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        // Step 2: Sort values
        Collections.sort(list);

        // Step 3: Put values back
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = list.get(i++);
            temp = temp.next;
        }

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
