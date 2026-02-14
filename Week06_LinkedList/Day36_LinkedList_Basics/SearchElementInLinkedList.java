/*
 Question: Search an Element in Linked List

 Example:
 Input  : 5 -> 10 -> 15 -> 20
 Search : 15
 Output : Found at position 3

 Algo:
 - Traverse list
 - Compare each node value
 - If match → return position

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day36_LinkedList_Basics;

public class SearchElementInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List : 5 -> 10 -> 15 -> 20
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        int target = 15;

        Node temp = head;
        int position = 1;
        boolean found = false;

        while (temp != null) {

            if (temp.data == target) {
                System.out.println("Element found at position : " + position);
                found = true;
                break;
            }

            temp = temp.next;
            position++;
        }

        if (!found) {
            System.out.println("Element not Found.");
        }
    }
}
