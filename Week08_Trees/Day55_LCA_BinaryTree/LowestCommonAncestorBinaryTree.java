/*
 * Problem Name: Lowest Common Ancestor in Binary Tree
 *
 * input:
 * Binary Tree:
 *
 *             3
 *           /   \
 *          5     1
 *         / \   / \
 *        6   2 0   8
 *           / \
 *          7   4
 *
 * Find LCA of nodes: 7 and 4
 *
 * output:
 * LCA: 2
 *
 * Example:
 * Node 7 and Node 4 are children of node 2
 * So their lowest common ancestor is 2
 *
 * Approach:
 * 1. If root is null → return null
 * 2. If root matches either node → return root
 * 3. Recursively check left subtree
 * 4. Recursively check right subtree
 * 5. If both left and right return non-null → root is LCA
 * 6. Otherwise return whichever side is not null
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)  (recursion stack)
 */

package Week01_Basics_Logic.Week08_Trees.Day55_LCA_BinaryTree;

public class LowestCommonAncestorBinaryTree {

    // Tree Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to find LCA
    public static Node findLCA(Node root, int p, int q) {

        // Base case
        if (root == null)
            return null;

        // If current node is one of the targets
        if (root.data == p || root.data == q)
            return root;

        // Search in left subtree
        Node left = findLCA(root.left, p, q);

        // Search in right subtree
        Node right = findLCA(root.right, p, q);

        // If both sides returned a node → this is LCA
        if (left != null && right != null)
            return root;

        // Otherwise return non-null child
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {

        // Creating the tree
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        int node1 = 7;
        int node2 = 4;

        Node lca = findLCA(root, node1, node2);

        System.out.println("LCA of " + node1 + " and " + node2 + " is: " + lca.data);
    }
}
