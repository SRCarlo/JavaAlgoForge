/*
 Que:
 Generate all valid parentheses combinations for given n pairs.

 Example:
 Input  : n = 3
 Output :
 ((()))
 (()())
 (())()
 ()(())
 ()()()

 Algo:
 - Use backtracking
 - Add '(' if count < n
 - Add ')' if close < open
 - Stop when length = 2 * n

 Explanation:
'(' can be added anytime until limit.
 ')' can be added only if it keeps string valid.
 Backtracking tries all valid paths.

 Dry Run (n=2):
 "(" → "((" → "(())"
 "(" → "()" → "()()"

 Time Complexity: O(2^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day26_Backtracking_Core;

public class GenerateParentheses {

    static void generate(int open, int close, int n, String result) {

        // If length becomes 2*n, we got a valid combination
        if (result.length() == 2 * n) {
            System.out.println(result);
            return;
        }

        // Add '(' if we still have some left
        if (open < n) {
            generate(open + 1, close, n, result + "(");
        }

        // Add ')' only if it does not break validity
        if (close < open) {
            generate(open, close + 1, n, result + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate(0, 0, n, "");
    }

}
