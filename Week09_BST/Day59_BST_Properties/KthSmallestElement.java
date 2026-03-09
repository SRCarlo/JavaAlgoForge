/*
 * Problem Name: Kth Smallest Element in BST
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 * k = 3
 *
 * output:
 * 40
 *
 * Example:
 *
 *        50
 *       /  \
 *     30    70
 *    / \   / \
 *   20 40 60 80
 *
 * Inorder Traversal:
 * 20 30 40 50 60 70 80
 *
 * 3rd smallest element = 40
 *
 * Approach:
 * 1. Perform inorder traversal (sorted order in BST).
 * 2. Count nodes during traversal.
 * 3. When count == k, return the node value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day59_BST_Properties;

public class KthSmallestElement {

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

    static int count = 0;
    static int result = -1;

    static void kthSmallest(Node root, int k) {

        if (root == null)
            return;

        kthSmallest(root.left, k);

        count++;

        if (count == k) {
            result = root.data;
            return;
        }

        kthSmallest(root.right, k);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        int k = 3;

        kthSmallest(root, k);

        System.out.println(result);
    }
}