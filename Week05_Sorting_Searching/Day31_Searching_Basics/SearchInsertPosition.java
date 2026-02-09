/*
 Question: Search Insert Position

 Example:
 Input  : arr=[1,3,5,6], target=2
 Output : 1

 Explanation:
 Target not found, but should be inserted at index 1

 Algo:
 - Binary search for correct position

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day31_Searching_Basics;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };
        int target = 2;

        int low = 0, high = arr.length - 1;
        int pos = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                pos = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Insert Position is : " + pos);
    }

}
