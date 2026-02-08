package Week01_Basics_Logic.Week05_Sorting_Searching.Day30_Sorting_Advanced_Algorithms;

/*
 Question: Sort Colors (Dutch National Flag)

 Example:
 Input  : [2, 0, 2, 1, 1, 0]
 Output : [0, 0, 1, 1, 2, 2]

 Algo:
 - Use 3 pointers: low, mid, high
 - Move 0 to left, 2 to right

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class SortColors_DutchNationalFlag {

    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                // Swap with low
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {

                mid++;

            } else {

                // Swap with high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.print("Sorted Colors : ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
