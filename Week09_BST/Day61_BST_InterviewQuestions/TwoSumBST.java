/*
 * Problem Name: Two Sum in BST
 *
 * input:
 * Insert values: 50, 30, 70, 20, 40, 60, 80
 * Target = 90
 *
 * output:
 * true
 *
 * Example:
 *
 *        50
 *       /  \
 *      30   70
 *     / \   / \
 *    20 40  60 80
 *
 * Check if there exist two nodes whose sum = target
 *
 * 30 + 60 = 90  ✔
 *
 * Output: true
 *
 * Approach:
 * 1. Traverse the BST using DFS.
 * 2. Store visited values in a HashSet.
 * 3. For each node check if (target - node.data) exists in set.
 * 4. If yes → pair found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
package Week01_Basics_Logic.Week09_BST.Day61_BST_InterviewQuestions;

import java.util.HashSet;

public class TwoSumBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    static boolean findTarget(Node root, int target, HashSet<Integer> set) {

        if (root == null)
            return false;

        if (set.contains(target - root.data))
            return true;

        set.add(root.data);

        return findTarget(root.left, target, set) ||
                findTarget(root.right, target, set);
    }

    public static void main(String[] args) {

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        Node root = null;

        for (int v : values)
            root = insert(root, v);

        int target = 90;

        boolean result = findTarget(root, target, new HashSet<>());

        System.out.println(result);
    }
}