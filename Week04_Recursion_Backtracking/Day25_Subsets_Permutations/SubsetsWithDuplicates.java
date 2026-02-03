/*
 Que:
 Generate all unique subsets when array contains duplicates.

 Example:
 Input  : [1, 2, 2]
 Output :
 (empty)
 1
 2
 1 2
 2 2
 1 2 2

 Algo:
 - Generate all subsets normally
 - Store subsets in HashSet
 - HashSet removes duplicate subsets

 Explanation:
 Duplicate numbers create same subsets.
 HashSet ensures only unique subsets are stored.

 Dry Run:
 "2" appears twice → HashSet keeps only one

 Time Complexity: O(2^n)
 Space Complexity: O(2^n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day25_Subsets_Permutations;

import java.util.HashSet;

public class SubsetsWithDuplicates {

    static void subsets(int[] arr, int index, String curr, HashSet<String> set) {

        if (index == arr.length) {
            set.add(curr);
            return;
        }

        subsets(arr, index + 1, curr + arr[index] + " ", set);
        subsets(arr, index + 1, curr, set);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2 };
        HashSet<String> set = new HashSet<>();

        subsets(arr, 0, "", set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
