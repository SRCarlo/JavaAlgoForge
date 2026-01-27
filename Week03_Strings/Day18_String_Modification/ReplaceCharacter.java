/**
 * Problem Name: Replace Character in String
 *
 * Input:
 *  "banana", replace 'a' with 'o'
 *
 * Output:
 *  "bonono"
 *
 * Algorithm:
 * 1. Traverse string
 * 2. Replace matching character
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day18_String_Modification;

public class ReplaceCharacter {

    public static void main(String[] args) {

        String str = "banana";
        char oldChar = 'a';
        char newChar = 'o';

        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result = result + newChar;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println("Result is : " + result);
    }
}
