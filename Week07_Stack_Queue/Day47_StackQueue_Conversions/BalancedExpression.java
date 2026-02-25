/*
 * Question:
 * Check if expression is balanced.
 *
 * Example:
 * Input: "{[()]}"
 * Output: true
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day47_StackQueue_Conversions;

import java.util.Stack;

public class BalancedExpression {

    public static void main(String[] args) {

        String exp = "{[()]}";

        System.out.println("Given Expression is Balanced ? " + isBalanced(exp));
    }

    static boolean isBalanced(String s) {

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