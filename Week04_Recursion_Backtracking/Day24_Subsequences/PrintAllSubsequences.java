/**
 * Question:
 * Print all subsequences of a given string.
 *
 * Example:
 * Input  : "abc"
 * Output : "", "a", "b", "c", "ab", "ac", "bc", "abc"
 *
 * Algo:
 * - For each character, choose or not choose
 * - Recursively move to next index
 *
 * Explanation:
 * Each character has two choices:
 * 1. Include it
 * 2. Exclude it
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day24_Subsequences;

public class PrintAllSubsequences {

    static void printSubseq(String str, int index, String curr) {

        // Base case: reached end of string
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        // Include current character
        printSubseq(str, index + 1, curr + str.charAt(index));

        // Exclude current character
        printSubseq(str, index + 1, curr);
    }

    public static void main(String[] args) {
        printSubseq("abc", 0, "");
    }

}
