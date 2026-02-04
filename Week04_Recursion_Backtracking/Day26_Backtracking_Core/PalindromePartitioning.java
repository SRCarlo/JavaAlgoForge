/*
 Que:
 Partition string so that each part is a palindrome.

 Example:
 Input  : "aab"
 Output :
 a a b
 aa b

 Algo:
 - Try all partitions
 - Check palindrome
 - Backtrack

 Explanation:
 Only continue recursion if substring is palindrome.

 Time Complexity: O(2^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day26_Backtracking_Core;

public class PalindromePartitioning {

    // Function to partition the string
    static void partition(String str, int index, String result) {

        // If we reached end of string, print result
        if (index == str.length()) {
            System.out.println(result);
            return;
        }

        // Try all possible substrings starting from index
        for (int i = index; i < str.length(); i++) {

            // Check if substring is palindrome
            if (isPalindrome(str, index, i)) {

                // If yes, take it and move forward
                partition(str, i + 1, result + str.substring(index, i + 1) + " ");
            }
        }
    }

    // Function to check palindrome
    static boolean isPalindrome(String s, int left, int right) {

        // Compare characters from both ends
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        partition("aab", 0, "");
    }

}
