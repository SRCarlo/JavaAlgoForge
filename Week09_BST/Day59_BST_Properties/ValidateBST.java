/*
 * Problem Name: Validate Binary Search Tree
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 *
 * output:
 * Valid BST
 *
 * Example:
 *
 *        50
 *       /  \
 *     30    70
 *    / \   / \
 *   20 40 60 80
 *
 * Check if tree satisfies BST property:
 * Left subtree < Root < Right subtree
 *
 * Output: Valid BST
 *
 * Approach:
 * 1. Each node must satisfy a range (min, max).
 * 2. Left subtree values must be less than root.
 * 3. Right subtree values must be greater than root.
 * 4. Recursively validate each node with updated range.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
package Week01_Basics_Logic.Week09_BST.Day59_BST_Properties;

public class ValidateBST {

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

    static boolean isValidBST(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isValidBST(root.left, min, root.data) &&
                isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        if (isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Invalid BST");
    }
}