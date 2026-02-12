/*
 Question: Minimum Swaps Required to Sort Array

 Example:
 Input  : [4,3,2,1]
 Output : 2

 Explanation:
 Swap (4,1) → [1,3,2,4]
 Swap (3,2) → [1,2,3,4]

 Algo:
 - Store element + index
 - Sort array
 - Detect cycles
 - Cycle length - 1 = swaps

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day34_Sorting_Interview_Level_Problems;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwapsToSortArray {
    
     public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};
        int n = arr.length;

        int[][] pair = new int[n][2];

        // Store value and original index
        for (int i = 0; i < n; i++) {
            pair[i][0] = arr[i];
            pair[i][1] = i;
        }

        // Sort by value
        Arrays.sort(pair, Comparator.comparingInt(a -> a[0]));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Cycle detection
        for (int i = 0; i < n; i++) {

            if (visited[i] || pair[i][1] == i)
                continue;

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = pair[j][1];
                cycleSize++;
            }

            swaps += (cycleSize - 1);
        }

        System.out.println("Minimum Swaps Needed: " + swaps);
    }
}
