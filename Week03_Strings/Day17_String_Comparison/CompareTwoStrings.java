/**
 * Problem Name: Compare Two Strings
 * Difficulty: Easy
 *
 * Input:
 *  str1 = "java"
 *  str2 = "java"
 *
 * Output:
 *  Strings are equal
 *
 * Algorithm:
 * 1. Use equals() method to compare content
 * 2. Do not use == (it compares references)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day17_String_Comparison;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        // equals() checks actual string content
        if (str1.equals(str2)) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal.");
        }

    }

}
