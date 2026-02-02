/**
 * Question:
 * Print subsequences whose sum equals given target.
 *
 * Example:
 * Input  : arr = {1, 2, 1}, target = 2
 * Output : [1,1], [2]
 *
 * Algo:
 * - Pick or not pick current element
 * - Track current sum
 *
 * Explanation:
 * Every element has two choices.
 * Print subsequence when sum matches target.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day24_Subsequences;

public class SubsequenceWithSum {
    static void find(int[] arr, int index, int sum, int target, String ans) {

        if (index == arr.length) {
            if (sum == target) {
                System.out.println(ans);
            }
            return;
        }

        // Pick
        find(arr, index + 1, sum + arr[index], target, ans + arr[index] + " ");

        // Not pick
        find(arr, index + 1, sum, target, ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        find(arr, 0, 0, 2, "");
    }

}
