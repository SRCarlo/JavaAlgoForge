/*
 * Problem Name: Container With Most Water
 *
 * input:
 * height = [1,8,6,2,5,4,8,3,7]
 *
 * output:
 * 49
 *
 * Example:
 *
 * max water between lines
 *
 * Approach:
 *
 * two pointer
 *
 * move smaller height
 *
 * calculate max area
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day91_Mock_Interview_Set;

public class ContainerWithMostWater {

        public static void main(String[] args) {

                int[] h = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

                int left = 0;

                int right = h.length - 1;

                int max = 0;

                while (left < right) {

                        int area = Math.min(h[left], h[right]) * (right - left);

                        max = Math.max(max, area);

                        if (h[left] < h[right])
                                left++;
                        else
                                right--;
                }

                System.out.println(max);
        }
}
