/*
 * Problem Name: Recover Binary Search Tree
 *
 * input:
 * BST where two nodes are swapped by mistake
 *
 * Example Input Tree:
 *
 *        10
 *       /  \
 *      5    8   ← wrong (should be 15)
 *     / \     
 *    2  15  ← wrong (should be 8)
 *
 * output:
 * Correct BST after fixing swapped nodes
 *
 * Correct Tree:
 *
 *        10
 *       /  \
 *      5    15
 *     / \
 *    2   8
 *
 * Approach:
 * 1. Inorder traversal of BST should give sorted order.
 * 2. If two nodes are swapped, the sorted order breaks.
 * 3. Find the two nodes where order is violated.
 * 4. Swap their values to fix the tree.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

package Week01_Basics_Logic.Week09_BST.Day62_BST_HardProblems;

public class RecoverBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node first = null;
    static Node second = null;
    static Node prev = null;

    static void recoverTree(Node root) {

        inorder(root);

        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null && root.data < prev.data) {

            if (first == null)
                first = prev;

            second = root;
        }

        prev = root;

        inorder(root.right);
    }

    static void printInorder(Node root) {

        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8); // swapped
        root.left.left = new Node(2);
        root.left.right = new Node(15); // swapped

        System.out.println("Before Fix :");
        printInorder(root);

        recoverTree(root);

        System.out.println("\nAfter Fix :");
        printInorder(root);
    }
}