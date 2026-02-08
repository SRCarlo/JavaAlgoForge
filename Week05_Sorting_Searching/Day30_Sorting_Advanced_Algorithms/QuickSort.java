package Week01_Basics_Logic.Week05_Sorting_Searching.Day30_Sorting_Advanced_Algorithms;

/*
 Question: Quick Sort

 Example:
 Input  : [10, 7, 8, 9, 1, 5]
 Output : [1, 5, 7, 8, 9, 10]

 Algo:
 - Choose pivot element
 - Place pivot in correct position
 - Recursively sort left and right parts

 Time Complexity: O(n log n) average
 Space Complexity: O(log n)
*/

public class QuickSort {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot correctly
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 7, 8, 9, 1, 5 };

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array(Quick Sort): ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
