/*
 * Problem Name: Combination Sum
 *
 * input:
 * nums = [2,3,6,7]
 * target = 7
 *
 * output:
 * [[2,2,3],[7]]
 *
 * Example:
 *
 * 2+2+3 = 7
 * 7 = 7
 *
 * Approach:
 *
 * choose same number multiple times
 *
 * reduce target
 *
 * when target == 0
 * answer found
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day87_Recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        int[] nums = { 2, 3, 6, 7 };

        int target = 7;

        backtrack(nums, target, 0, new ArrayList<>());

        System.out.println(result);
    }

    static void backtrack(int[] nums, int target, int index, List<Integer> curr) {

        if (target == 0) {

            result.add(new ArrayList<>(curr));

            return;
        }

        if (target < 0)
            return;

        for (int i = index; i < nums.length; i++) {

            curr.add(nums[i]);

            backtrack(nums, target - nums[i], i, curr);

            curr.remove(curr.size() - 1);
        }
    }
}
