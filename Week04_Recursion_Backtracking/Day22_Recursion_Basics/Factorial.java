/**
 * Question:
 * Find the factorial of a given number using recursion.
 *
 * Example:
 * Input  : n = 5
 * Output : 120
 *
 * Algo:
 * 1. If n is 0 or 1, return 1.
 * 2. Otherwise return n * factorial(n - 1).
 *
 * Explanation:
 * Factorial means multiplying all numbers from 1 to n.
 * Recursion reduces the problem size by 1 each time.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day22_Recursion_Basics;

public class Factorial {

    static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }
}
