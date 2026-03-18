/*
 * Problem Name: Two Sum
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
 * nums:
 * index → value
 * 0 → 2
 * 1 → 7
 * 2 → 11
 * 3 → 15
 *
 * 2 + 7 = 9 ✔
 *
 * Output: indices [0,1]
 *
 * Approach:
 * 1. Use HashMap to store value → index.
 * 2. For each element check if (target - num) exists.
 * 3. If exists → return indices.
 * 4. Else store current element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day68_Hashing_Problems;

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
