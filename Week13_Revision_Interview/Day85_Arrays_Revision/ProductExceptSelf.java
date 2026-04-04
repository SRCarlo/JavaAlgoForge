/*
 * Problem Name: Product of Array Except Self
 *
 * input:
 * arr = [1,2,3,4]
 *
 * output:
 * [24,12,8,6]
 *
 * Example:
 *
 * index 0:
 * 2*3*4 = 24
 *
 * index 1:
 * 1*3*4 = 12
 *
 * Approach:
 *
 * prefix product
 * suffix product
 *
 * multiply both
 *
 * without using division
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day85_Arrays_Revision;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        int n = arr.length;

        int[] result = new int[n];

        int prefix = 1;

        for (int i = 0; i < n; i++) {

            result[i] = prefix;

            prefix *= arr[i];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= suffix;

            suffix *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
