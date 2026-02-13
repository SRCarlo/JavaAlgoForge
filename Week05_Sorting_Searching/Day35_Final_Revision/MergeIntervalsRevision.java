/*
 Question: Merge Overlapping Intervals

 Example:
 Input  : [[1,3],[2,6],[8,10],[15,18]]
 Output : [[1,6],[8,10],[15,18]]

 Algo:
 - Sort by start time
 - Merge if intervals overlap

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day35_Final_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsRevision {

    public static void main(String[] args) {

        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            if (result.isEmpty() ||
                    result.get(result.size() - 1)[1] < interval[0]) {

                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        System.out.println("Merged Intervals:");
        for (int[] arr : result)
            System.out.println(Arrays.toString(arr));
    }
}
