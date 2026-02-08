package Week01_Basics_Logic.Week05_Sorting_Searching.Day30_Sorting_Advanced_Algorithms;

/*
 Question: Find Kth Largest Element

 Example:
 Input  : [3,2,1,5,6,4], k=2
 Output : 5

 Algo:
 - Use QuickSelect (like QuickSort partition)
 - Pivot gives correct position
 - Search only one side

 Time Complexity: O(n) average
 Space Complexity: O(1)
*/

public class KthLargestElement_QuickSelect {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {

            if (arr[j] > pivot) { // for kth largest

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        int low = 0, high = arr.length - 1;
        int target = k - 1;

        while (low <= high) {

            int pi = partition(arr, low, high);

            if (pi == target) {
                System.out.println("Kth Largest Element: " + arr[pi]);
                break;
            } else if (pi < target) {
                low = pi + 1;
            } else {
                high = pi - 1;
            }
        }
    }
}
