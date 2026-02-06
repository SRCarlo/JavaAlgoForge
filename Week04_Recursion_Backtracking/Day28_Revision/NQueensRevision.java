
/*
 Que:
 Place N queens on chessboard so none attack each other.

 Example:
 Input: n=4
 Output: One valid arrangement

 Algo:
 1. Place queens row by row
 2. Check safe column + diagonals
 3. Backtrack if not possible

 Explanation:
 Only one queen per row.

 Time Complexity: O(n!)
 Space Complexity: O(n^2)
*/
package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day28_Revision;

public class NQueensRevision {

    static boolean isSafe(char[][] board, int row, int col) {

        // Check same column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    static boolean solve(char[][] board, int row) {

        // All queens placed
        if (row == board.length)
            return true;

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                if (solve(board, row + 1))
                    return true;

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 4;
        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';

        solve(board, 0);

        // print Solution
        for (char[] row : board) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }

}
