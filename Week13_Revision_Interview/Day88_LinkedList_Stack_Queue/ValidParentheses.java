/*
 * Problem Name: Valid Parentheses
 *
 * input:
 * s = "()[]{}"
 *
 * output:
 * true
 *
 * Example:
 *
 * opening bracket
 * must close correctly
 *
 * Approach:
 *
 * push opening bracket
 *
 * when closing bracket found
 * check stack top
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day88_LinkedList_Stack_Queue;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "()[]{}";

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {

                stack.push(c);

            } else {

                if (stack.isEmpty()) {

                    System.out.println(false);
                    return;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {

                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty());
    }
}