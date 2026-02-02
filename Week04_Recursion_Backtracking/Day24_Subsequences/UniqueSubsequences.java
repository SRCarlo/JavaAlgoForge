/**
 * Question:
 * Print unique subsequences of a string.
 *
 * Example:
 * Input  : "aa"
 * Output : "", "a", "aa"
 *
 * Algo:
 * - Use HashSet to avoid duplicates
 *
 * Explanation:
 * Duplicate characters create same subsequences.
 * HashSet stores only unique ones.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(2^n)
 */

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day24_Subsequences;

import java.util.HashSet;

public class UniqueSubsequences {

    static void find(String str, int index, String curr, HashSet<String> set) {

        if (index == str.length()) {
            set.add(curr);
            return;
        }

        find(str, index + 1, curr + str.charAt(index), set);
        find(str, index + 1, curr, set);
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        find("aa", 0, "", set);

        for (String s : set) {
            System.out.println(s);
        }
    }

}
