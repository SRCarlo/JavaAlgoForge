/*
 * Problem Name: Search in Binary Search Tree
 *
 * input:
 * BST: 50, 30, 70, 20, 40, 60, 80
 * Search value: 60
 *
 * output:
 * Found: true
 *
 * Example:
 * - 60 > 50 → go right
 * - 60 < 70 → go left
 * - Found at node 60
 *
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day53_BinarySearchTree_Basics;

public class SearchInBST {

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

    public static boolean search(Node root, int key) {

        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        Node root = null;

        for (int val : values)
            root = insert(root, val);

        int key = 60;
        System.out.println("Element is Found : " + search(root, key));
    }
}
