/*
 Que:
 Find all combinations whose sum equals target.
 Same number can be reused.

 Example:
 Input  : [2,3,6,7], target = 7
 Output :
 2 2 3
 7

 Algo:
 - Pick current number (reuse allowed)
 - Reduce target
 - Backtrack if target < 0

 Explanation:
 Same index is used again to allow reuse.

 Dry Run:
 7 → pick 2 → 5 → pick 2 → 3 → pick 3 → 0

 Time Complexity: O(2^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day26_Backtracking_Core;

public class CombinationSum {

    static void find(int[] arr, int index, int target, String result) {

        // If target becomes 0, valid combination found
        if (target == 0) {
            System.out.println(result);
            return;
        }

        // If index out of range OR target negative → stop
        if (index == arr.length || target < 0) {
            return;
        }

        // Pick current element (can reuse → same index)
        find(arr, index, target - arr[index], result + arr[index] + " ");

        // Do not pick → move to next element
        find(arr, index + 1, target, result);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        find(arr, 0, 7, "");
    }
}
