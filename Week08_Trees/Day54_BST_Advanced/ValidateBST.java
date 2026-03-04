/*
 * Problem Name: Validate Binary Search Tree
 *
 * input:
 *            5
 *           / \
 *          3   7
 *         / \   \
 *        2   4   8
 *
 * output:
 * Is Valid BST: true
 *
 * Example:
 * - Left subtree values < root
 * - Right subtree values > root
 * - Must satisfy range condition for every node
 *
 * Approach:
 * - Pass valid min and max range to each node
 * - Left subtree: (min, root.data)
 * - Right subtree: (root.data, max)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day54_BST_Advanced;

public class ValidateBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isValid(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isValid(root.left, min, root.data) &&
                isValid(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(8);

        System.out.println("Is it Valid BST : " +
                isValid(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
