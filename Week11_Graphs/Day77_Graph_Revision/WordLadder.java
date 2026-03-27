/*
 * Problem Name: Word Ladder (Shortest Transformation Sequence)
 *
 * input:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * output:
 * 5
 *
 * Example:
 *
 * hit → hot → dot → dog → cog
 *
 * Total words = 5
 *
 * Each step changes only 1 letter.
 *
 * Approach:
 * 1. Use BFS because shortest path needed.
 * 2. Try changing each character (a-z).
 * 3. If new word present in dictionary → add to queue.
 * 4. Stop when endWord reached.
 *
 * Time Complexity: O(N * wordLength * 26)
 * Space Complexity: O(N)
 */

package Week01_Basics_Logic.Week11_Graphs.Day77_Graph_Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        String[] wordListArr = { "hot", "dot", "dog", "lot", "log", "cog" };

        Set<String> wordList = new HashSet<>(Arrays.asList(wordListArr));

        Queue<String> queue = new LinkedList<>();

        queue.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String word = queue.poll();

                if (word.equals(endWord)) {

                    System.out.println(level);
                    return;
                }

                char[] arr = word.toCharArray();

                for (int j = 0; j < arr.length; j++) {

                    char original = arr[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        arr[j] = c;

                        String newWord = new String(arr);

                        if (wordList.contains(newWord)) {

                            queue.add(newWord);
                            wordList.remove(newWord);
                        }
                    }

                    arr[j] = original;
                }
            }

            level++;
        }

        System.out.println(0);
    }
}

