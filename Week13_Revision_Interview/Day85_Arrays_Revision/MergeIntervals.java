/*
 * Problem Name: Merge Intervals
 *
 * input:
 * intervals =
 * [[1,3],[2,6],[8,10],[15,18]]
 *
 * output:
 * [[1,6],[8,10],[15,18]]
 *
 * Example:
 *
 * [1,3] and [2,6] overlap
 *
 * merged → [1,6]
 *
 * Approach:
 *
 * sort intervals
 *
 * check overlap
 *
 * merge if needed
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day85_Arrays_Revision;

import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        Arrays.sort(intervals,
                (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        result.add(current);

        for (int[] interval : intervals) {

            if (interval[0] <= current[1]) {

                current[1] = Math.max(current[1], interval[1]);

            } else {

                current = interval;

                result.add(current);
            }
        }

        for (int[] r : result) {

            System.out.println(r[0] + " " + r[1]);
        }
    }
}
