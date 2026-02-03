/*
 Que:
 Generate permutations of an array using swapping.

 Example:
 Input  : [1, 2, 3]
 Output : 123 132 213 231 312 321

 Algo:
 - Fix one element by swapping
 - Recursively permute remaining array
 - Backtrack (undo swap)

 Explanation:
 Swap places an element at correct position.
 Backtracking restores array for next choice.

 Dry Run:
 Swap 1↔1 → [1,2,3]
 Swap 1↔2 → [2,1,3]
 Swap 1↔3 → [3,2,1]

 Time Complexity: O(n!)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day25_Subsets_Permutations;

public class ArrayPermutations {

    static void permute(int[] arr, int index) {

        if (index == arr.length) {
            for (int n : arr)
                System.out.print(n + "");
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(arr, index + 1);

            // Backtrack
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        permute(arr, 0);
    }
}
