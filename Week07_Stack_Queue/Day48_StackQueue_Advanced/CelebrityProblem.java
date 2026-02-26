/*
 * Question:
 * Find Celebrity in a party.
 *
 * Celebrity:
 * - Everyone knows them
 * - They know nobody
 *
 * Example:
 * Matrix:
 * 0 1 1
 * 0 0 0
 * 0 1 0
 *
 * Output: 1 (index)
 *
 * Time Complexity: O(n)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day48_StackQueue_Advanced;

import java.util.Stack;

public class CelebrityProblem {

    public static void main(String[] args) {

        int[][] M = {
                { 0, 1, 1 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        System.out.println("Celebrity Index is : " + findCelebrity(M));
    }

    static int findCelebrity(int[][] M) {

        int n = M.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {

            int a = stack.pop();
            int b = stack.pop();

            if (M[a][b] == 1)
                stack.push(b);
            else
                stack.push(a);
        }

        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {

            if (i != candidate &&
                    (M[candidate][i] == 1 || M[i][candidate] == 0)) {
                return -1;
            }
        }

        return candidate;
    }
}