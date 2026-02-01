/**
 * Question:
 * Find the Kth symbol in the Nth row of grammar.
 *
 * Example:
 * Input  : n = 4, k = 5
 * Output : 1
 *
 * Algo:
 * - If n == 1 → return 0
 * - Find mid = 2^(n-2)
 * - If k <= mid → same as previous row
 * - Else → opposite of previous row
 *
 * Explanation:
 * Each row is generated from the previous row.
 * Recursion tracks the parent symbol.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day23_Recursion_Logic;

public class KthSymbolInGrammar {

    static int kthGrammer(int n, int k) {

        // Base Case
        if (n == 1) {
            return 0;
        }

        int mid = (int) Math.pow(2, n - 2);

        // First half
        if (k <= mid) {
            return kthGrammer(n - 1, k);
        }
        // Second Half
        else {
            return 1 - (kthGrammer(n - 1, k - mid));
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammer(4, 5));
    }

}
