
/**
 * Question:
 * Check if given parentheses string is valid.
 *
 * Example:
 * Input: "()[]{}"
 * Output: true
 *
 * Algorithm:
 * 1. Push opening brackets
 * 2. When closing bracket appears:
 *    - Check top of stack
 *    - If matching → pop
 *    - Else → false
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day43_Stack_Basics;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "()[]{}";

        System.out.println("Given Parentheses Is Valid ? \n" + "Ans is : " + isValid(s));
    }

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
