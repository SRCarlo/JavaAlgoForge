/**
 * Problem Name: First Occurrence of Substring
 * Difficulty: Easy
 *
 * Input:
 *  main = "hello world"
 *  sub  = "world"
 *
 * Output:
 *  Index = 6
 *
 * Algorithm:
 * 1. Traverse main string
 * 2. Match substring
 * 3. Return starting index
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day17_String_Comparison;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String main = "hello world";
        String sub = "world";

        int index = -1;
        for (int i = 0; i <= main.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                index = i;
                break;
            }
        }
        System.out.println("Index is : " + index);
    }

}
