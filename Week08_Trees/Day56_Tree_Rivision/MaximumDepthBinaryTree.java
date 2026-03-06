/*
 * Problem Name: Maximum Depth of Binary Tree
 *
 * input:
 *        1
 *       / \
 *      2   3
 *     /
 *    4
 *
 * output:
 * Depth: 3
 *
 * Explanation:
 * Maximum depth is the longest path from root to leaf node.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day56_Tree_Rivision;

public class MaximumDepthBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static int maxDepth(Node root) {

        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Maximum Depth is : " + maxDepth(root));
    }
}
