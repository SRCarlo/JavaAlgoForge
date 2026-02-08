package Week01_Basics_Logic.Week05_Sorting_Searching.Day30_Sorting_Advanced_Algorithms;

/*
 Question: Count Inversions in Array

 Example:
 Input  : [8, 4, 2, 1]
 Output : 6

 Explanation:
 Inversion = pair (i,j) where i<j and arr[i]>arr[j]

 Algo:
 - Use Merge Sort
 - While merging, count how many left elements are bigger

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

public class CountInversions_MergeSort {

    static int mergeAndCount(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;
        int invCount = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {

                // All remaining elements in left are inversions
                invCount += (mid - i + 1);

                temp[k++] = arr[j++];
            }
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        // Copy back
        for (int x = 0; x < temp.length; x++)
            arr[left + x] = temp[x];

        return invCount;
    }

    static int mergeSortAndCount(int[] arr, int left, int right) {

        int count = 0;

        if (left < right) {

            int mid = (left + right) / 2;

            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);

            count += mergeAndCount(arr, left, mid, right);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 4, 2, 1 };

        int inversions = mergeSortAndCount(arr, 0, arr.length - 1);

        System.out.println("Total Inversions: " + inversions);
    }
}