/**
 * Question: Bubble Sort
 *
 * Example:
 * Input  : [5, 1, 4, 2, 8]
 * Output : [1, 2, 4, 5, 8]
 *
 * Algo (Simple Steps):
 * 1. Compare adjacent elements
 * 2. Swap if left element is bigger
 * 3. After 1 full pass, largest element goes to end
 * 4. Repeat for remaining elements
 *
 * Explanation:
 * Bubble sort keeps pushing the biggest element to the last like bubbles rising.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week05_Sorting_Searching.Day29_Sorting_Fundamentals;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 5, 1, 4, 2, 8 };
        int n = arr.length;

        // Bubble Sort logic directly
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
