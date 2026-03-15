/**
 * 
 * Problem Name: Kth Largest Element in Array
 *
 * input:
 * nums = [3,2,1,5,6,4]
 * k = 2
 *
 * output:
 * 5
 *
 * Example:
 *
 * Array: 3 2 1 5 6 4
 *
 * Sorted order:
 * 1 2 3 4 5 6
 *
 * 2nd largest element = 5
 *
 * Approach:
 * 1. Use Min Heap (PriorityQueue).
 * 2. Add elements to heap.
 * 3. If heap size > k remove smallest element.
 * 4. Heap top will be kth largest element.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day65_Heap_Applications;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.add(num);

            if (minHeap.size() > k)
                minHeap.poll();
        }

        System.out.println(k + "th Largest Element is : " + minHeap.peek());
    }
}
