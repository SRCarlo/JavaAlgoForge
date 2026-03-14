/*
 * Problem Name: Insert and Delete in Min Heap
 *
 * input:
 * Insert values: 50, 30, 40, 10
 * Delete root
 *
 * output:
 * After deletion heap:
 * 30 50 40
 *
 * Example:
 *
 * Initial Heap:
 *        10
 *       /  \
 *     30    40
 *    /
 *  50
 *
 * Delete root (10)
 *
 * Replace with last element and heapify
 *
 * Final Heap:
 *        30
 *       /  \
 *     50    40
 *
 * Approach:
 * 1. Replace root with last element.
 * 2. Remove last element.
 * 3. Heapify down.
 * 4. Swap with smallest child until heap property satisfied.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(n)
 */
package Week01_Basics_Logic.Week10_Heaps_Hashing.Day64_Heap_Basics;

import java.util.ArrayList;

public class HeapInsertDelete {

    static class MinHeap {

        ArrayList<Integer> heap = new ArrayList<>();

        void insert(int val) {

            heap.add(val);
            int index = heap.size() - 1;

            while (index > 0) {

                int parent = (index - 1) / 2;

                if (heap.get(parent) > heap.get(index)) {

                    int temp = heap.get(parent);
                    heap.set(parent, heap.get(index));
                    heap.set(index, temp);

                    index = parent;

                } else
                    break;
            }
        }

        void deleteRoot() {

            int last = heap.get(heap.size() - 1);
            heap.set(0, last);
            heap.remove(heap.size() - 1);

            heapify(0);
        }

        void heapify(int index) {

            int smallest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left < heap.size() && heap.get(left) < heap.get(smallest))
                smallest = left;

            if (right < heap.size() && heap.get(right) < heap.get(smallest))
                smallest = right;

            if (smallest != index) {

                int temp = heap.get(index);
                heap.set(index, heap.get(smallest));
                heap.set(smallest, temp);

                heapify(smallest);
            }
        }

        void printHeap() {

            for (int v : heap)
                System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {

        MinHeap h = new MinHeap();

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);

        h.deleteRoot();

        h.printHeap();
    }
}
