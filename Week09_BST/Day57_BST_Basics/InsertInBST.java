/*
 * Problem Name: Insert Node in Binary Search Tree
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 *
 * output:
 * Inorder Traversal: 20 30 40 50 60 70 80
 *
 * Example:
 * Input Tree:
 *        50
 *       /  \
 *     30    70
 *
 * Insert 40
 *
 * Output Tree:
 *        50
 *       /  \
 *     30    70
 *       \
 *        40
 *
 * Approach:
 * 1. If root is null create new node.
 * 2. If value < root.data → insert in left subtree.
 * 3. If value > root.data → insert in right subtree.
 * 4. Return root after insertion.
 *
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day57_BST_Basics;

public class InsertInBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    public static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
    }
}
