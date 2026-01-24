/**
 * Question: Check if a string is palindrome
 *
 * Example:
 * Input  : "madam"
 * Output : Palindrome
 *
 * Logic:
 * - Reverse string
 * - Compare original and reversed
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "madam";
        String reversed = "";

        // Reversed String
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Compare original and reversed
        if (str.equals(reversed)) {
            System.out.println(str + " String is Palindrome.");
        } else {
            System.out.println(str + " String is Not Palindrome.");
        }

    }

}
