/*
 Que:
 Print all permutations of a string.

 Example:
 Input  : "ABC"
 Output :
 ABC
 ACB
 BAC
 BCA
 CAB
 CBA

 Algo:
 1. Fix one character
 2. Permute remaining characters
 3. Backtrack after recursion

 Explanation:
 Every position can take every character.

 Time Complexity: O(n!)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day28_Revision;

public class StringPermutationRevision {

    static void permute(String str, String ans) {

        // If string becomes empty → permutation complete
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // try each character as first choice
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Remaining string after removing chosen character
            String remaning = str.substring(0, i) + str.substring(i + 1);

            permute(remaning, ans + ch);
        }
    }

    public static void main(String[] args) {
        permute("ABC", "");
    }

}
