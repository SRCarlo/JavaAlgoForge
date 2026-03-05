/*
 * Problem Name: Path From Root to Given Node
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
 * Target Node: 5
 *
 * output:
 * Path: [1, 2, 5]
 *
 * Example:
 * Root → 1
 * Move left → 2
 * Move right → 5
 *
 * Approach:
 * 1. Start from root
 * 2. Add node to path list
 * 3. If target found → return true
 * 4. If not found → backtrack (remove node)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
package Week01_Basics_Logic.Week08_Trees.Day55_LCA_BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathFromRootToNode {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean findPath(Node root, int target, List<Integer> path) {

        if (root == null)
            return false;

        path.add(root.data);

        if (root.data == target)
            return true;

        if (findPath(root.left, target, path) ||
                findPath(root.right, target, path))
            return true;

        // backtrack
        path.remove(path.size() - 1);

        return false;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> path = new ArrayList<>();

        findPath(root, 5, path);

        System.out.println("Path: " + path);
    }
}
