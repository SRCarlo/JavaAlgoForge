/*
 * Problem Name: Longest Substring Without Repeating Characters
 *
 * input:
 * s = "abcabcbb"
 *
 * output:
 * 3
 *
 * Example:
 * substring:
 * abc
 *
 * length = 3
 *
 * Approach:
 *
 * sliding window
 *
 * use set
 *
 * remove duplicate characters
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day86_Strings_Revision;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;

        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));

                left++;
            }

            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        System.out.println(max);
    }
}
