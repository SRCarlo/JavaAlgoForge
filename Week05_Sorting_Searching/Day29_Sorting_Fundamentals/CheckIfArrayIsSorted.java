/**
 * Question: Check if Array is Sorted
 *
 * Example:
 * Input  : [1, 2, 3, 4]
 * Output : true
 *
 * Input  : [3, 2, 1]
 * Output : false
 *
 * Algo:
 * 1. Traverse array
 * 2. If any element > next element → not sorted
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week05_Sorting_Searching.Day29_Sorting_Fundamentals;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        // int[] arr = { 3, 2, 1 };

        boolean sorted = true;

        // Check sorted
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println("Is Sorted ? " + sorted);
    }

}
