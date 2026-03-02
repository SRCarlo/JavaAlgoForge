/*
 * Problem Name: Diameter of Binary Tree
 *
 * input:
 *          1
 *         / \
 *        2   3
 *       / \
 *      4   5
 *
 * output:
 * Diameter of Tree: 3
 *
 * Example:
 * - Longest path is:
 *   4 → 2 → 5
 * - Number of edges in path = 3
 *
 * Approach:
 * - For each node:
 *      Find left subtree height
 *      Find right subtree height
 * - Possible diameter = leftHeight + rightHeight
 * - Track maximum diameter
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day52_Tree_Properties;

public class DiameterOfTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int diameter = 0;

    public static int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    public static int findDiameter(Node root) {
        height(root);
        return diameter;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of Tree: " + findDiameter(root));
    }
}
