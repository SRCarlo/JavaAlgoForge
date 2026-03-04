/*
 * Problem Name: Lowest Common Ancestor in BST
 *
 * input:
 * BST: 20, 10, 30, 5, 15, 25, 35
 * Find LCA of 5 and 15
 *
 * output:
 * LCA: 10
 *
 * Example:
 * If both nodes < root → go left
 * If both nodes > root → go right
 * Otherwise root is LCA
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week08_Trees.Day54_BST_Advanced;

public class LCAinBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    public static Node lca(Node root, int p, int q) {

        while (root != null) {

            if (p < root.data && q < root.data)
                root = root.left;

            else if (p > root.data && q > root.data)
                root = root.right;

            else
                return root;
        }

        return null;
    }

    public static void main(String[] args) {

        int[] values = { 20, 10, 30, 5, 15, 25, 35 };
        Node root = null;

        for (int v : values)
            root = insert(root, v);

        Node ans = lca(root, 5, 15);
        System.out.println("LCA (Lowest Common Ancestor) is : " + ans.data);
    }
}
