/*
 * Problem Name: Binary Tree Level Order Traversal
 *
 * input:
 *         1
 *       /   \
 *      2     3
 *     / \   /
 *    4   5 6
 *
 * output:
 * [1]
 * [2,3]
 * [4,5,6]
 *
 * Example:
 * print nodes level by level
 *
 * Approach:
 *
 * use queue
 *
 * BFS traversal
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day89_Trees_BST;

import java.util.*;

public class LevelOrderTraversalRevision {

        static class Node {

                int data;
                Node left, right;

                Node(int d) {
                        data = d;
                }
        }

        public static void main(String[] args) {

                Node root = new Node(1);

                root.left = new Node(2);

                root.right = new Node(3);

                root.left.left = new Node(4);

                root.left.right = new Node(5);

                root.right.left = new Node(6);

                Queue<Node> q = new LinkedList<>();

                q.add(root);

                while (!q.isEmpty()) {

                        int size = q.size();

                        for (int i = 0; i < size; i++) {

                                Node curr = q.poll();

                                System.out.print(curr.data + " ");

                                if (curr.left != null)
                                        q.add(curr.left);

                                if (curr.right != null)
                                        q.add(curr.right);
                        }

                        System.out.println();
                }
        }
}