/*
 Question: Create and Print a Linked List

 Example:
 Input  : 10 -> 20 -> 30
 Output : Linked List: 10 20 30

 Explanation:
 - A Linked List is made of nodes
 - Each node has:
   value + next pointer

 Time Complexity: O(n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week06_LinkedList.Day36_LinkedList_Basics;

public class CreateAndPrintLinkedList {

    // Node class (basic building block)
    static class Node {
        int data; // value stored
        Node next; // pointer to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Creating nodes manually
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Print linked list
        System.out.print("Linked List  : ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
