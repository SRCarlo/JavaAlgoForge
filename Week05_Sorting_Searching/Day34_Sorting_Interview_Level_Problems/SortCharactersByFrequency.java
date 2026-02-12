/*
 Question: Sort Characters By Frequency

 Example:
 Input  : "tree"
 Output : "eert" (or "eetr")

 Algo:
 - Count frequency of each character
 - Sort characters by frequency
 - Build output string

 Time Complexity: O(n log n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day34_Sorting_Interview_Level_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String str = "tree";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Sort characters
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for (char ch : list) {
            sb.append(String.valueOf(ch).repeat(map.get(ch)));
        }
        System.out.println("Sorted by Frequency : " + sb);
    }

}
