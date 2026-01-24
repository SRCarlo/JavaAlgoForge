/**
 * Question:
 * Count how many times a substring occurs in a string.
 *
 * Example:
 * Input  : "abababab", sub = "ab"
 * Output : 4
 *
 * Explanation:
 * - Move window of substring length over main string.
 * - Compare substring at each position.
 * - Increase count when match is found.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class CountSubstringOccurrences {
    public static void main(String[] args) {

        String text = "abababab";
        String sub = "ab";

        int count = countOccurrence(text, sub);
        System.out.println("Occurrences is : " + count);
    }

    // Method to count subString occurrences
    public static int countOccurrence(String text, String sub) {
        int count = 0;
        int index = 0;

        // Loop until subString is found
        while ((index = text.indexOf(sub, index)) != -1) {
            // Increase Count
            count++;

            // Move index forward to avoid infinite loop
            index = index + sub.length();
        }
        return count;
    }

}
