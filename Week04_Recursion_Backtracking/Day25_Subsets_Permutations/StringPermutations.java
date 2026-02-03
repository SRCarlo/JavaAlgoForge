/*
 Que:
 Print all permutations of a string.

 Example:
 Input  : "abc"
 Output : abc acb bac bca cab cba

 Algo:
 - Pick one character
 - Fix it
 - Recursively permute remaining string

 Explanation:
 We fix one character at a time and rearrange the rest.
 Same logic repeats → recursion.

 Dry Run:
 Pick a → permute "bc"
 Pick b → permute "ac"
 Pick c → permute "ab"

 Time Complexity: O(n!)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day25_Subsets_Permutations;

public class StringPermutations {

    static void permute(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, ans + ch);
        } 
    }

    public static void main(String[] args) {
        permute("abc", "");
    }

}
