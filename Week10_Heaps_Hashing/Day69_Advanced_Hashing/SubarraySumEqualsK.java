/*
 * Problem Name: Subarray Sum Equals K
 *
 * input:
 * nums = [1,1,1]
 * k = 2
 *
 * output:
 * 2
 *
 * Example:
 *
 * Subarrays:
 * [1,1] → sum = 2 ✔
 * [1,1] → sum = 2 ✔
 *
 * Total count = 2
 *
 * Approach:
 * 1. Use prefix sum + HashMap.
 * 2. Store (prefixSum → frequency).
 * 3. For each index:
 *      if (prefixSum - k) exists → add its frequency.
 * 4. Update map with current prefixSum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day69_Advanced_Hashing;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); // base case

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k))
                count += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}