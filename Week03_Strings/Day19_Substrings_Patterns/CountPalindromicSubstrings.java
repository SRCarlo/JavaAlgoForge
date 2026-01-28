/**
 * Problem: Count AND Print Palindromic Substrings
 *
 * Example:
 * Input  : "aaa"
 *
 * Palindromic Substrings:
 * a
 * aa
 * aaa
 * a
 * aa
 * a
 *
 * Output:
 * Total Palindromic Substrings: 6
 *
 * Logic:
 * - Generate all substrings using two loops
 * - Check palindrome using two pointers
 * - If palindrome → print it and count it
 *
 * Time Complexity: O(n^3)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day19_Substrings_Patterns;

public class CountPalindromicSubstrings {

    public static void main(String[] args) {

        String str = "aaa";
        int count = 0;
        System.out.println("Palindromic SubStrings : ");

        // Loop for starting index of substring
        for (int i = 0; i < str.length(); i++) {

            // Loop for ending index of substring
            for (int j = i; j < str.length(); j++) {

                int left = i;
                int right = j;
                boolean isPalindrome = true;

                // Check if substring is palindrome
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                // If substring is palindrome
                if (isPalindrome) {
                    // Print the palindromic substring
                    System.out.println(str.substring(i, j + 1));

                    // Increase count
                    count++;
                }
            }
        }

        // Print total count
        System.out.println("Total Palindromic Substrings: " + count);
    }

}
