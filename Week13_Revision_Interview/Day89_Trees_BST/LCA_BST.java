/*
 * Problem Name: Lowest Common Ancestor in BST
 *
 * input:
 *         6
 *       /   \
 *      2     8
 *     / \   / \
 *    0   4 7   9
 *
 * p = 2
 * q = 8
 *
 * output:
 * 6
 *
 * Example:
 * common parent node
 *
 * Approach:
 *
 * if both smaller → go left
 *
 * if both greater → go right
 *
 * otherwise → answer found
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day89_Trees_BST;

public class LCA_BST {

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(6);

        root.left = new Node(2);

        root.right = new Node(8);

        root.left.left = new Node(0);

        root.left.right = new Node(4);

        Node lca = find(root, 2, 8);

        System.out.println(lca.data);
    }

    static Node find(Node root, int p, int q) {

        if (root == null)
            return null;

        if (p < root.data && q < root.data)
            return find(root.left, p, q);

        if (p > root.data && q > root.data)
            return find(root.right, p, q);

        return root;
    }
}
