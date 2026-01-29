/**
 * Problem: Valid Parentheses
 *
 * Example:
 * Input  : "()[]{}"
 * Output : true
 *
 * Logic:
 * - Push opening brackets
 * - Pop and match closing brackets
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day20_String_Optimization;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "()[]{}";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char ch : str.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    isValid = false;
                    break;
                }
            }
        }

        // Stack should be empty at end
        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println("Valid Parentheses is : " + isValid);

    }

}
