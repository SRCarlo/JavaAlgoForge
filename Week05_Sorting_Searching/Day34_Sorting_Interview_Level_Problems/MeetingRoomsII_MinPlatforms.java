/*
 Question: Minimum Platforms / Meeting Rooms II

 Example:
 Input:
 Arrivals  = [900, 940, 950, 1100, 1500, 1800]
 Departures= [910, 1200, 1120, 1130, 1900, 2000]

 Output: 3

 Explanation:
 Need minimum 3 platforms so no train waits.

 Algo:
 - Sort arrival and departure arrays
 - Use two pointers
 - If arrival <= departure → need new platform
 - Else train leaves → reduce platform count

 Time Complexity: O(n log n)
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day34_Sorting_Interview_Level_Problems;

import java.util.Arrays;

public class MeetingRoomsII_MinPlatforms {

    public static void main(String[] args) {

        int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
        int[] departure = { 910, 1200, 1120, 1130, 1900, 2000 };

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 1, maxPlatforms = 1;
        int i = 1, j = 0;

        while (i < arrival.length && j < departure.length) {

            if (arrival[i] <= departure[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        System.out.println("Minimum Platforms Needed : " + maxPlatforms);
    }
}
