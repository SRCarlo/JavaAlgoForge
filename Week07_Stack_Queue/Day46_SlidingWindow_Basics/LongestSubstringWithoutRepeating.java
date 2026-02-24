/*
 * Question:
 * Find length of longest substring without repeating characters.
 *
 * Example:
 * Input: "abcabcbb"
 * Output: 3 ("abc")
 *
 * Algorithm:
 * 1. Use HashSet
 * 2. Expand window
 * 3. If duplicate → shrink window
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day46_SlidingWindow_Basics;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String s = "abcabcbb";

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Length is : " + maxLength);
    }
}
