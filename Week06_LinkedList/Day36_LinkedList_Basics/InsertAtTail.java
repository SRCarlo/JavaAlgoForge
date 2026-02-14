/*
 Question: Insert a Node at the Tail (End)

 Example:
 Before: 10 -> 20
 Insert: 30
 After : 10 -> 20 -> 30

 Algo:
 - Traverse till last node
 - Last.next = newNode

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day36_LinkedList_Basics;

public class InsertAtTail {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Initial list : 10 -> 20
        Node head = new Node(10);
        head.next = new Node(20);

        int newValue = 30;

        Node newNode = new Node(newValue);

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert at tail
        temp.next = newNode;

        // Print list
        System.out.print("After Insert at Tail : ");
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
