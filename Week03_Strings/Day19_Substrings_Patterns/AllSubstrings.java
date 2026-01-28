/**
 * Problem: Print All Substrings of a String
 *
 * Example:
 * Input : "abc"
 * Output:
 * a
 * ab
 * abc
 * b
 * bc
 * c
 *
 * Logic:
 * - Fix starting index (i)
 * - Fix ending index (j)
 * - Extract substring from i to j
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day19_Substrings_Patterns;

public class AllSubstrings {

    public static void main(String[] args) {

        String str = "abc";

        // Outer loop decides starting point
        for (int i = 0; i < str.length(); i++) {

            // Inner loop decides ending point
            for (int j = i + 1; j <= str.length(); j++) {

                // Print substring from index i to j-1
                System.out.println(str.substring(i, j));
            }
        }
    }

}
