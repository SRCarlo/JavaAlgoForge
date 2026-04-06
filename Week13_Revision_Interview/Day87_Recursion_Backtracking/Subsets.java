/*
 * Problem Name: Subsets (Power Set)
 *
 * input:
 * nums = [1,2,3]
 *
 * output:
 * [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]
 *
 * Example:
 *
 * choose OR not choose each element
 *
 * Approach:
 *
 * for each element:
 * we have 2 choices
 *
 * include
 * exclude
 *
 * recursion tree
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day87_Recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3 };

        backtrack(nums,
                0,
                new ArrayList<>());

        System.out.println(result);
    }

    static void backtrack(
            int[] nums,
            int index,
            List<Integer> curr) {

        result.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {

            curr.add(nums[i]);

            backtrack(nums, i + 1, curr);

            curr.remove(curr.size() - 1);
        }
    }
}
