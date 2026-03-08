/*
 * Problem Name: Postorder Traversal in Binary Search Tree
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 *
 * output:
 * Postorder Traversal:
 * 20 40 30 60 80 70 50
 *
 * Example:
 *
 *        50
 *       /  \
 *     30    70
 *    / \   /  \
 *   20 40 60  80
 *
 * Postorder Traversal (Left → Right → Root)
 * Output: 20 40 30 60 80 70 50
 *
 * Approach:
 * 1. Traverse left subtree
 * 2. Traverse right subtree
 * 3. Visit root node
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
package Week01_Basics_Logic.Week09_BST.Day58_BST_Traversals;

public class PostorderBST {

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

    static void postorder(Node root) {

        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        postorder(root);
    }
}
