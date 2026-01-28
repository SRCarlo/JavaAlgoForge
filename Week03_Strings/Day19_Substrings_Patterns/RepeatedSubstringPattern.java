/**
 * Problem: Check if String is Made by Repeating a Substring
 *
 * Example:
 * Input  : "abab"
 * Output : true
 *
 * Logic:
 * - Take possible substring from start
 * - Repeat it until length matches original string
 * - Compare with original
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day19_Substrings_Patterns;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {

        String s = "abab";
        boolean isRepeated = false;

        // Try all possible substring lengths
        for (int len = 1; len <= s.length() / 2; len++) {

            // Take substring from start
            String part = s.substring(0, len);
            String temp = "";

            // Repeat substring until same length as original
            while (temp.length() < s.length()) {
                temp = temp + part;
            }

            // Compare with original string
            if (temp.equals(s)) {
                isRepeated = true;
                break;
            }
        }

        System.out.println("Repeated Substring Pattern: " + isRepeated);
    }

}
