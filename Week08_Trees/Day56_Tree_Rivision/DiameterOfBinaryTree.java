/*
 * Problem Name: Diameter of Binary Tree
 *
 * input:
 *        1
 *       / \
 *      2   3
 *     / \
 *    4   5
 *
 * output:
 * Diameter: 3
 *
 * Explanation:
 * Longest path between any two nodes.
 * Example path: 4 → 2 → 1 → 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
package Week01_Basics_Logic.Week08_Trees.Day56_Tree_Rivision;

public class DiameterOfBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static int diameter = 0;

    public static int height(Node root) {

        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        height(root);

        System.out.println("Diameter is : " + diameter);
    }
}
