/*
 * Problem Name: Kth Smallest Element in Array
 *
 * input:
 * nums = [7,10,4,3,20,15]
 * k = 3
 *
 * output:
 * 7
 *
 * Example:
 *
 * Array:
 * 7 10 4 3 20 15
 *
 * Sorted order:
 * 3 4 7 10 15 20
 *
 * 3rd smallest element = 7
 *
 * Approach:
 * 1. Use Max Heap.
 * 2. Add elements to heap.
 * 3. If heap size > k remove largest element.
 * 4. Heap top will be kth smallest element.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day65_Heap_Applications;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSamllestElement {

    public static void main(String[] args) {

        int[] nums = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        System.out.println(k + "th Smallest Element is: " + maxHeap.peek());
    }

}
