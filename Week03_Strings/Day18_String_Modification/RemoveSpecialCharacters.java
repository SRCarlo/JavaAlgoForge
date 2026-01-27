/**
 * Problem Name: Remove Special Characters
 *
 * Input:
 *  "Ja@va#123!"
 *
 * Output:
 *  "Java123"
 *
 * Algorithm:
 * 1. Traverse each character
 * 2. Keep only letters and digits
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day18_String_Modification;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str = "Ja@va#123!";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character is letter or digit
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9')) {
                result = result + ch;
            }
        }
        System.out.println("Result is : " + result);
    }

}
