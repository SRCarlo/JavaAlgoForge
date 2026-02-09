/*
 Question: Find Peak Element

 Peak Element:
 An element greater than its neighbors

 Example:
 Input  : [1,2,3,1]
 Output : Index = 2 (element = 3)

 Algo:
 - Use Binary Search
 - If mid < mid+1 → peak is right side
 - Else peak is left side

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day31_Searching_Basics;

public class PeakElementInArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1 };

        int low = 0, high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // peak is right
            } else {
                high = mid; // peak is left or mid
            }
        }

        System.out.println("Peak Element Index: " + low);
        System.out.println("Peak Element Value: " + arr[low]);
    }
}