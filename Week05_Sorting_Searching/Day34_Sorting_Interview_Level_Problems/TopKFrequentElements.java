
/*
 Question: Top K Frequent Elements

 Example:
 Input  : nums = [1,1,1,2,2,3], k = 2
 Output : [1,2]

 Algo:
 - Count frequency using HashMap
 - Sort elements by frequency
 - Print top K

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day34_Sorting_Interview_Level_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

   public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Convert map to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        System.out.println("Top " + k + " Frequent Elements:");

        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i));
        }
    }
}
