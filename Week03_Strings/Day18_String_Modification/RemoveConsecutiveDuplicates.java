/**
 * Problem Name: Remove Consecutive Duplicate Characters
 *
 * Input:
 *  "aaabbccdaa"
 *
 * Output:
 *  "abcda"
 *
 * Explanation (Beginner Friendly):
 * - If same character comes again immediately, remove it
 * - Keep only the first occurrence in a sequence
 *
 * Algorithm:
 * 1. Take first character as result
 * 2. Traverse string from second character
 * 3. Add character only if it is different from previous one
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day18_String_Modification;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {

        String str = "aaabbbccdaa";

        // If string is empty, nothing to process
        if (str.length() == 0) {
            System.out.println("");
            return;
        }

        // Store first character
        String result = "" + str.charAt(0);

        // Traverse from second character
        for (int i = 1; i < str.length(); i++) {

            // Compare current character with previous one
            if (str.charAt(i) != str.charAt(i - 1)) {
                result = result + str.charAt(i);
            }
        }
        System.out.println("Before Remove Consecutive Duplicates : " + str);
        System.out.println("After Remove Consecutive Duplicates : " + result);
    }

}
