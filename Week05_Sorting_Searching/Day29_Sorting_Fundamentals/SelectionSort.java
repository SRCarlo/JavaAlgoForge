/**
 * Question: Selection Sort
 *
 * Example:
 * Input  : [64, 25, 12, 22, 11]
 * Output : [11, 12, 22, 25, 64]
 *
 * Algo:
 * 1. Find smallest element in array
 * 2. Swap it with first element
 * 3. Repeat for next positions
 *
 * Explanation:
 * Selection sort selects the minimum element and places it correctly.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week05_Sorting_Searching.Day29_Sorting_Fundamentals;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        // Selection Sort logic directly
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find smallest element in remaining array
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap smallest with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }

}
