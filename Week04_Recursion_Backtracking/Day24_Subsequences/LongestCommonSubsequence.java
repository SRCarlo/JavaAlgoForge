/**
 * Question:
 * Find the length of Longest Common Subsequence (LCS).
 *
 * Example:
 * Input  : s1 = "abcde", s2 = "ace"
 * Output : 3
 *
 * Algo:
 * - If characters match → 1 + recurse
 * - Else → max of skipping one char
 *
 * Explanation:
 * LCS keeps order but not necessarily continuous.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day24_Subsequences;

public class LongestCommonSubsequence {

    static int lcs(String s1, String s2, int i, int j) {

        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + lcs(s1, s2, i + 1, j + 1);
        } else {
            return Math.max(
                    lcs(s1, s2, i + 1, j),
                    lcs(s1, s2, i, j + 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(lcs("abcde", "ace", 0, 0));
    }

}
