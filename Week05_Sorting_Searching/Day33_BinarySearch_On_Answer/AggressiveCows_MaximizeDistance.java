/*
 Question: Aggressive Cows (Maximize Minimum Distance)

 Example:
 Input  : stalls = [1,2,4,8,9], cows = 3
 Output : 3

 Explanation:
 Place cows such that minimum distance is maximum.
 Best placement → 1,4,8 → min distance = 3

 Algo:
 - Sort stalls
 - Binary search on distance
 - Check if we can place cows with at least mid distance

 Time Complexity: O(n log(maxDistance))
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day33_BinarySearch_On_Answer;

import java.util.Arrays;

public class AggressiveCows_MaximizeDistance {

    public static void main(String[] args) {

        int[] stalls = { 1, 2, 4, 8, 9 };
        int cows = 3;

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];

        int answer = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                answer = mid;
                low = mid + 1; // try bigger distance
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Maximum Minimum Distance: " + answer);
    }

    static boolean canPlaceCows(int[] stalls, int cows, int dist) {

        int count = 1;
        int lastPlaced = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - lastPlaced >= dist) {
                count++;
                lastPlaced = stalls[i];
            }

            if (count == cows)
                return true;
        }

        return false;
    }
}
