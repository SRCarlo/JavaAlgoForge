/*
 Question: Insert a Node at the Head (Beginning)

 Example:
 Before: 20 -> 30
 Insert: 10
 After : 10 -> 20 -> 30

 Algo:
 - Create new node
 - Point newNode.next to current head
 - Update head = newNode

 Time Complexity: O(1)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day36_LinkedList_Basics;

public class InsertAtHead {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Initial list: 20 -> 30
        Node head = new Node(20);
        head.next = new Node(30);

        int newValue = 10;

        // Insert at head
        Node newNode = new Node(newValue);
        newNode.next = head;
        head = newNode;

        // Print result
        System.out.print("After Insert at Head: ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}