/**
 * Question:
 * Remove duplicate characters from a string.
 *
 * Example:
 * Input  : "programming"
 * Output : "progamin"
 *
 * Explanation:
 * - Traverse each character of the string.
 * - If the character is not already present in result string,
 *   add it.
 * - This keeps only the first occurrence of each character.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";
        String result = "";

        // Go through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            boolean isDuplicate = false;

            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {

                if (result.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to result
            if (isDuplicate == false) {
                result = result + ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
