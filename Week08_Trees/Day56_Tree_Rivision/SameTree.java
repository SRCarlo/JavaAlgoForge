package Week01_Basics_Logic.Week08_Trees.Day56_Tree_Rivision;

/**
 * Problem Name: Same Tree
 *
 * input:
 * Tree1:  Tree2:
 * 
 *   1        1
 *  / \      / \
 *  2 3      2 3
 *
 * output:
 * true
 *
 * Explanation:
 * Trees are same if:
 * - structure same
 * - values same
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

public class SameTree {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static boolean isSame(Node p, Node q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.data != q.data)
            return false;

        return isSame(p.left, q.left) &&
                isSame(p.right, q.right);
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);

        Node b = new Node(1);
        b.left = new Node(2);
        b.right = new Node(3);

        System.out.println("Both are Same Tree : " + isSame(a, b));
    }
}
