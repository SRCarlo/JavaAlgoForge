/*
 Question: Find Minimum in Rotated Sorted Array

 Example:
 Input  : arr = [4,5,6,7,0,1,2]
 Output : Minimum = 0

 Algo:
 - Minimum is the pivot point
 - Use Binary Search
 - Compare mid with high

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day32_BinarySearch_Interview_Patterns;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Minimum lies in right part
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }

            // Minimum lies in left part (including mid)
            else {
                high = mid;
            }
        }
        System.out.println("Minimum Element is : " + arr[low]);
    }

}
