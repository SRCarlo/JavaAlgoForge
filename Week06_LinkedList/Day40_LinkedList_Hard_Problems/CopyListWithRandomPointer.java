/**
 * Question: Copy Linked List with Random Pointer
 *
 * Example:
 * Node1 -> Node2
 * Random pointers can point anywhere
 *
 * Algo:
 * - Use HashMap to store old node -> new node mapping
 * - Copy next and random pointers correctly
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day40_LinkedList_Hard_Problems;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    static class Node {
        int data;
        Node next, random;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);

        // Random links
        head.random = head.next;
        head.next.random = head;

        Node copied = copyRandomList(head);

        System.out.println("Copied List Created Successfully!");
    }

    static Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        // Step 1: Create copy nodes
        while (temp != null) {
            map.put(temp, new Node(temp.data));
            temp = temp.next;
        }

        temp = head;

        // Step 2: Assign next and random pointers
        while (temp != null) {

            Node copyNode = map.get(temp);

            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}
