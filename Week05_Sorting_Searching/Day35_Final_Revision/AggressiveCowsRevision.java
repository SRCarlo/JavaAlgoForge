/*
 Question: Aggressive Cows (Binary Search on Answer)

 Example:
 Input  : stalls = [1,2,4,8,9], cows = 3
 Output : 3

 Explanation:
 Place cows so that minimum distance is maximum.

 Algo:
 - Sort stalls
 - Binary search on distance
 - Check if cows can be placed with at least mid distance

 Time Complexity: O(n log(maxDistance))
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day35_Final_Revision;

import java.util.Arrays;

public class AggressiveCowsRevision {

    public static void main(String[] args) {

        int[] stalls = { 1, 2, 4, 8, 9 };
        int cows = 3;

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];

        int answer = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canPlace(stalls, cows, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Maximum minimum distance is : " + answer);
    }

    static boolean canPlace(int[] stalls, int cows, int dist) {

        int count = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - last >= dist) {
                count++;
                last = stalls[i];
            }

            if (count == cows)
                return true;
        }

        return false;
    }
}
