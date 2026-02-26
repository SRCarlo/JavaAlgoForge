/*
 * Question:
 * Given grid with:
 * 0 → empty
 * 1 → fresh orange
 * 2 → rotten orange
 *
 * Every minute, rotten orange makes adjacent fresh rotten.
 *
 * Find minimum minutes required.
 *
 * Time Complexity: O(n*m)
 * (BFS Using Queue)
 */

package Week01_Basics_Logic.Week07_Stack_Queue.Day48_StackQueue_Advanced;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    static class Pair {
        int row, col;

        Pair(int r, int c) {
            row = r;
            col = c;
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
                { 2, 1, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };

        System.out.println(" Required Minutes is : " + orangesRotting(grid));
    }

    static int orangesRotting(int[][] grid) {

        Queue<Pair> queue = new LinkedList<>();
        int fresh = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2)
                    queue.add(new Pair(i, j));

                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int minutes = 0;
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Pair p = queue.poll();

                for (int[] dir : directions) {

                    int newRow = p.row + dir[0];
                    int newCol = p.col + dir[1];

                    if (newRow >= 0 && newRow < rows &&
                            newCol >= 0 && newCol < cols &&
                            grid[newRow][newCol] == 1) {

                        grid[newRow][newCol] = 2;
                        queue.add(new Pair(newRow, newCol));
                        fresh--;
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}