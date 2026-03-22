/*
 * Problem Name: Number of Islands
 *
 * input:
 * grid =
 * [
 *  ['1','1','0','0'],
 *  ['1','1','0','0'],
 *  ['0','0','1','0'],
 *  ['0','0','0','1']
 * ]
 *
 * output:
 * 3
 *
 * Example:
 *
 * Island 1:
 * 1 1
 * 1 1
 *
 * Island 2:
 *     1
 *
 * Island 3:
 *         1
 *
 * Total islands = 3
 *
 * Approach:
 * 1. Traverse each cell in grid.
 * 2. If cell = '1' → start DFS.
 * 3. Mark all connected '1's as visited.
 * 4. Increase island count.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(n * m)
 */

package Week01_Basics_Logic.Week11_Graphs.Day72_Traversal_Problems;

public class NumberOfIslands {

    static void dfs(char[][] grid, int r, int c) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == '0')
            return;

        grid[r][c] = '0';

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }

    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '0', '0' },
                { '1', '1', '0', '0' },
                { '0', '0', '1', '0' },
                { '0', '0', '0', '1' }
        };

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}