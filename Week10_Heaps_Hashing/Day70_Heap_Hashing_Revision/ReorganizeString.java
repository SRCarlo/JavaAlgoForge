/*
 * Problem Name: Reorganize String
 *
 * input:
 * s = "aab"
 *
 * output:
 * "aba"
 *
 * Example:
 *
 * Input: "aab"
 *
 * Frequency:
 * a → 2
 * b → 1
 *
 * Valid output:
 * "aba" ✔ (no adjacent same characters)
 *
 * Invalid:
 * "aab" ✖
 *
 * Approach:
 * 1. Count frequency using HashMap.
 * 2. Use Max Heap based on frequency.
 * 3. Pick top 2 most frequent characters.
 * 4. Append them alternatively.
 * 5. Reduce frequency and push back if needed.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day70_Heap_Hashing_Revision;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {

    static class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public static void main(String[] args) {

        String s = "aab";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.freq - a.freq);

        for (char c : map.keySet())
            maxHeap.add(new Pair(c, map.get(c)));

        StringBuilder result = new StringBuilder();

        while (maxHeap.size() > 1) {

            Pair p1 = maxHeap.poll();
            Pair p2 = maxHeap.poll();

            result.append(p1.ch);
            result.append(p2.ch);

            p1.freq--;
            p2.freq--;

            if (p1.freq > 0)
                maxHeap.add(p1);
            if (p2.freq > 0)
                maxHeap.add(p2);
        }

        if (!maxHeap.isEmpty()) {

            Pair last = maxHeap.poll();

            if (last.freq > 1) {
                System.out.println("Not Possible");
                return;
            }

            result.append(last.ch);
        }

        System.out.println(result.toString());
    }
}