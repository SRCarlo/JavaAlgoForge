/**
 * Question:
 * Calculate x raised to the power n using recursion.
 *
 * Example:
 * Input  : x = 2, n = 4
 * Output : 16
 *
 * Algo:
 * 1. If n == 0 return 1.
 * 2. Otherwise return x * power(x, n-1).
 *
 * Explanation:
 * Power means multiplying the base number n times.
 * Recursion reduces the exponent step by step.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day22_Recursion_Basics;

public class PowerOfNumber {

    static int power(int x, int n) {

        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Call
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Power is : " + power(2, 4));
    }

}
