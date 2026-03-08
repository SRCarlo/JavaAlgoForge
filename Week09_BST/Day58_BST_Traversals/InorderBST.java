/*
 * Problem Name: Inorder Traversal in Binary Search Tree
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 *
 * output:
 * Inorder Traversal:
 * 20 30 40 50 60 70 80
 *
 * Example:
 *
 *        50
 *       /  \
 *     30    70
 *    / \    / \
 *   20 40  60  80
 *
 * Inorder Traversal (Left → Root → Right)
 * Output: 20 30 40 50 60 70 80
 *
 * Approach:
 * 1. Traverse left subtree
 * 2. Visit root node
 * 3. Traverse right subtree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day58_BST_Traversals;

public class InorderBST {

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

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        inorder(root);
    }
}
