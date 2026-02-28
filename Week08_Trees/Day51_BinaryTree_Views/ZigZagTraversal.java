/*
 * Problem Name: ZigZag (Spiral) Traversal of Binary Tree
 * input:
 * - Root node of binary tree
 * 
 * output:
 * - Print nodes in zigzag level order
 * 
 * Approach:
 * - Use Queue for BFS.
 * - Use a boolean flag (leftToRight).
 * - Reverse order every alternate level.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week08_Trees.Day51_BinaryTree_Views;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void zigzag(Node root) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                if (leftToRight)
                    level.add(curr.data);
                else
                    level.add(0, curr.data);

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }

            for (int val : level)
                System.out.print(val + " ");

            System.out.println();
            leftToRight = !leftToRight;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        zigzag(root);
    }
}
