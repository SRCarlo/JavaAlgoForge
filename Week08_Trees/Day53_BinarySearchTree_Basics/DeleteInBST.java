/*
 * Problem Name: Delete Node in Binary Search Tree
 *
 * input:
 * BST: 50, 30, 70, 20, 40, 60, 80
 * Delete value: 70
 *
 * output (Inorder Traversal after deletion):
 * 20 30 40 50 60 80
 *
 * Cases:
 * 1. Node has no child → delete directly
 * 2. Node has one child → replace with child
 * 3. Node has two children → replace with inorder successor
 *
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day53_BinarySearchTree_Basics;

public class DeleteInBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

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
            else if (root.right == null)
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

        for (int val : values)
            root = insert(root, val);

        root = delete(root, 70);

        System.out.print("Inorder After Deletion : ");
        inorder(root);
    }
}
