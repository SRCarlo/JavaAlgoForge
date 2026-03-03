/*
 * Problem Name: Insert Node in Binary Search Tree
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 *
 * BST Structure:
 *            50
 *           /  \
 *         30    70
 *        / \    / \
 *      20  40  60  80
 *
 * output (Inorder Traversal):
 * 20 30 40 50 60 70 80
 *
 * Example:
 * - If value < root → go left
 * - If value > root → go right
 * - Insert at null position
 *
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day53_BinarySearchTree_Basics;

public class InsertInBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

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

        for (int val : values)
            root = insert(root, val);

        System.out.print("Inorder Traversal : ");
        inorder(root);
    }
}
