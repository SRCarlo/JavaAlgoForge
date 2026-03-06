/*
 * Problem Name: Check Balanced Binary Tree
 *
 * input:
 *        1
 *       / \
 *      2   3
 *     /
 *    4
 *
 * output:
 * true
 *
 * Explanation:
 * A binary tree is balanced if the height difference
 * between left and right subtree is not more than 1.
 *
 * Approach:
 * 1. Calculate height of left subtree
 * 2. Calculate height of right subtree
 * 3. Check difference <= 1
 * 4. Recursively check for subtrees
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day56_Tree_Rivision;

public class CheckBalancedBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static int height(Node root) {

        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }

    public static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Balanced : " + isBalanced(root));
    }
}
