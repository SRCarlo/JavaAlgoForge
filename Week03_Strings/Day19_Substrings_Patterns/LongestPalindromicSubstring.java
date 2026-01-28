/**
 * Problem: Find Longest Palindromic Substring
 *
 * Example:
 * Input  : "babad"
 * Output : "bab"
 *
 * Logic:
 * - Generate all substrings
 * - Check palindrome
 * - Store the longest one
 *
 * Time Complexity: O(n^3)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day19_Substrings_Patterns;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "babad";
        String longest = "";

        // Generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                int left = i;
                int right = j;
                boolean isPalindrome = true;

                // Palindrome check
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                // Update longest palindrome
                if (isPalindrome && (j - i + 1) > longest.length()) {
                    longest = str.substring(i, j + 1);
                }
            }
        }

        System.out.println("Longest Palindrome Substring : " + longest);

    }

}
