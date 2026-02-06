
/*
 Que:
 Print all subsets of an array.

 Example:
 Input  : [1,2]
 Output :
 (empty)
 1
 2
 1 2

 Algo:
 1. At each index → pick or not pick
 2. When index reaches end → print subset

 Explanation:
 Each element has 2 choices.

 Dry Run:
 [] → pick 1 → [1]
 [] → not pick 1 → []

 Time Complexity: O(2^n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day28_Revision;

public class SubsetsRevision {

    static void subsets(int[] arr, int index, String curr) { // curr means: current subset being built right now .
                                                             // curr is like a temporary box where we collect selected numbers.

        // If all elements processed
        if (index == arr.length) {
            System.out.println(curr);
            return;
        }

        // Pick Element
        subsets(arr, index + 1, curr + arr[index] + " ");

        // Not pick Element
        subsets(arr, index + 1, curr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        subsets(arr, 0, "");
    }

}
