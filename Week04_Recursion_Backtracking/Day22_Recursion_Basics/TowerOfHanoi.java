/**
 * Question:
 * Solve Tower of Hanoi problem using recursion.
 *
 * Example:
 * Input  : n = 3
 * Output :
 * Move disk 1 from A to C
 * Move disk 2 from A to B
 * Move disk 1 from C to B
 * Move disk 3 from A to C
 * Move disk 1 from B to A
 * Move disk 2 from B to C
 * Move disk 1 from A to C
 *
 * Algo:
 * 1. Move n-1 disks from source to helper.
 * 2. Move nth disk from source to destination.
 * 3. Move n-1 disks from helper to destination.
 *
 * Explanation:
 * The problem is divided into smaller subproblems.
 * Recursion handles moving disks step by step.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day22_Recursion_Basics;

public class TowerOfHanoi {

    static void solve(int n, char source, char helper, char destination) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks to helper rod
        solve(n - 1, source, destination, helper);

        // Move largest disk to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks to destination rod
        solve(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'B', 'C');
    }
}
