/*
 * Problem Name: Graph BFS Traversal
 *
 * input:
 * 0 -- 1
 * |    |
 * 2 -- 3
 *
 * output:
 * 0 1 2 3
 *
 * Example:
 *
 * visit nodes level by level
 *
 * Approach:
 *
 * use queue
 *
 * mark visited
 *
 * process neighbors
 *
 * Time Complexity: O(V+E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week13_Revision_Interview.Day90_Graphs_DP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_Traversal {

    public static void main(String[] args) {

        int V = 4;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);

        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        visited[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

            for (int nei : graph.get(node)) {

                if (!visited[nei]) {

                    visited[nei] = true;

                    q.add(nei);
                }
            }
        }
    }
}