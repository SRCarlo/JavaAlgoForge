/*
 Que:
 Given a grid of letters, check if a word exists.
 Letters must be connected (up, down, left, right).
 Same cell cannot be reused.

 Example:
 Grid:
 A B C E
 S F C S
 A D E E

 Word = "ABCCED"
 Output = true

  Algo (Simple Steps):
 1. Start from every cell in grid
 2. Check if first character matches
 3. Move in 4 directions to match next character
 4. Mark cell visited so it is not reused
 5. If full word matched → return true
 6. If path fails → backtrack (unvisit cell)

 Approach:
 - Start DFS from each cell
 - Match word characters one by one
 - Mark visited cells
 - Backtrack after recursion

 Explanation:
 We search word like exploring paths in grid.

 Time Complexity: O(n*m*4^L)
 Space Complexity: O(L)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day27_Backtracking_Grid;

public class WordSearch {

    static boolean search(char[][] board, int r, int c, String word, int index) {

        // If full word matched
        if (index == word.length())
            return true;

        // Boundary + mismatch check
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length)
            return false;

        if (board[r][c] != word.charAt(index))
            return false;

        // Mark visited
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore 4 directions
        boolean found = search(board, r + 1, c, word, index + 1) ||
                search(board, r - 1, c, word, index + 1) ||
                search(board, r, c + 1, word, index + 1) ||
                search(board, r, c - 1, word, index + 1);

        // Backtrack
        board[r][c] = temp;

        return found;
    }

    public static void main(String[] args) {

        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCCED";

        boolean result = false;

        // Try starting from every cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, i, j, word, 0))
                    result = true;
            }
        }

        System.out.println("Word Found ---->  " + result);
    }
}
