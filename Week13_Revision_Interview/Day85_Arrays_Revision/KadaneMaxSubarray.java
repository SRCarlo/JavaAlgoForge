/*
 * Problem Name: Maximum Subarray Sum (Kadane Algorithm)
 *
 * input:
 * arr = [-2,1,-3,4,-1,2,1,-5,4]
 *
 * output:
 * 6
 *
 * Example:
 * subarray:
 * [4,-1,2,1]
 *
 * sum = 6
 *
 * Approach:
 * keep adding numbers
 *
 * if sum < 0
 * reset sum
 *
 * track max sum
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day85_Arrays_Revision;

public class KadaneMaxSubarray {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int sum = 0;

        int max = Integer.MIN_VALUE;

        for (int num : arr) {

            sum += num;

            max = Math.max(max, sum);

            if (sum < 0)
                sum = 0;
        }

        System.out.println(max);
    }
}