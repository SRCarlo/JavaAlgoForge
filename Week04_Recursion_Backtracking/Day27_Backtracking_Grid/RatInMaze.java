/*
 Que:
 A rat is placed at (0,0) in a maze.
 It must reach (n-1,n-1).
 Rat can move only Down or Right.

 Example:
 Input:
 1 0 0
 1 1 0
 0 1 1

 Output:
 Path exists → YES(true)

 
 Algo (Simple Steps):
 1. Start from cell (0,0)
 2. If cell is blocked → return false
 3. Mark current cell as visited
 4. Try moving Right
 5. Try moving Down
 6. If any move reaches destination → return true
 7. If both moves fail → backtrack (unmark cell)

 Approach:
 - Use backtracking from start
 - Try moving Right and Down
 - Mark visited cells
 - If reach destination → success

 Explanation:
 We explore all possible paths.
 If one path fails, we backtrack.

 Time Complexity: O(2^(n*n))
 Space Complexity: O(n*n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day27_Backtracking_Grid;

public class RatInMaze {

    static boolean solve(int[][] maze, int row, int col, int n) {

        // If reached destination
        if (row == n - 1 && col == n - 1)
            return true;

        // Check boundaries and blocked cell
        if (row >= n || col >= n || maze[row][col] == 0)
            return false;

        // Mark current cell as visited
        maze[row][col] = 0;

        // Move Right
        if (solve(maze, row, col + 1, n))
            return true;

        // Move Down
        if (solve(maze, row + 1, col, n))
            return true;

        // Backtrack (unmark cell)
        maze[row][col] = 1;

        return false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                { 1, 0, 0 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };

        int n = maze.length;

        System.out.println("Path Exists----> " + solve(maze, 0, 0, n));
    }

}
