/*
 * Problem Name: Two Sum (find index)
 *
 * input:
 * nums = [2,7,11,15]
 * target = 9
 *
 * output:
 * [0,1]
 *
 * Example:
 *
 * 2 + 7 = 9
 *
 * Approach:
 *
 * use hashmap
 *
 * store number and index
 *
 * check complement
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day91_Mock_Interview_Set;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };

        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {

                System.out.println(map.get(complement) + " " + i);

                return;
            }

            map.put(nums[i], i);
        }
    }
}
