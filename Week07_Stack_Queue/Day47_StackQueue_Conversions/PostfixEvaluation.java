/*
 * Question:
 * Evaluate Postfix Expression.
 *
 * Example:
 * Input: "231*+9-"
 * Output: -4
 *
 * Steps:
 * - If digit → push
 * - If operator → pop 2 operands
 *   Perform operation
 *   Push result
 *
 * Time Complexity: O(n)
 */
package Week01_Basics_Logic.Week07_Stack_Queue.Day47_StackQueue_Conversions;

import java.util.Stack;

public class PostfixEvaluation {

    public static void main(String[] args) {

        String exp = "231*+9-";

        System.out.println("Result: " + evaluate(exp));
    }

    static int evaluate(String exp) {

        Stack<Integer> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {

                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }
}