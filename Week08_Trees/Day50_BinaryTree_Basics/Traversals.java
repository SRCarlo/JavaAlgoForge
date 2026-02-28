/*
 * Problem Name: Binary Tree Traversals (Inorder, Preorder, Postorder)
 * Source: Self Practice
 * Difficulty: Easy
 * 
 * input:
 * - Root node of a binary tree
 * 
 * output:
 * - Print Inorder traversal (Left → Root → Right)
 * - Print Preorder traversal (Root → Left → Right)
 * - Print Postorder traversal (Left → Right → Root)
 * 
 * Approach:
 * - Step 1: If root is null → return (base case).
 * - Step 2: For Inorder:
 *      • Traverse left subtree
 *      • Print root
 *      • Traverse right subtree
 * - Step 3: For Preorder:
 *      • Print root
 *      • Traverse left subtree
 *      • Traverse right subtree
 * - Step 4: For Postorder:
 *      • Traverse left subtree
 *      • Traverse right subtree
 *      • Print root
 * 
 * Time Complexity:
 * - O(n) → Every node is visited once.
 * 
 * Space Complexity:
 * - O(h) → Recursion stack space (h = height of tree).
 */

package Week01_Basics_Logic.Week08_Trees.Day50_BinaryTree_Basics;

public class Traversals {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    public static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println("\nPreorder Traversal:");
        preorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);
    }
}
