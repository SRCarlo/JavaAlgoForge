/*
 Question: Binary Search (Most Basic Interview Question)

 Example:
 Input  : arr = [2,4,6,8,10], target = 6
 Output : Index = 2

 Algo:
 - Works only on sorted array
 - Find mid
 - If target == mid → found
 - If target smaller → search left
 - If target bigger → search right

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day35_Final_Revision;

public class SearchInRotatedArrayRevision {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            }

            // Left half sorted
            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {

                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Target index is : " + ans);
    }
}
