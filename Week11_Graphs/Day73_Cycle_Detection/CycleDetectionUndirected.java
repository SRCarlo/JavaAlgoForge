/*
 * Problem Name: Cycle Detection in Undirected Graph
 *
 * input:
 * Nodes = 5
 * Edges = [[0,1], [1,2], [2,3], [3,1], [3,4]]
 *
 * output:
 * Cycle Detected = true
 *
 * Example:
 *
 * Graph:
 *
 * 0 — 1
 *     |
 *     2
 *     |
 *     3
 *     |
 *     4
 *
 * Cycle present:
 * 1 → 2 → 3 → 1
 *
 * Approach:
 * 1. Use DFS traversal.
 * 2. Track parent node.
 * 3. If visited node found which is not parent → cycle exists.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day73_Cycle_Detection;

import java.util.ArrayList;

public class CycleDetectionUndirected {

    static boolean dfs(int node, int parent,
            boolean[] visited,
            ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(neighbor, node, visited, graph))
                    return true;
            } else if (neighbor != parent) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 1 }, { 3, 4 }
        };

        for (int[] e : edges) {

            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];

        boolean hasCycle = false;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                if (dfs(i, -1, visited, graph)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println(hasCycle);
    }
}