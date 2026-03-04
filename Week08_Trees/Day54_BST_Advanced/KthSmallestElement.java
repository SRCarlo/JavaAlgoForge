/*
 * Problem Name: Kth Smallest Element in BST
 *
 * input:
 * BST: 50, 30, 70, 20, 40, 60, 80
 * k = 3
 *
 * output:
 * 3rd Smallest: 40
 *
 * Example:
 * Inorder traversal of BST gives sorted order:
 * 20 30 40 50 60 70 80
 *
 * Approach:
 * - Perform inorder traversal
 * - Count nodes until k
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day54_BST_Advanced;

public class KthSmallestElement {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;
    static int result = -1;

    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    public static void inorder(Node root, int k) {
        if (root == null || result != -1)
            return;

        inorder(root.left, k);

        count++;
        if (count == k) {
            result = root.data;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        Node root = null;

        for (int v : values)
            root = insert(root, v);

        int k = 3;
        inorder(root, k);

        System.out.println("3rd Smallest Element is : " + result);
    }
}
