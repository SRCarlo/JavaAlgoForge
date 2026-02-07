/**
 * Question: Merge Two Sorted Arrays
 *
 * Example:
 * Input  : arr1 = [1, 3, 5]
 *          arr2 = [2, 4, 6]
 *
 * Output : [1, 2, 3, 4, 5, 6]
 *
 * Algo:
 * 1. Use two pointers i and j
 * 2. Compare elements and insert smaller one
 * 3. Add remaining elements
 *
 * Time Complexity: O(n+m)
 * Space Complexity: O(n+m)
 */

package Week01_Basics_Logic.Week05_Sorting_Searching.Day29_Sorting_Fundamentals;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge directly
        while (i < n && j < m) {

            if (arr1[i] < arr2[j])
                result[k++] = arr1[i++];
            else
                result[k++] = arr2[j++];
        }

        // Copy remaining arr1
        while (i < n)
            result[k++] = arr1[i++];

        // Copy remaining arr2
        while (j < m)
            result[k++] = arr2[j++];

        // Print merged array
        System.out.print("Merged Array: ");
        for (int num : result)
            System.out.print(num + " ");
    }

}
