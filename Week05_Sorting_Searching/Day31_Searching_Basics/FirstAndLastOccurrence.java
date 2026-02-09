/*
 Question: Find First and Last Occurrence of a number

 Example:
 Input  : arr = [2,4,4,4,6,8], target = 4
 Output : First = 1, Last = 3

 Algo:
 - Use Binary Search twice:
   1) For first occurrence
   2) For last occurrence

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day31_Searching_Basics;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 4, 4, 6, 8 };
        int target = 4;

        int first = -1, last = -1;

        // -------- First Occurrence --------
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // move left for first
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // -------- Last Occurrence --------
        low = 0;
        high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // move right for last
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence : " + last);
    }
}
