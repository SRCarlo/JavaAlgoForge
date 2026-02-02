/**
 * Question:
 * Count number of subsequences whose sum equals target.
 *
 * Example:
 * Input  : arr = {1, 2, 1}, target = 2
 * Output : 2
 *
 * Algo:
 * - Count include + exclude paths
 *
 * Explanation:
 * Instead of printing, we count valid subsequences.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day24_Subsequences;

public class CountSubsequenceSum {

    static int count(int[] arr, int index, int sum, int target) {
        if (index == arr.length) {
            return sum == target ? 1 : 0;
        }

        // Pick
        int pick = count(arr, index + 1, sum + arr[index], target);

        // Not Pick
        int notPick = count(arr, index + 1, sum, target);

        return pick + notPick;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println(count(arr, 0, 0, 2));
    }
}
