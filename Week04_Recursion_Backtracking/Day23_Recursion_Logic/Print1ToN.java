/**
 * Question:
 * Print numbers from 1 to N using recursion.
 *
 * Example:
 * Input  : n = 5
 * Output : 1 2 3 4 5
 *
 * Algo:
 * - First call recursion for n-1
 * - Then print n
 *
 * Explanation:
 * Recursion goes down first and prints while returning.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day23_Recursion_Logic;

public class Print1ToN {

     static void print(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        print(n - 1);

        // Print while returning
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(5);
    }
}
