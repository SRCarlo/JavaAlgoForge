/*
 * Problem Name: Distance Between Two Nodes in Binary Tree
 *
 * input:
 * Binary Tree:
 *
 *            1
 *          /   \
 *         2     3
 *        / \   / \
 *       4   5 6   7
 *
 * Find distance between: 4 and 7
 *
 * output:
 * Distance: 4
 *
 * Example:
 * Path: 4 → 2 → 1 → 3 → 7
 * Number of edges = 4
 *
 * Approach:
 * 1. Find LCA of both nodes
 * 2. Find distance from LCA to node1
 * 3. Find distance from LCA to node2
 * 4. Total distance = d1 + d2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week08_Trees.Day55_LCA_BinaryTree;

public class DistanceBetweenTwoNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find LCA
    public static Node lca(Node root, int a, int b) {

        if (root == null)
            return null;

        if (root.data == a || root.data == b)
            return root;

        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    // Find distance from root to target node
    public static int findDistance(Node root, int target, int dist) {

        if (root == null)
            return -1;

        if (root.data == target)
            return dist;

        int left = findDistance(root.left, target, dist + 1);
        if (left != -1)
            return left;

        return findDistance(root.right, target, dist + 1);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 7;

        Node ancestor = lca(root, n1, n2);

        int d1 = findDistance(ancestor, n1, 0);
        int d2 = findDistance(ancestor, n2, 0);

        System.out.println("Distance: " + (d1 + d2));
    }
}
