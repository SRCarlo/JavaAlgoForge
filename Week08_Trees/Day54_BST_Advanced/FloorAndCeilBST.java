/*
 * Problem Name: Floor and Ceil in BST
 *
 * input:
 * BST: 10, 5, 15, 2, 7, 12, 20
 * Key = 13
 *
 * output:
 * Floor: 12
 * Ceil: 15
 *
 * Example:
 * Floor = greatest value <= key
 * Ceil  = smallest value >= key
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week08_Trees.Day54_BST_Advanced;

public class FloorAndCeilBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    public static void findFloorCeil(Node root, int key) {

        Integer floor = null;
        Integer ceil = null;

        while (root != null) {

            if (root.data == key) {
                floor = ceil = root.data;
                break;
            }

            if (key < root.data) {
                ceil = root.data;
                root = root.left;
            } else {
                floor = root.data;
                root = root.right;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {

        int[] values = { 10, 5, 15, 2, 7, 12, 20 };
        Node root = null;

        for (int v : values)
            root = insert(root, v);

        findFloorCeil(root, 13);
    }
}
