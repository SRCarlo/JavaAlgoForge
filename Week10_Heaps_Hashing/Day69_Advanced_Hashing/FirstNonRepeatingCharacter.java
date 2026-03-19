/*
 * Problem Name: First Non-Repeating Character
 *
 * input:
 * s = "aabbcde"
 *
 * output:
 * c
 *
 * Example:
 *
 * String: a a b b c d e
 *
 * Frequency:
 * a → 2
 * b → 2
 * c → 1 ✔
 *
 * First non-repeating = c
 *
 * Approach:
 * 1. Count frequency using HashMap.
 * 2. Traverse string again.
 * 3. Return first character with frequency 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day69_Advanced_Hashing;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "aabbcde";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        // Find first non-repeating
        for (char c : s.toCharArray()) {

            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}