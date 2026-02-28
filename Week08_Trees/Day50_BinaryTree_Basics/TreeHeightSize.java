/*
 * Problem Name: Height and Size of Binary Tree
 * Source: Self Practice
 * Difficulty: Easy
 * 
 * input:
 * - Root node of a binary tree
 * 
 * output:
 * - Return Height (maximum depth of tree)
 * - Return Size (total number of nodes)
 * 
 * Approach:
 * - Step 1: If root is null → return 0.
 * - Step 2: For Height:
 *      • Recursively calculate height of left subtree
 *      • Recursively calculate height of right subtree
 *      • Return 1 + max(leftHeight, rightHeight)
 * - Step 3: For Size:
 *      • Recursively calculate size of left subtree
 *      • Recursively calculate size of right subtree
 *      • Return 1 + leftSize + rightSize
 * 
 * Time Complexity:
 * - O(n) → Each node is visited once.
 * 
 * Space Complexity:
 * - O(h) → Recursion stack space.
 */

package Week01_Basics_Logic.Week08_Trees.Day50_BinaryTree_Basics;

public class TreeHeightSize {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Calculate Height
    public static int height(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Calculate Size
    public static int size(Node root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Height of Tree: " + height(root));
        System.out.println("Size of Tree: " + size(root));
    }
}
