/*
 * Problem Name: BST Iterator
 *
 * input:
 * BST nodes: 7, 3, 15, 9, 20
 *
 * output:
 * Inorder sequence:
 * 3 7 9 15 20
 *
 * Example:
 *
 *        7
 *       / \
 *      3  15
 *        /  \
 *       9   20
 *
 * Iterator returns next smallest element.
 *
 * Approach:
 * 1. Use stack to simulate inorder traversal.
 * 2. Push left nodes first.
 * 3. Pop node → return value → push right subtree.
 *
 * Time Complexity: O(1) average
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day63_BST_Revision;

import java.util.Stack;

public class BSTIterator {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Stack<Node> stack = new Stack<>();

    BSTIterator(Node root) {
        pushLeft(root);
    }

    void pushLeft(Node node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    int next() {
        Node node = stack.pop();
        pushLeft(node.right);
        return node.data;
    }

    boolean hasNext() {
        return !stack.isEmpty();
    }

    public static void main(String[] args) {

        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(15);
        root.right.left = new Node(9);
        root.right.right = new Node(20);

        BSTIterator it = new BSTIterator(root);

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
