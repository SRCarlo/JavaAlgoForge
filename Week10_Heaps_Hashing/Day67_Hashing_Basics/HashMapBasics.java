/*
 * Problem Name: HashMap Basics (Insert, Search, Delete)
 *
 * input:
 * Insert: (1,"A"), (2,"B"), (3,"C")
 * Search key = 2
 * Delete key = 3
 *
 * output:
 * Value for key 2 = B
 * After deletion: {1=A, 2=B}
 *
 * Example:
 *
 * Map:
 * 1 → A
 * 2 → B
 * 3 → C
 *
 * Search key 2 → B
 * Delete key 3
 *
 * Final Map:
 * 1 → A
 * 2 → B
 *
 * Approach:
 * 1. Use HashMap for key-value storage.
 * 2. put() → insert
 * 3. get() → search
 * 4. remove() → delete
 *
 * Time Complexity: O(1) average
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week10_Heaps_Hashing.Day67_Hashing_Basics;

import java.util.HashMap;

public class HashMapBasics {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Insert
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // Search
        System.out.println("Value for key 2 is : " + map.get(2));

        // Delete
        map.remove(3);

        // Print map
        System.out.println("After deletion: " + map);
    }
}