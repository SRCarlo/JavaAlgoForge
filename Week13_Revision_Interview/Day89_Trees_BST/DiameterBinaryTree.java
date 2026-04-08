/*
 * Problem Name: Diameter of Binary Tree
 *
 * input:
 *         1
 *       /   \
 *      2     3
 *     / \
 *    4   5
 *
 * output:
 * 3
 *
 * Example:
 * longest path between nodes
 *
 * 4 -> 2 -> 1 -> 3
 *
 * edges = 3
 *
 * Approach:
 *
 * height of left subtree
 * height of right subtree
 *
 * diameter = left + right
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day89_Trees_BST;

public class DiameterBinaryTree {

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static int diameter = 0;

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);

        height(root);

        System.out.println(diameter);
    }

    static int height(Node root) {

        if (root == null)
            return 0;

        int left = height(root.left);

        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}