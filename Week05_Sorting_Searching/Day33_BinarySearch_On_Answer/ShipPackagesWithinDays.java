/*
 Question: Ship Packages Within D Days

 Example:
 Input  : weights = [1,2,3,4,5,6,7,8,9,10], days = 5
 Output : 15

 Algo:
 - Minimum capacity = max weight
 - Maximum capacity = sum of weights
 - Binary search capacity
 - Check if shipping possible within days

 Time Complexity: O(n log(sum))
 Space Complexity: O(1)
*/
package Week01_Basics_Logic.Week05_Sorting_Searching.Day33_BinarySearch_On_Answer;

public class ShipPackagesWithinDays {

    public static void main(String[] args) {

        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        int answer = high;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canShip(weights, days, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum Ship Capacity: " + answer);
    }

    static boolean canShip(int[] weights, int days, int capacity) {

        int requiredDays = 1;
        int load = 0;

        for (int w : weights) {

            if (load + w > capacity) {
                requiredDays++;
                load = w;

                if (requiredDays > days)
                    return false;
            } else {
                load += w;
            }
        }

        return true;
    }
}
