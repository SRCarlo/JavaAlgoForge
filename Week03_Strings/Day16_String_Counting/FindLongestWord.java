/**
 * Problem Name: Find Longest Word
 * Source: String Manipulation
 * Difficulty: Easy
 *
 * Input:
 *  "Java is very powerful"
 *
 * Output:
 *  powerful
 *
 * Algorithm:
 * 1. Split sentence into words
 * 2. Compare word lengths
 * 3. Store the longest word
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day16_String_Counting;

public class FindLongestWord {
    public static void main(String[] args) {

        // Input sentence
        String sentence = "Java is very powerful";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Assume first word is longest
        String longest = words[0];

        // Compare remaining words
        for (int i = 1; i < words.length; i++) {

            // Update longest if current word is longer
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        // Print longest word
        System.out.println("Longest word is : " + longest);
    }

}
