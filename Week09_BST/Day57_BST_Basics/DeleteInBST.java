/*
 * Problem Name: Delete Node in Binary Search Tree
 *
 * input:
 * Tree values: 50, 30, 70, 20, 40, 60, 80
 * Delete key: 30
 *
 * output:
 * Inorder after deletion:
 * 20 40 50 60 70 80
 *
 * Example:
 *
 * Before Deletion
 *        50
 *       /  \
 *     30    70
 *    /  \
 *  20   40
 *
 * After Deleting 30
 *
 *        50
 *       /  \
 *     40    70
 *    /
 *  20
 *
 * Approach:
 * 1. Find node to delete.
 * 2. Case 1: No child → remove node.
 * 3. Case 2: One child → replace with child.
 * 4. Case 3: Two children → replace with inorder successor.
 *
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 */
package Week01_Basics_Logic.Week09_BST.Day57_BST_Basics;

public class DeleteInBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    public static Node findMin(Node root) {

        while (root.left != null)
            root = root.left;

        return root;
    }

    public static Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node successor = findMin(root.right);

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    public static void inorder(Node root) {

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

        root = delete(root, 30);

        inorder(root);
    }
}