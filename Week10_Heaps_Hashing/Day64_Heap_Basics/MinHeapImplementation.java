/*
 * Problem Name: Min Heap Implementation
 *
 * input:
 * Insert values: 40, 20, 30, 10
 *
 * output:
 * Heap array representation:
 * 10 20 30 40
 *
 * Example:
 *
 * Insert 40
 * Heap: 40
 *
 * Insert 20
 * Heap: 20 40
 *
 * Insert 30
 * Heap: 20 40 30
 *
 * Insert 10
 * Heap: 10 20 30 40
 *
 * Min Heap Property:
 * Parent node must be smaller than its children.
 *
 * Approach:
 * 1. Insert element at the end of array.
 * 2. Compare with parent.
 * 3. If smaller → swap with parent.
 * 4. Repeat until heap property is satisfied.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day64_Heap_Basics;

import java.util.ArrayList;

public class MinHeapImplementation {

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

        void printHeap() {
            for (int v : heap)
                System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {

        MinHeap h = new MinHeap();

        h.insert(40);
        h.insert(20);
        h.insert(30);
        h.insert(10);

        h.printHeap();
    }
}