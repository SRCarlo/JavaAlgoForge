/*
 * Problem Name: Range Sum of BST
 *
 * input:
 * Insert values: 10, 5, 15, 3, 7, 18
 * low = 7
 * high = 15
 *
 * output:
 * 32
 *
 * Example:
 *
 *        10
 *       /  \
 *      5    15
 *     / \     \
 *    3   7    18
 *
 * Nodes within range [7,15]
 *
 * 7 + 10 + 15 = 32
 *
 * Output: 32
 *
 * Approach:
 * 1. Traverse the BST.
 * 2. If node value is within range → add to sum.
 * 3. If node < low → move right.
 * 4. If node > high → move left.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
package Week01_Basics_Logic.Week09_BST.Day61_BST_InterviewQuestions;

public class RangeSumBST {

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

    static int rangeSum(Node root, int low, int high) {

        if (root == null)
            return 0;

        if (root.data < low)
            return rangeSum(root.right, low, high);

        if (root.data > high)
            return rangeSum(root.left, low, high);

        return root.data +
                rangeSum(root.left, low, high) +
                rangeSum(root.right, low, high);
    }

    public static void main(String[] args) {

        int[] values = { 10, 5, 15, 3, 7, 18 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        int low = 7;
        int high = 15;

        int sum = rangeSum(root, low, high);

        System.out.println(sum);
    }
}