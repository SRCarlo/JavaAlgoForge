/**
 * Problem Name: Minimum Index Character
 * Difficulty: Easy
 *
 * Input:
 *  str = "geeksforgeeks"
 *  patt = "set"
 *
 * Output:
 *  Index = 1 (character 'e')
 *
 * Algorithm:
 * 1. Traverse main string
 * 2. For each character, check if it exists in pattern
 * 3. Return first such index
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day17_String_Comparison;

public class MinimumIndexCharacter {
    public static void main(String[] args) {

        String str = "geeksforgeeks";
        String patt = "set";

        int minIndex = Integer.MAX_VALUE;

        // Traverse main string
        for (int i = 0; i < str.length(); i++) {

            // Check if character exists in pattern
            for (int j = 0; j < patt.length(); j++) {

                if (str.charAt(i) == patt.charAt(j)) {
                    minIndex = i;
                    break;
                }
            }

            // Stop once first minimum index is found
            if (minIndex != Integer.MAX_VALUE) {
                break;
            }
        }

        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No character found.");
        } else {
            System.out.println("Minimum Index is : " + minIndex);
        }
    }

}
