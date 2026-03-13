/*
 * Problem Name: Inorder Successor in BST
 *
 * input:
 * Insert values: 20, 10, 30, 5, 15
 * key = 10
 *
 * output:
 * Successor = 15
 *
 * Example:
 *
 *        20
 *       /  \
 *     10    30
 *    /  \
 *   5   15
 *
 * Inorder traversal:
 * 5 10 15 20 30
 *
 * Successor of 10 = 15
 *
 * Approach:
 * 1. If node has right subtree → successor = leftmost node of right subtree.
 * 2. Otherwise track ancestor while searching.
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week09_BST.Day63_BST_Revision;

public class InorderSuccessorBST {

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

    static Node successor(Node root, int key) {

        Node succ = null;

        while (root != null) {

            if (key < root.data) {
                succ = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return succ;
    }

    public static void main(String[] args) {

        int[] values = { 20, 10, 30, 5, 15 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        Node ans = successor(root, 10);

        System.out.println("Successor is : " + ans.data);
    }
}
