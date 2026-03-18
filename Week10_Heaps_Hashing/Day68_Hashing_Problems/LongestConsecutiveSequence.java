/*
 * Problem Name: Longest Consecutive Sequence
 *
 * input:
 * nums = [100,4,200,1,3,2]
 *
 * output:
 * 4
 *
 * Example:
 *
 * Array:
 * 100 4 200 1 3 2
 *
 * Longest consecutive sequence:
 * 1 2 3 4 → length = 4
 *
 * Approach:
 * 1. Store all elements in HashSet.
 * 2. For each number check if it is start of sequence:
 *      (num - 1 not present)
 * 3. If yes → count forward sequence.
 * 4. Track maximum length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day68_Hashing_Problems;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        int maxLength = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) { // start of sequence

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println(maxLength);
    }
}
