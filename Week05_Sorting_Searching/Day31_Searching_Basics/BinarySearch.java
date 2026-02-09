/*
 Question: Binary Search

 Example:
 Input  : arr = [2,4,6,8,10], target = 8
 Output : Index = 3

 Algo:
 - Search only in sorted array
 - Take mid element
 - If mid == target → found
 - If target smaller → go left
 - If target bigger → go right

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day31_Searching_Basics;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int target = 8;

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            }

            else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Target found at index : " + ans);
    }

}
