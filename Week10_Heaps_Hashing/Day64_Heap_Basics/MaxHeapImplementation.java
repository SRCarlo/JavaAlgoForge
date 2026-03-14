/*
 * Problem Name: Max Heap Implementation
 *
 * input:
 * Insert values: 10, 40, 20, 50
 *
 * output:
 * Heap array representation:
 * 50 40 20 10
 *
 * Example:
 *
 * Insert 10
 * Heap: 10
 *
 * Insert 40
 * Heap: 40 10
 *
 * Insert 20
 * Heap: 40 10 20
 *
 * Insert 50
 * Heap: 50 40 20 10
 *
 * Max Heap Property:
 * Parent node must be greater than children.
 *
 * Approach:
 * 1. Insert element at end.
 * 2. Compare with parent.
 * 3. If greater → swap with parent.
 * 4. Continue until heap property satisfied.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day64_Heap_Basics;

import java.util.ArrayList;

public class MaxHeapImplementation {

    static class MaxHeap {

        ArrayList<Integer> heap = new ArrayList<>();

        void insert(int val) {

            heap.add(val);

            int index = heap.size() - 1;

            while (index > 0) {

                int parent = (index - 1) / 2;

                if (heap.get(parent) < heap.get(index)) {

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

        MaxHeap h = new MaxHeap();

        h.insert(10);
        h.insert(40);
        h.insert(20);
        h.insert(50);

        h.printHeap();
    }
}