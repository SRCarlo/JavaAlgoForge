/*
 Que:
 Find unique combinations where each number is used once.

 Example:
 Input  : [10,1,2,7,6,1,5], target = 8
 Output :
 1 1 6
 1 2 5
 1 7
 2 6

 Algo:
 - Sort array
 - Skip duplicates
 - Move index forward after picking

 Explanation:
 Sorting helps avoid duplicate combinations.

 Time Complexity: O(2^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day26_Backtracking_Core;

import java.util.Arrays;

public class CombinationSumII {

    static void find(int[] arr, int index, int target, String result) {

        // Target reached → valid combination
        if (target == 0) {
            System.out.println(result);
            return;
        }

        // Loop through remaining elements
        for (int i = index; i < arr.length; i++) {

            // Skip duplicate values
            if (i > index && arr[i] == arr[i - 1])
                continue;

            // If number is greater than target → stop
            if (arr[i] > target)
                break;

            // Pick element and move forward
            find(arr, i + 1, target - arr[i], result + arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        Arrays.sort(arr); // Important
        find(arr, 0, 8, "");
    }

}
