/*
 * Question:
 * Asteroids moving in line.
 * Positive → right
 * Negative → left
 *
 * When collide:
 * Smaller explodes
 *
 * Example:
 * Input: [5,10,-5]
 * Output: [5,10]
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day49_Stack_Queue_Revision;

import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {

        int[] asteroids = { 5, 10, -5 };

        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() &&
                    ast < 0 &&
                    stack.peek() > 0) {

                if (Math.abs(ast) > stack.peek()) {
                    stack.pop();
                    continue;
                } else if (Math.abs(ast) == stack.peek()) {
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(ast);
            }
        }

        System.out.println(stack);
    }
}
