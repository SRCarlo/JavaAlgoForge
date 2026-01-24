/**
 * Question:
 * Check whether two strings are anagrams.
 *
 * Example:
 * Input  : "listen", "silent"
 * Output : Anagram
 *
 * Explanation:
 * - Use frequency array of size 26 (for a-z).
 * - Increase count for first string.
 * - Decrease count for second string.
 * - If all values become 0, strings are anagrams.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class CheckAnagram {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram = true;

        // If length differ, not anagram
        if (s1.length() != s2.length()) {
            isAnagram = false;
        }

        // Check character count
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            int count1 = 0;
            int count2 = 0;

            // Count First string
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch) {
                    count1++;
                }
            }

            // Count second String
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == ch) {
                    count2++;
                }
            }

            // If counts differ
            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram ? " String is Anagram. "
                : " String is Not Anagram.");
    }

}
