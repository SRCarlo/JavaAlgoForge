/*
 * Problem Name: Breadth First Search (BFS)
 *
 * input:
 * Graph:
 * 0 → [1,2]
 * 1 → [0,3]
 * 2 → [0,4]
 * 3 → [1]
 * 4 → [2]
 *
 * Start node = 0
 *
 * output:
 * 0 1 2 3 4
 *
 * Example:
 *
 * BFS traversal level by level:
 *
 * Level 0: 0
 * Level 1: 1, 2
 * Level 2: 3, 4
 *
 * Approach:
 * 1. Use Queue.
 * 2. Start from source node.
 * 3. Mark visited.
 * 4. Push neighbors into queue.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day71_Graph_Basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 }
        };

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}