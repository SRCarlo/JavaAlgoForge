/*
 Que:
 Place N queens on NxN chessboard such that
 no queen attacks another.

 Example:
 Input: n=4
 Output: One valid board


 Algo (Simple Steps):
 1. Place queen row by row
 2. For each row, try every column
 3. Before placing, check:
    - No queen in same column
    - No queen in left diagonal
    - No queen in right diagonal
 4. If safe, place queen and move to next row
 5. If stuck, remove queen (backtrack)
 6. When all rows filled → solution found

 Approach:
 - Place queen row by row
 - Check if column/diagonals are safe
 - Backtrack if not possible

 Explanation:
 Only one queen per row.
 Try all columns.

 Time Complexity: O(n!)
 Space Complexity: O(n^2)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day27_Backtracking_Grid;

public class NQueens {
   static boolean isSafe(char[][] board, int row, int col) {

      // Check column upward
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

      if (row == board.length)
         return true;

      for (int col = 0; col < board.length; col++) {

         if (isSafe(board, row, col)) {

            board[row][col] = 'Q';

            if (solve(board, row + 1))
               return true;

            board[row][col] = '.';
         }
      }

      return false;
   }

   public static void main(String[] args) {

      int n = 4;
      char[][] board = new char[n][n];

      // Fill with dots
      for (int i = 0; i < n; i++)
         for (int j = 0; j < n; j++)
            board[i][j] = '.';

      solve(board, 0);

      // Print board
      for (char[] row : board) {
         for (char c : row)
            System.out.print(c + " ");
         System.out.println();
      }
   }
}
