package Week01_Basics_Logic.Week08_Trees.Day56_Tree_Rivision;

/**
 * Problem Name: Invert Binary Tree
 *
 * input:
 * 4
 * / \
 * 2 7
 * / \ / \
 * 1 3 6 9
 *
 * output:
 * 4
 * / \
 * 7 2
 * / \ / \
 * 9 6 3 1
 *
 * Explanation:
 * Swap left and right children of every node.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

public class InvertBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static Node invert(Node root) {

        if (root == null)
            return null;

        Node left = invert(root.left);
        Node right = invert(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        root = invert(root);

        System.out.println("Tree inverted successfully");
    }
}
