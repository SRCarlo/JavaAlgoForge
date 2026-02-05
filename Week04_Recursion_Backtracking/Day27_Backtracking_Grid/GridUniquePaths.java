/*
 Que:
 Count all unique paths from top-left to bottom-right
 in a grid (only Right and Down moves).

 Example:
 Input: 2x3 grid
 Output: 3 paths

  Algo (Simple Steps):
 1. Start from top-left cell (0,0)
 2. From each cell, you have 2 choices:
    - Move Right
    - Move Down
 3. If you reach bottom-right → count 1 path
 4. If you go outside grid → count 0 path
 5. Total paths = Right paths + Down paths

 Approach:
 - Use recursion
 - Move Right + Down
 - Count paths when destination reached
 

 Explanation:
 Each cell gives 2 choices → Right or Down.

 Time Complexity: O(2^(n+m))
 Space Complexity: O(n+m)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day27_Backtracking_Grid;

public class GridUniquePaths {

   static int countPaths(int r, int c, int m, int n) {

      // Destination reached
      if (r == m - 1 && c == n - 1)
         return 1;

      // Out of bounds
      if (r >= m || c >= n)
         return 0;

      // Move Down + Move Right
      return countPaths(r + 1, c, m, n) +
            countPaths(r, c + 1, m, n);
   }

   public static void main(String[] args) {

      int m = 2, n = 3;
      System.out.println("Total Paths: " + countPaths(0, 0, m, n));
   }

}
