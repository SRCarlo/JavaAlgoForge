package Week01_Basics_Logic.Week06_LinkedList.Day36_LinkedList_Basics;

public class DeleteNodeByValue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // List : 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int target = 30;

        // Case 1 : Delete head
        if (head.data == target) {
            head = head.next;
        } else {
            Node temp = head;

            // Find node before target
            while (temp.next != null && temp.next.data != target) {
                temp = temp.next;
            }

            // If found, delete
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        // Print list after deletion
        System.out.print("After Deletion: ");
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

}
