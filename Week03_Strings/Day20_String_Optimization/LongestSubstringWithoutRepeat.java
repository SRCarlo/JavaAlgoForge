/**
 * Problem: Longest Substring Without Repeating Characters
 *
 * Example:
 * Input  : "abcabcbb"
 * Output : 3  ("abc")
 *
 * Logic (Sliding Window):
 * - Use boolean array to track characters
 * - Expand window using right pointer
 * - Shrink window if character repeats
 *
 * Time Complexity: O(n)
 * Space Complexity: O(256)
 */

package Week01_Basics_Logic.Week03_Strings.Day20_String_Optimization;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {

        String str = "abcabcbb";
        boolean[] visited = new boolean[256];

        int left = 0, right = 0, maxLength = 0;

        while (right < str.length()) {

            // If character not visited, expand window
            if (!visited[str.charAt(right)]) {
                visited[str.charAt(right)] = true;
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }

            // If repeated, shrink window
            else {
                visited[str.charAt(left)] = false;
                left++;
            }
        }
        System.out.println("Longest Length is : " + maxLength);
    }

}
