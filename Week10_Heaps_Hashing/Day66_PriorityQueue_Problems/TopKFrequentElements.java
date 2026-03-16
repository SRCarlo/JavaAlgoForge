/*
 * Problem Name: Top K Frequent Elements
 *
 * input:
 * nums = [1,1,1,2,2,3]
 * k = 2
 *
 * output:
 * [1,2]
 *
 * Example:
 *
 * Frequency count:
 * 1 → 3 times
 * 2 → 2 times
 * 3 → 1 time
 *
 * Top 2 frequent elements:
 * 1 and 2
 *
 * Approach:
 * 1. Use HashMap to count frequency of elements.
 * 2. Use Max Heap based on frequency.
 * 3. Insert elements into heap.
 * 4. Extract top k elements.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day66_PriorityQueue_Problems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        maxHeap.addAll(map.keySet());

        for (int i = 0; i < k; i++)
            System.out.print(maxHeap.poll() + " ");
    }
}
