/*
 * Problem Name: Count Frequency of Characters
 * Source: Basic String Practice
 * Difficulty: Easy
 *
 * Input:
 *  "banana"
 *
 * Output:
 *  b = 1
 *  a = 3
 *  n = 2
 *
 * Algorithm:
 * 1. Use a boolean array to track counted characters
 * 2. Pick one character
 * 3. Count its occurrences
 * 4. Skip already counted characters
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day16_String_Counting;

public class CountFrequencyOfCharacters {

    public static void main(String[] args) {

        // Input string
        String str = "banana";

        // Array to mark characters already counted
        boolean[] visited = new boolean[str.length()];

        // Loop through each character of string
        for (int i = 0; i < str.length(); i++) {

            // If character is already counted, skip it
            if (visited[i]) {
                continue;
            }

            // Current character
            char ch = str.charAt(i);
            int count = 1;

            // Count same characters after current index
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    visited[j] = true; // mark as counted
                    count++;
                }
            }

            // Print character and its frequency
            System.out.println(ch + " = " + count);
        }
    }

}
