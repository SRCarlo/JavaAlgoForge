/**
 * Question: Implement Doubly Linked List Insert and Delete
 *
 * Example:
 * Insert: 10, 20, 30
 * Delete: 20
 *
 * Output:
 * 10 <-> 30 <-> null
 *
 * Algo:
 * - Each node has:
 *   prev pointer (backward)
 *   next pointer (forward)
 *
 * Time Complexity:
 * Insert/Delete: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day41_DoublyCircularLinkedList;

public class DoublyLinkedListInsertDelete {
    // Node structure for Doubly Linked List
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = null;

        // Insert nodes
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        System.out.print("Doubly Linked List: ");
        printList(head);

        // Delete node with value 20
        head = deleteNode(head, 20);

        System.out.print("After Deletion: ");
        printList(head);
    }

    // Insert node at end
    static Node insertAtEnd(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Delete a node by value
    static Node deleteNode(Node head, int value) {

        if (head == null)
            return null;

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null)
            return head; // Not found

        // If node is head
        if (temp == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
        }

        // If node is middle or last
        else {
            temp.prev.next = temp.next;

            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        }

        return head;
    }

    // Print DLL
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}