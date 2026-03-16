/*
 * Problem Name: Sort Characters By Frequency
 *
 * input:
 * s = "tree"
 *
 * output:
 * "eert" or "eetr"
 *
 * Example:
 *
 * Character frequency:
 * t → 1
 * r → 1
 * e → 2
 *
 * Sorted by frequency:
 * e e t r
 *
 * Approach:
 * 1. Count character frequency using HashMap.
 * 2. Use Max Heap based on frequency.
 * 3. Extract characters and append them frequency times.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day66_PriorityQueue_Problems;

import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String s = "tree";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        maxHeap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            char ch = maxHeap.poll();

            for (int i = 0; i < map.get(ch); i++)
                result.append(ch);
        }

        System.out.println(result.toString());
    }
}