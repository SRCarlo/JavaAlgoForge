/*
 * Problem Name: Convert Sorted Array to Balanced BST
 *
 * input:
 * Sorted Array: [10, 20, 30, 40, 50, 60, 70]
 *
 * output:
 * Balanced BST (Inorder traversal):
 * 10 20 30 40 50 60 70
 *
 * Example:
 *
 * Sorted Array
 * 10 20 30 40 50 60 70
 *
 * Middle element becomes root:
 *
 *        40
 *       /  \
 *     20    60
 *    / \    / \
 *  10 30  50 70
 *
 * Approach:
 * 1. Find middle element of array → make it root.
 * 2. Recursively build left subtree using left half.
 * 3. Recursively build right subtree using right half.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(log n)
 */

package Week01_Basics_Logic.Week09_BST.Day60_BST_Advanced;

public class SortedArrayToBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node buildBST(int[] arr, int start, int end) {

        if (start > end)
            return null;

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = buildBST(arr, start, mid - 1);
        root.right = buildBST(arr, mid + 1, end);

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

        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        Node root = buildBST(arr, 0, arr.length - 1);

        inorder(root);
    }
}