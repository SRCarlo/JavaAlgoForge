/*
 * Problem Name: Majority Element
 *
 * input:
 * nums = [2,2,1,1,1,2,2]
 *
 * output:
 * 2
 *
 * Example:
 *
 * element appears more than n/2 times
 *
 * Approach:
 *
 * Boyer Moore Voting
 *
 * cancel different elements
 *
 * majority remains
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day91_Mock_Interview_Set;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        int count = 0;

        int candidate = 0;

        for (int num : nums) {

            if (count == 0)
                candidate = num;

            if (num == candidate)
                count++;
            else
                count--;
        }

        System.out.println(candidate);
    }
}