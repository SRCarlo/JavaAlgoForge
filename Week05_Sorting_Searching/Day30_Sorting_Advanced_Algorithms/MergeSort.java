package Week01_Basics_Logic.Week05_Sorting_Searching.Day30_Sorting_Advanced_Algorithms;

/*
 Question: Merge Sort

 Example:
 Input  : [5, 2, 9, 1, 6]
 Output : [1, 2, 5, 6, 9]

 Algo:
 - Divide array into 2 halves
 - Sort each half using recursion
 - Merge two sorted halves

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

public class MergeSort {

    // Merge two sorted parts
    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge arrays
        while (i < n1 && j < n2) {

            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        // Copy remaining elements
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Merge Sort function
    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 2, 9, 1, 6 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array(Merge Sort): ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
