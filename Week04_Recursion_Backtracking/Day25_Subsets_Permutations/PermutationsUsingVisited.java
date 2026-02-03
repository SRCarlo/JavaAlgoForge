/*
 Que:
 Generate permutations using visited array.

 Example:
 Input  : [1, 2, 3]
 Output : 123 132 213 231 312 321

 Algo:
 - Use visited[] to track used elements
 - Pick unused element
 - Backtrack after recursion

 Explanation:
 visited[] prevents reuse of same element
 in a single permutation.

 Dry Run:
 Pick 1 → visited
 Pick 2 → visited
 Pick 3 → print
 Backtrack

 Time Complexity: O(n!)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day25_Subsets_Permutations;

public class PermutationsUsingVisited {

    static void permute(int[] arr, boolean[] visited, String curr) {

        if (curr.length() == arr.length * 2) {
            System.out.println(curr);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!visited[i]) {

                visited[i] = true;
                permute(arr, visited, curr + arr[i] + " ");
                visited[i] = false; // backtrack
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        boolean[] visited = new boolean[arr.length];

        permute(arr, visited, "");
    }

}
