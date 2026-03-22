/*
 * Problem Name: Flood Fill
 *
 * input:
 * image =
 * [
 *  [1,1,1],
 *  [1,1,0],
 *  [1,0,1]
 * ]
 *
 * sr = 1, sc = 1
 * newColor = 2
 *
 * output:
 * [
 *  [2,2,2],
 *  [2,2,0],
 *  [2,0,1]
 * ]
 *
 * Example:
 *
 * Starting from (1,1)
 * change all connected 1 → 2
 *
 * Approach:
 * 1. Start DFS from given cell.
 * 2. Change color to newColor.
 * 3. Visit 4 directions.
 * 4. Continue while same color found.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(n * m)
 */

package Week01_Basics_Logic.Week11_Graphs.Day72_Traversal_Problems;

public class FloodFill {

    static void dfs(int[][] image, int r, int c,
            int oldColor, int newColor) {

        if (r < 0 || c < 0 || r >= image.length
                || c >= image[0].length
                || image[r][c] != oldColor)
            return;

        image[r][c] = newColor;

        dfs(image, r + 1, c, oldColor, newColor);
        dfs(image, r - 1, c, oldColor, newColor);
        dfs(image, r, c + 1, oldColor, newColor);
        dfs(image, r, c - 1, oldColor, newColor);
    }

    public static void main(String[] args) {

        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int sr = 1, sc = 1;
        int newColor = 2;

        int oldColor = image[sr][sc];

        dfs(image, sr, sc, oldColor, newColor);

        for (int[] row : image) {

            for (int val : row)
                System.out.print(val + " ");

            System.out.println();
        }
    }
}
