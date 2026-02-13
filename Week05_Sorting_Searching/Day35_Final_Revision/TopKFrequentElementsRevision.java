
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
package Week01_Basics_Logic.Week05_Sorting_Searching.Day35_Final_Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElementsRevision {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        // Sort keys by frequency
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        System.out.println("Top " + k + " Frequent Elements:");

        for (int i = 0; i < k; i++)
            System.out.println(list.get(i));
    }

}
