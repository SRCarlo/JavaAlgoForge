/*
 Que:
 Generate all possible subsets of a given array.

 Example:
 Input  : [1, 2]
 Output :
 (empty)
 1
 2
 1 2

 Algo:
 - Start from index 0
 - For each element, make 2 choices:
   1) pick the element
   2) do not pick the element
 - When index reaches array length, print subset

 Explanation:
 Each element either comes in the subset or not.
 Recursion helps us try both choices for every element.

 Dry Run:
 arr = [1,2]
 "" → pick 1 → "1 "
        → pick 2 → "1 2"
        → not pick 2 → "1"
 "" → not pick 1 → ""
        → pick 2 → "2"
        → not pick 2 → ""

 Time Complexity: O(2^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day25_Subsets_Permutations;

public class GenerateAllSubsets {

    static void subsets(int[] arr, int index, String curr) {

        if (index == arr.length) {
            System.out.println(curr);
            return;
        }

        // Pick current element
        subsets(arr, index + 1, curr + arr[index] + " ");

        // Do not pick current element
        subsets(arr, index + 1, curr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        subsets(arr, 0, "");
    }

}
