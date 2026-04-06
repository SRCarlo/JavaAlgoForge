/*
 * Problem Name: Permutations
 *
 * input:
 * nums = [1,2,3]
 *
 * output:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 *
 * Example:
 *
 * order matters
 *
 * Approach:
 *
 * try every element
 * mark visited
 *
 * build permutation
 *
 * Time Complexity: O(n!)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day87_Recursion_Backtracking;

import java.util.List;
import java.util.ArrayList;

public class Permutations {

    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3 };

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>());

        System.out.println(result);
    }

    static void backtrack(int[] nums, boolean[] used, List<Integer> curr) {

        if (curr.size() == nums.length) {

            result.add(new ArrayList<>(curr));

            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i])
                continue;

            used[i] = true;

            curr.add(nums[i]);

            backtrack(nums, used, curr);

            curr.remove(curr.size() - 1);

            used[i] = false;
        }
    }
}
