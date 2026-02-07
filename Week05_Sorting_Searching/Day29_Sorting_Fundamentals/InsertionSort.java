/* 
* Question: Insertion Sort
*
* Example:
* Input  : [12, 11, 13, 5, 6]
* Output : [5, 6, 11, 12, 13]
*
* Algo:
* 1. Take one element at a time
* 2. Insert it into correct position in sorted part
*
* Explanation:
* Works like sorting playing cards in hand.
*
* Time Complexity: O(n^2)
* Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day29_Sorting_Fundamentals;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        // Insertion Sort logic directly
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift bigger elements right
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct place
            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }

}
