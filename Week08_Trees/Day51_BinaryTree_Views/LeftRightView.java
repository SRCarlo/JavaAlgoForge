/*
 * Problem Name: Left View and Right View of Binary Tree
 * 
 * input:
 * - Root node of binary tree
 * 
 * output:
 * - Print left view and right view
 * 
 * Approach:
 * - Use Level Order Traversal.
 * - For each level:
 *      - First node → Left View
 *      - Last node → Right View
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week08_Trees.Day51_BinaryTree_Views;

import java.util.LinkedList;
import java.util.Queue;

public class LeftRightView {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printViews(Node root) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("Left View: ");
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                if (i == 0)
                    System.out.print(curr.data + " ");

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }

        System.out.println();

        queue.add(root);
        System.out.print("Right View: ");

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                if (i == size - 1)
                    System.out.print(curr.data + " ");

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(5);

        printViews(root);
    }
}
