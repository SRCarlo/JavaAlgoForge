/*
 Question: Find Peak Element

 Example:
 Input  : [1,2,3,1]
 Output : Peak Index = 2 (value = 3)

 Algo:
 - If mid < mid+1 → peak is on right
 - Else peak is on left

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day32_BinarySearch_Interview_Patterns;

public class PeakElementInArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1 };
        int low = 0, high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Peak Element Index : " + low);
        System.out.println("Peak Element Value : " + arr[low]);
    }

}
