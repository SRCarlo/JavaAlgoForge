/**
 * Problem: String Compression
 *
 * Example:
 * Input  : "aaabbc"
 * Output : "a3b2c1"
 *
 * Logic:
 * - Count consecutive characters
 * - Append character + count
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day20_String_Optimization;

public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbc";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= str.length(); i++) {

            // If same character, incease count
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }

            // If different, append result
            else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        System.out.println("Compressed String is : " + result);
    }
}
