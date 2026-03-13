/*
 * Problem Name: Floor and Ceil in BST
 *
 * input:
 * Insert values: 10, 5, 15, 3, 7, 18
 * key = 8
 *
 * output:
 * Floor = 7
 * Ceil = 10
 *
 * Example:
 *
 *        10
 *       /  \
 *      5    15
 *     / \     \
 *    3   7    18
 *
 * Floor = largest value ≤ key
 * Ceil = smallest value ≥ key
 *
 * Approach:
 * 1. Traverse BST.
 * 2. If node == key → both floor and ceil.
 * 3. If node < key → update floor and move right.
 * 4. If node > key → update ceil and move left.
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week09_BST.Day63_BST_Revision;

public class FloorAndCeilBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    public static void main(String[] args) {

        int[] values = { 10, 5, 15, 3, 7, 18 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        int key = 8;

        Integer floor = null;
        Integer ceil = null;

        Node curr = root;

        while (curr != null) {

            if (curr.data == key) {
                floor = ceil = curr.data;
                break;
            }

            if (curr.data < key) {
                floor = curr.data;
                curr = curr.right;
            } else {
                ceil = curr.data;
                curr = curr.left;
            }
        }

        System.out.println("Floor is : " + floor);
        System.out.println("Ceil is : " + ceil);
    }
}
