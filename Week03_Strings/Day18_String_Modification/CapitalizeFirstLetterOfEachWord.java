/**
 * Problem Name: Capitalize First Letter of Each Word
 *
 * Input:
 *  "i love java programming"
 *
 * Output:
 *  "I Love Java Programming"
 *
 * Explanation (Simple Words):
 * - First letter of every word should be uppercase
 * - Remaining letters stay the same
 *
 * Algorithm:
 * 1. Split the sentence into words using space
 * 2. For each word:
 *    - Convert first character to uppercase
 *    - Append remaining characters
 * 3. Join all words back with space
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day18_String_Modification;

public class CapitalizeFirstLetterOfEachWord {

    public static void main(String[] args) {

        String str = "i love java programming";
        // Split sentence into words
        String[] words = str.split(" ");
        String result = "";

        // Travers each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Capitalize first character and add remaining part
            char firstChar = word.charAt(0);
            firstChar = (char) (firstChar - 32); // convert tp uppercase

            result = result + firstChar + word.substring(1) + " ";
        }
        System.out.println("Before Capitalize of First Letter of Each Words is : " + str);
        // Print final result
        System.out.println(" After Capitalize of First Letter of Each Words is : " + result);

    }

}
