/*
 * Problem Name: Product of Array Except Self
 *
 * input:
 * nums = [1,2,3,4]
 *
 * output:
 * [24,12,8,6]
 *
 * Example:
 *
 * multiply all elements
 * except itself
 *
 * Approach:
 *
 * prefix product
 *
 * suffix product
 *
 * multiply both
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day91_Mock_Interview_Set;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4 };

        int n = nums.length;

        int[] result = new int[n];

        result[0] = 1;

        for (int i = 1; i < n; i++) {

            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= suffix;

            suffix *= nums[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
