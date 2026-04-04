/*
 * Problem Name: Two Sum
 *
 * input:
 * arr = [2,7,11,15]
 * target = 9
 *
 * output:
 * [0,1]
 *
 * Example:
 * 2 + 7 = 9
 *
 * Approach:
 * store number in hashmap
 *
 * check:
 * target - current element exists?
 *
 * if yes → answer found
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day85_Arrays_Revision;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if (map.containsKey(need)) {

                System.out.println(map.get(need) + " " + i);
            }

            map.put(arr[i], i);
        }
    }
}
