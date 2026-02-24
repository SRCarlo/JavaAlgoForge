/*
 * Question:
 * Find maximum sum of subarray of size K.
 *
 * Example:
 * Input: arr = [2,1,5,1,3,2], k = 3
 * Output: 9  (5+1+3)
 *
 * Algorithm:
 * 1. Calculate sum of first k elements
 * 2. Slide window:
 *    Remove left element
 *    Add right element
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day46_SlidingWindow_Basics;

public class MaximumSumSubarrayOfSizeK {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int maxSum = 0;
        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide window
        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Maximum Sum is : " + maxSum);
    }
}