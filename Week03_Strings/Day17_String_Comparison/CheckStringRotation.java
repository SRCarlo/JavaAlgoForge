/**
 * Problem Name: Check String Rotation
 * Difficulty: Easy
 *
 * Input:
 *  str1 = "abcd"
 *  str2 = "cdab"
 *
 * Output:
 *  Strings are rotations of each other
 *
 * Algorithm:
 * 1. Concatenate str1 with itself
 * 2. Check if str2 is substring of concatenated string
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day17_String_Comparison;

public class CheckStringRotation {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        // If lengths are different, cannot be rotation
        if (str1.length() != str2.length()) {
            System.out.println("Not Rotation Because String Not Match.");
            return;
        }

        // Concatenate string with itself
        String temp = str1 + str1;

        // Check if str2 exists inside temp
        if (temp.contains(str2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Not a rotation.");
        }
    }
}
