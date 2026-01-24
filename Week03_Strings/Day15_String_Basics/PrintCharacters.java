/**
 * Question: Print all characters of a string
 *
 * Example:
 * Input  : "Java"
 * Output : J a v a
 *
 * Logic:
 * - Traverse string using loop
 * - Print each character using charAt()
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class PrintCharacters {

    public static void main(String[] args) {

        String str = "Java";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            // Print character at index i
            System.out.print(str.charAt(i) + " ");
        }
    }

}
