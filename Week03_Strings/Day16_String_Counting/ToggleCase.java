/**
 * Problem Name: Toggle Case of String
 * Source: ASCII Logic
 * Difficulty: Easy
 *
 * Input:
 *  "JaVa"
 *
 * Output:
 *  jAvA
 *
 * Algorithm:
 * 1. Traverse each character
 * 2. Convert uppercase to lowercase
 * 3. Convert lowercase to uppercase
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day16_String_Counting;

public class ToggleCase {
    public static void main(String[] args) {

        String str = "JaVa"; // Input string
        String result = "";// Result string

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII
                result = result + (char) (ch + 32);
            }
            // If character is lowercase
            else if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII
                result = result + (char) (ch - 32);
            }
        }
        // Print toggled string
        System.out.println("After toggle: " + result);
    }

}
