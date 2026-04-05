/*
 * Problem Name: Valid Palindrome
 *
 * input:
 * s = "A man, a plan, a canal: Panama"
 *
 * output:
 * true
 *
 * Example:
 * after removing symbols:
 * amanaplanacanalpanama
 *
 * same forward & backward
 *
 * Approach:
 *
 * ignore spaces and symbols
 *
 * use two pointers
 *
 * compare left and right characters
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day86_Strings_Revision;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
