/*
 Question: Search in Rotated Sorted Array

 Example:
 Input  : arr = [4,5,6,7,0,1,2], target = 0
 Output : Index = 4

 Explanation:
 Array was sorted but rotated at some pivot.

 Algo:
 - Use Binary Search
 - One half will always be sorted
 - Decide which half to search

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day32_BinarySearch_Interview_Patterns;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Target found at index: " + ans);
    }
}