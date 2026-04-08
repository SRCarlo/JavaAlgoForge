/*
 * Problem Name: Kth Smallest Element in BST
 *
 * input:
 *      5
 *     / \
 *    3   7
 *   / \
 *  2   4
 *
 * k = 3
 *
 * output:
 * 4
 *
 * Example:
 *
 * inorder traversal gives sorted order
 *
 * [2,3,4,5,7]
 *
 * 3rd smallest = 4
 *
 * Approach:
 *
 * inorder traversal
 *
 * count nodes
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day89_Trees_BST;

public class KthSmallestBST {

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static int count = 0;

    static int answer = 0;

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);

        root.right = new Node(7);

        root.left.left = new Node(2);

        root.left.right = new Node(4);

        int k = 3;

        inorder(root, k);

        System.out.println(answer);
    }

    static void inorder(Node root, int k) {

        if (root == null)
            return;

        inorder(root.left, k);

        count++;

        if (count == k) {

            answer = root.data;
            return;
        }

        inorder(root.right, k);
    }
}