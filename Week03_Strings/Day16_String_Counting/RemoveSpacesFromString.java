/**
 * Problem Name: Remove Spaces from String
 * Source: String Cleaning
 * Difficulty: Easy
 *
 * Input:
 *  "Java is powerful"
 *
 * Output:
 *  Javaispowerful
 *
 * Algorithm:
 * 1. Traverse string
 * 2. Ignore space characters
 * 3. Append other characters
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day16_String_Counting;

public class RemoveSpacesFromString {
    public static void main(String[] args) {

        String str = "Java is powerful";
        String result = ""; // Result String
        // Loop through characters
        for (int i = 0; i < str.length(); i++) {

            // Add character only if it is not space
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("With Sapces : " + str);
        // Print final string
        System.out.println("Without spaces : " + result);
    }

}
