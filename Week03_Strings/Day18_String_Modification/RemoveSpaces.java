/**
 * Problem Name: Remove Spaces from String
 *
 * Input:
 *  "I love Java"
 *
 * Output:
 *  "IloveJava"
 *
 * Algorithm:
 * 1. Traverse each character
 * 2. Append only non-space characters
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day18_String_Modification;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "I love Java";
        String result = "";

        // Traverse string character by character
        for (int i = 0; i < str.length(); i++) {

            // Add character only if it is not a space
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        System.out.println("Result is : " + result);
    }

}
