/**
 * Question: Find length of a string without using length()
 *
 * Example:
 * Input  : "Hello"
 * Output : 5
 *
 * Logic:
 * - Count characters using loop
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class StringLength {
    public static void main(String[] args) {

        String str = "Hello";
        int count = 0;

        // Convert string to char array and count characters
        for (char ch : str.toCharArray()) {
            count++;

        }
        System.out.println("Length is : " + count);
    }

}
