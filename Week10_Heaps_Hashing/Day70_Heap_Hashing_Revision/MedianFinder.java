/*
 * Problem Name: Find Median from Data Stream
 *
 * input:
 * addNum(1)
 * addNum(2)
 * findMedian()
 * addNum(3)
 * findMedian()
 *
 * output:
 * 1.5
 * 2.0
 *
 * Example:
 *
 * Numbers added: 1, 2
 * Median = (1 + 2) / 2 = 1.5
 *
 * Numbers added: 1, 2, 3
 * Median = 2
 *
 * Approach:
 * 1. Use two heaps:
 *      MaxHeap → stores smaller half
 *      MinHeap → stores larger half
 * 2. Balance both heaps so size difference ≤ 1.
 * 3. Median:
 *      If equal size → average of tops
 *      Else → top of bigger heap
 *
 * Time Complexity:
 * addNum → O(log n)
 * findMedian → O(1)
 *
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day70_Heap_Hashing_Revision;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    static class Median {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        void addNum(int num) {

            if (maxHeap.isEmpty() || num <= maxHeap.peek())
                maxHeap.add(num);
            else
                minHeap.add(num);

            // Balance heaps
            if (maxHeap.size() > minHeap.size() + 1)
                minHeap.add(maxHeap.poll());

            else if (minHeap.size() > maxHeap.size())
                maxHeap.add(minHeap.poll());
        }

        double findMedian() {

            if (maxHeap.size() == minHeap.size())
                return (maxHeap.peek() + minHeap.peek()) / 2.0;

            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {

        Median mf = new Median();

        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian());

        mf.addNum(3);
        System.out.println(mf.findMedian());
    }
}
