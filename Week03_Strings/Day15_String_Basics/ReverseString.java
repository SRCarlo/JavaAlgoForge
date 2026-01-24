/**
 * Question: Reverse a string
 *
 * Example:
 * Input  : "Java"
 * Output : "avaJ"
 *
 * Logic:
 * - Traverse string from end to start
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java";
        String reversed = "";

        // Loop from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {

            // Append character to reversed string
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed String is : " + reversed);
    }

}
