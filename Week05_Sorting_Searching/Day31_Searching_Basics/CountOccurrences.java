package Week01_Basics_Logic.Week05_Sorting_Searching.Day31_Searching_Basics;

/*
 Question: Count Occurrences of target in sorted array

 Example:
 Input  : arr = [1,2,2,2,3,4], target=2
 Output : 3

 Algo:
 - Count = (lastIndex - firstIndex + 1)

 Time Complexity: O(log n)
 Space Complexity: O(1)
*/

public class CountOccurrences {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 3, 4 };
        int target = 2;

        int first = -1, last = -1;

        // Find first occurrence
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Count result
        if (first == -1)
            System.out.println("Target not found");
        else
            System.out.println("Total Occurrences: " + (last - first + 1));
    }
}
