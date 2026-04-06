/**
 * Problem Name: Word Search
 *
 * input:
 *
 * board =
 * A B C E
 * S F C S
 * A D E E
 *
 * word = "ABCCED"
 *
 * output:
 * true
 *
 * Example:
 *
 * path exists in grid
 *
 * Approach:
 *
 * DFS search
 *
 * move 4 directions
 *
 * mark visited
 *
 * backtrack
 *
 * Time Complexity: O(n*m*4^L)
 * Space Complexity: O(L)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day87_Recursion_Backtracking;

public class WordSearchRevision {

    public static void main(String[] args) {

        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCCED";

        System.out.println(
                exist(board, word));
    }

    static boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (dfs(board, word, i, j, 0))
                    return true;
            }
        }

        return false;
    }

    static boolean dfs(char[][] board, String word, int i, int j, int index) {

        if (index == word.length())
            return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index))
            return false;

        char temp = board[i][j];

        board[i][j] = '#';

        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) ||
                dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp;

        return found;
    }
}