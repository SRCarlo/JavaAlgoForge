/**
 * Question:
 * Reverse words in a sentence.
 *
 * Example:
 * Input  : "Java is powerful"
 * Output : "powerful is Java"
 *
 * Explanation:
 * - Split string into words.
 * - Traverse words from end to start.
 * - Append words to result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String sentence = "Java is very powerfull";
        String result = reverseWords(sentence);
        System.out.println(result);
    }

    // Method to reverse word in a sentence
    public static String reverseWords(String sentence) {

        // Split sentence into words
        String[] words = sentence.split(" ");

        String reversedSentence = "";

        // Loop from last word to first
        for (int i = words.length - 1; i >= 0; i--) {

            reversedSentence = reversedSentence + words[i] + " ";
        }

        // Remove extra space at end
        return reversedSentence.trim();
    }

}
