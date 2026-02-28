/*
 * Problem Name: Create Binary Tree
 * Source: Self Practice
 * Difficulty: Easy
 * 
 * input:
 * - No external input
 * - Nodes are created manually inside the program
 * 
 * output:
 * - Binary tree structure is successfully created
 * - Confirmation message printed
 * 
 * Approach:
 * - Step 1: Define a Node class with data, left, and right references.
 * - Step 2: Create the root node.
 * - Step 3: Attach left and right child nodes manually.
 * - Step 4: Continue linking nodes to form the required tree structure.
 * 
 * Time Complexity:
 * - O(1) → Fixed number of nodes created manually.
 * 
 * Space Complexity:
 * - O(n) → Space used to store n nodes.
 */

package Week01_Basics_Logic.Week08_Trees.Day50_BinaryTree_Basics;

public class CreateBinaryTree {

    // Node class for tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        // Creating nodes manually
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("Binary Tree Created Successfully.");
        System.out.println("Root Node is : " + root.data);
    }

}
