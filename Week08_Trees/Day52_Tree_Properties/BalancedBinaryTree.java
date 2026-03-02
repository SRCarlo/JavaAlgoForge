/*
 * Problem Name: Check if Binary Tree is Balanced
 *
 * input:
 *          1
 *         /
 *        2
 *       /
 *      3
 *
 * output:
 * Is Balanced: false
 *
 * Example:
 * - Height of left subtree = 2
 * - Height of right subtree = 0
 * - Difference = 2 (> 1)
 * - So tree is NOT balanced
 *
 * Balanced Condition:
 * - For every node:
 *   |leftHeight - rightHeight| <= 1
 *
 * Approach:
 * - Use post-order traversal
 * - If any subtree is unbalanced → return -1
 * - If difference > 1 → return -1
 * - Otherwise return height
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day52_Tree_Properties;

public class BalancedBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int checkHeight(Node root) {

        if (root == null)
            return 0;

        int left = checkHeight(root.left);
        if (left == -1)
            return -1;

        int right = checkHeight(root.right);
        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }

    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);

        System.out.println(" Given Node is Balanced : " + isBalanced(root));
    }
}
