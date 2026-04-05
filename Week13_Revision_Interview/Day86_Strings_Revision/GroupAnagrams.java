/*
 * Problem Name: Group Anagrams
 *
 * input:
 * ["eat","tea","tan","ate","nat","bat"]
 *
 * output:
 * [[eat,tea,ate],[tan,nat],[bat]]
 *
 * Example:
 *
 * eat, tea, ate → same letters
 *
 * Approach:
 *
 * sort each word
 *
 * use hashmap
 *
 * group words with same sorted form
 *
 * Time Complexity: O(n * k log k)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day86_Strings_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}
