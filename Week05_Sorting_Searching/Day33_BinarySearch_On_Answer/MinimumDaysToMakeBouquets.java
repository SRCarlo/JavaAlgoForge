/*
 Question: Minimum Days to Make M Bouquets

 Example:
 Input  : bloomDay = [1,10,3,10,2], m=3, k=1
 Output : 3

 Explanation:
 Need 3 bouquets, each requires 1 flower.
 By day 3 → flowers bloomed: [1,3,2] → 3 bouquets possible

 Algo:
 - Binary search on days
 - Check if bouquets can be made in mid days

 Time Complexity: O(n log(maxDay))
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day33_BinarySearch_On_Answer;

public class MinimumDaysToMakeBouquets {

    public static void main(String[] args) {

        int[] bloomDay = { 1, 10, 3, 10, 2 };
        int m = 3, k = 1;

        int low = 1, high = 10;

        int answer = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum Days Required: " + answer);
    }

    static boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}
