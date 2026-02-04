/*
 Que:
 Print all letter combinations of a phone number.

 Example:
 Input  : "23"
 Output :
 ad ae af bd be bf cd ce cf

 Algo:
 - Map digits to letters
 - For each digit, try all letters
 - Backtrack

 Explanation:
 Each digit gives multiple choices.
 We try all combinations recursively.

 Dry Run:
 2 → abc
 3 → def
 a+d, a+e, a+f ...

 Time Complexity: O(4^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day26_Backtracking_Core;

public class PhoneKeypadCombinations {

    // Mapping digits to letters (like mobile keypad)
    static String[] map = {
            "", // 0 has no letters
            "", // 1 has no letters
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    // Backtracking function
    static void combine(String digits, int index, String result) {

        // Base case: if all digits are processed
        if (index == digits.length()) {
            System.out.println(result); // print one combination
            return;
        }

        // Get current digit (example: '2')
        char digit = digits.charAt(index);

        // Find letters for that digit (example: "abc")
        String letters = map[digit - '0'];

        // Try each letter one by one
        for (char ch : letters.toCharArray()) {

            // Add letter and move to next digit
            combine(digits, index + 1, result + ch);
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        // Start backtracking
        combine(digits, 0, "");
    }
}