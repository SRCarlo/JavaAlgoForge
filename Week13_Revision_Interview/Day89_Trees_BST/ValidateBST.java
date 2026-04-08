/*
 * Problem Name: Validate Binary Search Tree
 *
 * input:
 *      5
 *     / \
 *    3   7
 *   / \
 *  2   4
 *
 * output:
 * true
 *
 * Example:
 *
 * left < root
 * right > root
 *
 * for every node
 *
 * Approach:
 *
 * use min max range
 *
 * validate recursively
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day89_Trees_BST;

public class ValidateBST {

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);

        root.right = new Node(7);

        root.left.left = new Node(2);

        root.left.right = new Node(4);

        System.out.println(isValid(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    static boolean isValid(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
    }
}
