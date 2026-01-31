/**
 * Question:
 * Find the sum of first n natural numbers using recursion.
 *
 * Example:
 * Input  : n = 5
 * Output : 15
 *
 * Algo:
 * 1. If n == 0 return 0.
 * 2. Otherwise return n + sum(n-1).
 *
 * Explanation:
 * Each recursive call adds one number to the sum.
 * The process stops when n becomes 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day22_Recursion_Basics;

public class SumOfNaturalNumbers {

    static int sum(int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Call
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sum : " + sum(5));
    }

}
