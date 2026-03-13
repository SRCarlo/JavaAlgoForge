/*
 * Problem Name: Convert BST to Greater Tree
 *
 * input:
 *
 *        4
 *       / \
 *      1   6
 *     / \ / \
 *    0  2 5  7
 *
 * output:
 *
 *       22
 *      /  \
 *     25   13
 *
 * Each node becomes:
 * node + sum of all greater nodes
 *
 * Approach:
 * 1. Traverse tree using reverse inorder.
 * 2. Keep running sum of visited nodes.
 * 3. Update node value with sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day63_BST_Revision;

public class ConvertBSTToGreaterTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sum = 0;

    static void convert(Node root) {

        if (root == null)
            return;

        convert(root.right);

        sum += root.data;
        root.data = sum;

        convert(root.left);
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(6);

        convert(root);

        inorder(root);
    }
}
