/*
 * Problem Name: Kth Largest Element in BST
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 * k = 2
 *
 * output:
 * 70
 *
 * Example:
 *
 *        50
 *       / \
 *      30 70
 *     / \ / \
 *   20 40 60 80
 *
 * Reverse Inorder Traversal (Right → Root → Left):
 * 80 70 60 50 40 30 20
 *
 * 2nd largest element = 70
 *
 * Approach:
 * 1. Use reverse inorder traversal.
 * 2. Count nodes while traversing.
 * 3. When count == k → return node value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day63_BST_Revision;

public class KthLargestBST {

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

    static void kthLargest(Node root, int k) {

        if (root == null)
            return;

        kthLargest(root.right, k);

        count++;

        if (count == k) {
            result = root.data;
            return;
        }

        kthLargest(root.left, k);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        kthLargest(root, 2); // 2 is the key to find the Element

        System.out.println("Kth Largest Element is : " + result);
    }
}