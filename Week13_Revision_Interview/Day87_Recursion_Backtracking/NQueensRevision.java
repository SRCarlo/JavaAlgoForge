/**
 * Problem Name: N Queens
 *
 * input:
 * n = 4
 *
 * output:
 * 2 solutions
 *
 * Example:
 *
 * place queens
 * no attack allowed
 *
 * same column   X
 * diagonal   X
 *
 * Approach:
 *
 * place queen row by row
 *
 * check safe position
 *
 * Time Complexity: O(n!)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day87_Recursion_Backtracking;

public class NQueensRevision {

    static int count = 0;

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = '.';
            }
        }

        solve(board, 0);

        System.out.println(count);
    }

    static void solve(char[][] board, int row) {

        if (row == board.length) {

            count++;

            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int r, int c) {

        for (int i = 0; i < r; i++) {

            if (board[i][c] == 'Q')
                return false;
        }

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
