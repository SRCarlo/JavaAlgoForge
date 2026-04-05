/*
 * Problem Name: Minimum Window Substring
 *
 * input:
 * s = "ADOBECODEBANC"
 * t = "ABC"
 *
 * output:
 * BANC
 *
 * Example:
 *
 * smallest substring
 * containing A B C
 *
 * Approach:
 *
 * sliding window
 *
 * expand window
 *
 * when valid
 * shrink window
 *
 * keep minimum length
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day86_Strings_Revision;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";

        String t = "ABC";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = map.size();

        int minLen = Integer.MAX_VALUE;

        String result = "";

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {

                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0)
                    count--;
            }

            while (count == 0) {

                if (right - left + 1 < minLen) {

                    minLen = right - left + 1;

                    result = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0)
                        count++;
                }

                left++;
            }
        }

        System.out.println(result);
    }
}