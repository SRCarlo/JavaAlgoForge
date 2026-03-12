/*
 * Problem Name: Largest BST in a Binary Tree
 *
 * input:
 *
 *        50
 *       /  \
 *     30    60
 *    / \   / \
 *   5  20 45 70
 *            / \
 *           65 80
 *
 * output:
 * Size of largest BST = 5
 *
 * Largest BST Subtree:
 *
 *        60
 *       /  \
 *      45   70
 *          /  \
 *         65  80
 *
 * Approach:
 * 1. Traverse tree using postorder.
 * 2. For each node check:
 *      left.max < root.data < right.min
 * 3. If true → this subtree is BST.
 * 4. Calculate size of BST.
 * 5. Track maximum size.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day62_BST_HardProblems;

public class LargestBSTinBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int size;
        int min;
        int max;
        boolean isBST;

        Info(int size, int min, int max, boolean isBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    static int maxBST = 0;

    static Info findLargestBST(Node root) {

        if (root == null)
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);

        Info left = findLargestBST(root.left);
        Info right = findLargestBST(root.right);

        if (left.isBST && right.isBST &&
                root.data > left.max &&
                root.data < right.min) {

            int size = left.size + right.size + 1;

            maxBST = Math.max(maxBST, size);

            return new Info(
                    size,
                    Math.min(root.data, left.min),
                    Math.max(root.data, right.max),
                    true);
        }

        return new Info(0, 0, 0, false);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        findLargestBST(root);

        System.out.println("Largest BST Size is : " + maxBST);
    }
}