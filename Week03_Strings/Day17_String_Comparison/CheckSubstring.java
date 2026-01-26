/**
 * Problem Name: Check Substring
 * Difficulty: Easy
 *
 * Input:
 *  main = "programming"
 *  sub  = "gram"
 *
 * Output:
 *  Substring found
 *
 * Algorithm:
 * 1. Loop through main string
 * 2. Try matching substring character by character
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day17_String_Comparison;

public class CheckSubstring {
    public static void main(String[] args) {
        String main = "programming";
        String sub = "gram";

        boolean found = false;

        // Loop through main String
        for (int i = 0; i <= main.length() - sub.length(); i++) {

            int j;
            for (j = 0; j < sub.length(); j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            // If full substring matched
            if (j == sub.length()) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("SubString is Found.");
        } else {
            System.out.println("SubString is not Found.");
        }
    }

}
