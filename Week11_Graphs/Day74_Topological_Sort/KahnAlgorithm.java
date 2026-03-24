/*
 * Problem Name: Topological Sort using Kahn's Algorithm (BFS)
 *
 * input:
 * Nodes = 6
 * Edges = [[5,2], [5,0], [4,0], [4,1], [2,3], [3,1]]
 *
 * output:
 * 4 5 2 0 3 1
 *
 * Example:
 *
 * Step 1: Find indegree of all nodes
 *
 * indegree:
 * 0 → 2
 * 1 → 2
 * 2 → 1
 * 3 → 1
 * 4 → 0
 * 5 → 0
 *
 * Step 2:
 * Add nodes with indegree 0 → queue
 *
 * Step 3:
 * Remove node from queue and reduce indegree of neighbors
 *
 * Approach:
 * 1. Calculate indegree of each node.
 * 2. Add nodes with indegree 0 to queue.
 * 3. Process queue (BFS).
 * 4. Reduce indegree of neighbors.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day74_Topological_Sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgorithm {

    public static void main(String[] args) {

        int n = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 5, 2 }, { 5, 0 }, { 4, 0 }, { 4, 1 }, { 2, 3 }, { 3, 1 }
        };

        int[] indegree = new int[n];

        for (int[] e : edges) {

            graph.get(e[0]).add(e[1]);
            indegree[e[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++)
            if (indegree[i] == 0)
                queue.add(i);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0)
                    queue.add(neighbor);
            }
        }
    }
}
