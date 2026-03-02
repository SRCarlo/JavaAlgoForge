/*
 * Problem Name: Height of Binary Tree
 *
 * input:
 *          1
 *         / \
 *        2   3
 *       /
 *      4
 *
 * output:
 * Height of Tree: 3
 *
 * Example:
 * - Longest path from root to leaf is:
 *   1 → 2 → 4
 * - Number of nodes in this path = 3
 * - So height = 3
 *
 * Approach:
 * - If node is null → return 0
 * - Recursively find height of left subtree
 * - Recursively find height of right subtree
 * - Height = 1 + max(leftHeight, rightHeight)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day52_Tree_Properties;

public class HeightOfTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);

        System.out.println("Height of Tree : " + height(root));
    }
}
