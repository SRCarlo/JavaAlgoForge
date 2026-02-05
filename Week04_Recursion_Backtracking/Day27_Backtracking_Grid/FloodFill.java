/*
 Que:
 Given an image grid, change the color of connected cells
 starting from (sr, sc).

 Example:
 Input:
 1 1 1
 1 1 0
 1 0 1

 Start = (1,1), newColor = 2

 Output:
 2 2 2
 2 2 0
 2 0 1

 Algo (Simple Steps):
 1. Start from given pixel (sr, sc)
 2. Change its color to newColor
 3. Move in 4 directions:
    - Up
    - Down
    - Left
    - Right
 4. Repeat for all connected pixels having same oldColor
 5. Stop when boundary or different color found

 Approach:
 - Use DFS recursion
 - Replace current cell color
 - Visit 4 directions (up, down, left, right)

 Explanation:
 Flood fill spreads like paint bucket tool.

 Time Complexity: O(n*m)
 Space Complexity: O(n*m)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day27_Backtracking_Grid;

public class FloodFill {

   static void fill(int[][] img, int r, int c, int oldColor, int newColor) {

      // Boundary check
      if (r < 0 || c < 0 || r >= img.length || c >= img[0].length)
         return;

      // Stop if color is not matching oldColor
      if (img[r][c] != oldColor)
         return;

      // Change color
      img[r][c] = newColor;

      // Visit all 4 directions
      fill(img, r + 1, c, oldColor, newColor);
      fill(img, r - 1, c, oldColor, newColor);
      fill(img, r, c + 1, oldColor, newColor);
      fill(img, r, c - 1, oldColor, newColor);
   }

   public static void main(String[] args) {

      int[][] img = {
            { 1, 1, 1 },
            { 1, 1, 0 },
            { 1, 0, 1 }
      };

      fill(img, 1, 1, 1, 2);

      // Print updated grid
      for (int[] row : img) {
         for (int val : row)
            System.out.print(val + " ");
         System.out.println();
      }
   }
}
