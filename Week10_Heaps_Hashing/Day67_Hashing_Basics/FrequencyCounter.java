/*
 * Problem Name: Frequency Counter using HashMap
 *
 * input:
 * nums = [1,2,2,3,3,3,4]
 *
 * output:
 * 1 → 1
 * 2 → 2
 * 3 → 3
 * 4 → 1
 *
 * Example:
 *
 * Array:
 * 1 2 2 3 3 3 4
 *
 * Count frequency of each element
 *
 * Approach:
 * 1. Traverse array.
 * 2. Store frequency using HashMap.
 * 3. If element exists → increment count.
 * 4. Else → initialize with 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day67_Hashing_Basics;

import java.util.HashMap;

public class FrequencyCounter {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 3, 3, 4 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int key : map.keySet())
            System.out.println(key + " --> " + map.get(key));
    }
}
