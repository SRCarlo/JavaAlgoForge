/**
 * Question:
 * Find the safe position in Josephus problem.
 *
 * Example:
 * Input  : n = 5, k = 2
 * Output : 3
 *
 * Algo:
 * - If n == 1 → return 0
 * - Otherwise → (josephus(n-1, k) + k) % n
 *
 * Explanation:
 * People are eliminated in a circular manner.
 * Recursion reduces the circle size step by step.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day23_Recursion_Logic;

public class JosephusProblem {

    static int josephus(int n, int k) {

        // Base case
        if (n == 1) {
            return 0;
        }

        // Recursive Formula
        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        // +1 to convert index to position
        System.out.println("Safe Position is : " + (josephus(n, k) + 1));
    }

}
