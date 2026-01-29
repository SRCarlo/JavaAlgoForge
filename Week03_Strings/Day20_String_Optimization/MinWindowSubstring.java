/**
 * Problem: Minimum Window Substring
 *
 * Example:
 * Input  : s = "ADOBECODEBANC", t = "ABC"
 * Output : "BANC"
 *
 * Logic:
 * - Use frequency array
 * - Expand window until all chars found
 * - Shrink window to minimum size
 *
 * Time Complexity: O(n)
 * Space Complexity: O(256)
 */

package Week01_Basics_Logic.Week03_Strings.Day20_String_Optimization;

public class MinWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        int[] freq = new int[256];

        // Store frequency of character in t
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {

            // Decrease count if character is needed
            if (freq[s.charAt(right)]-- > 0) {
                count--;
            }

            // When all Character are found
            while (count == 0) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Shrink window
                if (freq[s.charAt(left)]++ == 0) {
                    count++;
                }
                left++;
            }
        }
        System.out.println(minLen == Integer.MAX_VALUE ? " No Window Found " : s.substring(start, start + minLen));
    }
}
