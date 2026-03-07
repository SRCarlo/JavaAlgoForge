/*
 * Problem Name: Search in Binary Search Tree
 *
 * input:
 * Tree values: 50, 30, 70, 20, 40, 60, 80
 * Search key: 60
 *
 * output:
 * Key Found
 *
 * Example:
 *        50
 *       /  \
 *     30    70
 *          /
 *        60
 *
 * Search 60 → Found
 *
 * Approach:
 * 1. If root is null → return false.
 * 2. If root.data == key → return true.
 * 3. If key < root.data → search left subtree.
 * 4. If key > root.data → search right subtree.
 *
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day57_BST_Basics;

public class SearchInBST {

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

    public static boolean search(Node root, int key) {

        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        int key = 60;

        if (search(root, key))
            System.out.println("Key Found");
        else
            System.out.println("Key Not Found");
    }
}
