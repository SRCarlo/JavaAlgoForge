/*
 Question: Find Kth Missing Positive Number

 Example:
 Input  : arr = [2,3,4,7,11], k = 5
 Output : 9

 Missing numbers are: 1,5,6,8,9...

 Algo:
 - Missing count till index i:
   missing = arr[i] - (i+1)
 - Use Binary Search to find first index where missing >= k

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day32_BinarySearch_Interview_Patterns;

public class FindKthMissingPositive {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Final answer formula
        int result = low + k;

        System.out.println("Kth missing number is: " + result);
    }

}
