/**
 * Problem Name: Count Words in a String
 * Source: String Basics
 * Difficulty: Easy
 *
 * Input:
 *  "Java is very powerful"
 *
 * Output:
 *  4
 *
 * Algorithm:
 * 1. Count spaces in the string
 * 2. Total words = spaces + 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day16_String_Counting;

public class CountWordsInString {

    public static void main(String[] args) {

        // Input sentence
        String sentence = "Java is very powerful";

        // Variable to count spaces
        int spaceCount = 0;

        // Loop through each character
        for (int i = 0; i < sentence.length(); i++) {

            // If space is found, increment counter
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Words are spaces + 1
        System.out.println("Total words is : " + (spaceCount + 1));
    }

}
