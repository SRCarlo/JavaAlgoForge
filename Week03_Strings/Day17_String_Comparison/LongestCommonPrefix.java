/**
 * Problem Name: Longest Common Prefix
 * Difficulty: Easy
 *
 * Input:
 *  ["flower", "flow", "flight"]
 *
 * Output:
 *  "fl"
 *
 * Algorithm:
 * 1. Take first string as reference
 * 2. Compare characters with other strings
 * 3. Stop when mismatch occurs
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day17_String_Comparison;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] words = { "flower", "flow", "flight" };
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            int j = 0;

            // Compare Characters
            while (j < prefix.length() && j < words[i].length()
                    && prefix.charAt(j) == words[i].charAt(j)) {
                j++;
            }

            // Reduce prefix
            prefix = prefix.substring(0, j);
        }
        System.out.println("Longest Common Prefix is : " + prefix);
    }

}
