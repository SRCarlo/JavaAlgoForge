/*
 * Problem Name: Number of Islands
 *
 * input:
 * 1 1 0 0
 * 1 0 0 1
 * 0 0 1 1
 *
 * output:
 * 2
 *
 * Example:
 *
 * connected 1s form island
 *
 * Approach:
 *
 * DFS on grid
 *
 * mark visited cells
 *
 * count components
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day90_Graphs_DP;

public class NumberOfIslands {

    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '0', '0' },
                { '1', '0', '0', '1' },
                { '0', '0', '1', '1' }
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

    static void dfs(char[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}