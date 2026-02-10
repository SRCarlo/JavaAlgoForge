/*
 Question: Single Element in Sorted Array

 Example:
 Input  : [1,1,2,3,3,4,4]
 Output : 2

 Explanation:
 Every element appears twice except one.

 Algo:
 - Use Binary Search on pairs
 - If mid is even → check mid+1
 - If mid is odd → check mid-1

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day32_BinarySearch_Interview_Patterns;

public class SingleElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };

        int low = 0, high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            // Make mid even
            if (mid % 2 == 1)
                mid--;

            // Pair is correct → go right
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            }
            // Pair broken → answer on left
            else {
                high = mid;
            }
        }

        System.out.println("Single element is: " + arr[low]);
    }

}
