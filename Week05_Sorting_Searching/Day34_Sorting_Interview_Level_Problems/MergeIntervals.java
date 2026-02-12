/*
 Question: Merge Overlapping Intervals

 Example:
 Input  : [[1,3],[2,6],[8,10],[15,18]]
 Output : [[1,6],[8,10],[15,18]]

 Explanation:
 Intervals [1,3] and [2,6] overlap → merge into [1,6]

 Algo:
 - Sort intervals by starting time
 - Compare current interval with last merged interval
 - If overlap → merge
 - Else → add new interval

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day34_Sorting_Interview_Level_Problems;

import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            // If list is empty OR no overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            }
            // Overlap → merge
            else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        System.out.println("Merged Intervals:");
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}