/**
 * Question:
 * Find the first non-repeating character in a string.
 *
 * Example:
 * Input  : "aabbcdde"
 * Output : c
 *
 * Explanation:
 * - Traverse string character by character.
 * - If indexOf and lastIndexOf are same,
 *   then character appears only once.
 * - First such character is the answer.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        // Loop for each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            // Count how many times character appears
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // If count is 1, it's non-repeating
            if (count == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
