/**
 * Problem Name: Lowest Common Ancestor in Binary Search Tree
 *
 * input:
 * Insert values: 20, 10, 30, 5, 15, 25, 35
 * Find LCA of: 5 and 15
 *
 * output:
 * LCA = 10
 *
 * Example:
 *
 *        20
 *       /  \
 *     10    30
 *    / \    / \
 *   5  15  25 35
 *
 * Nodes: 5 and 15
 *
 * Path to 5  : 20 → 10 → 5
 * Path to 15 : 20 → 10 → 15
 *
 * Lowest Common Ancestor = 10
 *
 * Approach:
 * 1. If both nodes < root → move to left subtree.
 * 2. If both nodes > root → move to right subtree.
 * 3. Otherwise root is the LCA.
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */
package Week01_Basics_Logic.Week09_BST.Day60_BST_Advanced;

public class LowestCommonAncestoreBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static Node lca(Node root, int n1, int n2) {

        while (root != null) {
            if (n1 < root.data && n2 < root.data) {
                root = root.left;
            } else if (n1 > root.data && n2 > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] values = { 20, 10, 30, 5, 15, 25, 35 };
        Node root = null;
        for (int v : values) {
            root = insert(root, v);
        }
        Node ans = lca(root, 5, 15);

        System.out.println("LCA is : " + ans.data);
    }

}
