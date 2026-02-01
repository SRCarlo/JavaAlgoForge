/**
 * Question:
 * Print numbers from N to 1 using recursion.
 *
 * Example:
 * Input  : n = 5
 * Output : 5 4 3 2 1
 *
 * Algo:
 * - Print n
 * - Then call recursion for n-1
 *
 * Explanation:
 * Printing happens before recursive call.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day23_Recursion_Logic;

public class PrintNTo1 {

    static void print(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Print first
        System.out.print(n + " ");

        // Recursive Call
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
