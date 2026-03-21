/*
 * Problem Name: Depth First Search (DFS)
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
 * 0 1 3 2 4
 *
 * Example:
 *
 * DFS traversal (depth-wise):
 * 0 → 1 → 3 → back → 2 → 4
 *
 * Approach:
 * 1. Use recursion.
 * 2. Visit node.
 * 3. Recursively visit all unvisited neighbors.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day71_Graph_Basics;

import java.util.ArrayList;

public class DFS {

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }

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

        dfs(0, visited, graph);
    }
}
