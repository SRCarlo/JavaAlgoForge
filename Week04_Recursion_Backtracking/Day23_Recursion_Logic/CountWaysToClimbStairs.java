/**
 * Question:
 * Count the number of ways to climb n stairs.
 * You can climb either 1 step or 2 steps at a time.
 *
 * Example:
 * Input  : n = 4
 * Output : 5
 *
 * Algo:
 * - If n == 0 or n == 1 → return 1
 * - Otherwise → ways(n-1) + ways(n-2)
 *
 * Explanation:
 * From step n, you can come from:
 * - step n-1 (1 step jump)
 * - step n-2 (2 step jump)
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day23_Recursion_Logic;

public class CountWaysToClimbStairs {

    static int countWays(int n) {

        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(" Way is : " + countWays(n));
    }

}
