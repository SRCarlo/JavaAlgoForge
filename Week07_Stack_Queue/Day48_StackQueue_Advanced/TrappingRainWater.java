/*
 * Question:
 * Given elevation map, calculate trapped rain water.
 *
 * Example:
 * Input: [4,2,0,3,2,5]
 * Output: 9
 *
 * Idea:
 * Water at index i =
 * min(leftMax, rightMax) - height[i]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day48_StackQueue_Advanced;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = { 4, 2, 0, 3, 2, 5 };

        System.out.println("Water Trapped: " + trap(height));
    }

    static int trap(int[] height) {

        int n = height.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);

        int water = 0;

        for (int i = 0; i < n; i++)
            water += Math.min(leftMax[i], rightMax[i]) - height[i];

        return water;
    }
}
