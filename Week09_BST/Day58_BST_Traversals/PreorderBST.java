package Week01_Basics_Logic.Week09_BST.Day58_BST_Traversals;

/**
 * Problem Name: Preorder Traversal in Binary Search Tree
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 *
 * output:
 * Preorder Traversal:
 * 50 30 20 40 70 60 80
 *
 * Example:
 *
 *        50
 *       /  \
 *     30    70
 *    / \    / \
 *   20 40  60 80
 *
 * Preorder Traversal (Root → Left → Right)
 * Output: 50 30 20 40 70 60 80
 *
 * Approach:
 * 1. Visit root node
 * 2. Traverse left subtree
 * 3. Traverse right subtree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

public class PreorderBST {

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

    static void preorder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        preorder(root);
    }
}