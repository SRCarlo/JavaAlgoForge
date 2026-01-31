/**
 * Question:
 * Find the nth Fibonacci number using recursion.
 *
 * Example:
 * Input  : n = 6
 * Output : 8
 *
 * Algo:
 * 1. If n is 0 return 0.
 * 2. If n is 1 return 1.
 * 3. Otherwise fib(n-1) + fib(n-2).
 *
 * Explanation:
 * Fibonacci is the sum of the previous two numbers.
 * Recursion breaks the problem into smaller subproblems.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day22_Recursion_Basics;

public class Fibonacci {

    static int fibonacci(int n) {

        // Base Case
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci is : " + fibonacci(n));
    }
}
