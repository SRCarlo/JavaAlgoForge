/*
 Que:
 Check if a word exists in grid.

 Example:
 Grid:
 A B C
 D E F

 Word = "ABE"
 Output = true

 Algo:
 1. Start DFS from each cell
 2. Match characters one by one
 3. Mark visited
 4. Backtrack if path fails

 Time Complexity: O(n*m*4^L)
 Space Complexity: O(L)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day28_Revision;

public class WordSearchRevision {

    static boolean dfs(char[][] board, int r, int c,
            String word, int index) {

        // Word fully matched
        if (index == word.length())
            return true;

        // Boundary + mismatch check
        if (r < 0 || c < 0 ||
                r >= board.length || c >= board[0].length ||
                board[r][c] != word.charAt(index))
            return false;

        // Mark visited
        char temp = board[r][c];
        board[r][c] = '#';

        boolean found = dfs(board, r + 1, c, word, index + 1) ||
                dfs(board, r - 1, c, word, index + 1) ||
                dfs(board, r, c + 1, word, index + 1) ||
                dfs(board, r, c - 1, word, index + 1);

        // Backtrack restore
        board[r][c] = temp;

        return found;
    }

    public static void main(String[] args) {

        char[][] board = {
                { 'A', 'B', 'C' },
                { 'D', 'E', 'F' }
        };

        String word = "ABE";

        boolean result = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0))
                    result = true;
            }
        }

        System.out.println("Word Found? ----> " + result);
    }
}