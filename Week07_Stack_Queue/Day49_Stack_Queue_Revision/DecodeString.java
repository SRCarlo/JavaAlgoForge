/*
 * Question:
 * Decode encoded string.
 *
 * Example:
 * Input: "3[a2[c]]"
 * Output: "accaccacc"
 *
 * Pattern:
 * Stack + StringBuilder
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day49_Stack_Queue_Revision;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {

        String s = "3[a2[c]]";
        System.out.println(decode(s));
    }

    static String decode(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');

            } else if (ch == '[') {

                countStack.push(k);
                stringStack.push(current);

                current = new StringBuilder();
                k = 0;

            } else if (ch == ']') {

                int count = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < count; i++) {
                    prev.append(current);
                }

                current = prev;

            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
