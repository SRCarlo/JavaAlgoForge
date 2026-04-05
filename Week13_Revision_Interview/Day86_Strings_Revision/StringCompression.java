/*
 * Problem Name: String Compression
 *
 * input:
 * s = "aaabbc"
 *
 * output:
 * a3b2c1
 *
 * Example:
 *
 * a repeated 3 times
 * b repeated 2 times
 *
 * Approach:
 *
 * count consecutive characters
 *
 * print character + count
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day86_Strings_Revision;

public class StringCompression {

    public static void main(String[] args) {

        String s = "aaabbc";

        String result = "";

        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {

                count++;

            } else {

                result += s.charAt(i - 1) + "" + count;

                count = 1;
            }
        }

        result += s.charAt(s.length() - 1) + "" + count;

        System.out.println(result);
    }
}