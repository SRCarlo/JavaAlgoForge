/*
 * Problem Name: Binary Tree Level Order Traversal (BFS)
 * 
 * input:
 * - Root node of a binary tree
 * 
 * output:
 * - Print nodes level by level (left to right)
 * {
 *   Level Order Traversal:
 *   1 
 *   2 3 
 *   4 5 
 * }
 * 
 * Approach:
 * - Step 1: Use a Queue data structure.
 * - Step 2: Add root node to queue.
 * - Step 3: While queue is not empty:
 *      - Get current queue size (represents one level).
 *      - Process all nodes of that level.
 *      - Add left and right children to queue.
 * - Step 4: Continue until queue becomes empty.
 * 
 * Time Complexity:
 * - O(n) → Each node is visited once.
 * 
 * Space Complexity:
 * - O(n) → Queue stores nodes level by level.
 */

package Week01_Basics_Logic.Week08_Trees.Day51_BinaryTree_Views;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Level Order Traversal Method
    public static void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size(); // Number of nodes at current level

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);
            }

            System.out.println(); // New line after each level
        }
    }

    public static void main(String[] args) {

        // Create sample tree
        /*
         *       1
         *     /  \
         *    2    3
         *   / \
         *   4  5
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
