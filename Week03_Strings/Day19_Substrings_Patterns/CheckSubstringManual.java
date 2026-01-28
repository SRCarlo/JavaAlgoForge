/**
 * Problem: Check Substring Without Using contains()
 *
 * Example:
 * Text    : "hello world"
 * Pattern : "world"
 * Output  : Substring Found
 *
 * Logic:
 * - Match pattern character by character
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day19_Substrings_Patterns;

public class CheckSubstringManual {
    public static void main(String[] args) {

        String text = "hello world";
        String pattern = "world";
        boolean found = false;

        // Loop through text
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j = 0;

            // Match character of pattern
            while (j < pattern.length()
                    && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            // If all characters matched
            if (j == pattern.length()) {
                found = true;
                break;
            }

        }
        
        System.out.println(found ? "Substring Found." : "Substring Not Found.");
    }
}
