/*
 * Problem Name: Shortest Path in Unweighted Graph
 *
 * input:
 * Nodes = 6
 * Edges = [[0,1],[0,2],[1,3],[2,4],[3,5],[4,5]]
 * Source = 0
 *
 * output:
 * Distance from 0:
 * [0,1,1,2,2,3]
 *
 * Example:
 *
 * Graph:
 *
 * 0 → 1 → 3 → 5
 * ↓         ↑
 * 2 → 4 ----
 *
 * Shortest distance from node 0:
 * 0 = 0
 * 1 = 1
 * 2 = 1
 * 3 = 2
 * 4 = 2
 * 5 = 3
 *
 * Approach:
 * 1. Use BFS because all edges have equal weight.
 * 2. Store distance array.
 * 3. Update distance when visiting neighbors.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day75_Shortest_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweighted {

    public static void main(String[] args) {

        int n = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 }, { 3, 5 }, { 4, 5 }
        };

        for (int[] e : edges) {

            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int source = 0;

        int[] dist = new int[n];

        Arrays.fill(dist, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        dist[source] = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int neighbor : graph.get(node)) {

                if (dist[neighbor] == -1) {

                    dist[neighbor] = dist[node] + 1;
                    queue.add(neighbor);
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}