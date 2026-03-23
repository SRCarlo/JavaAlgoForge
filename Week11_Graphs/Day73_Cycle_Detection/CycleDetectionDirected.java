/*
 * Problem Name: Cycle Detection in Directed Graph
 *
 * input:
 * Nodes = 4
 * Edges = [[0,1], [1,2], [2,3], [3,1]]
 *
 * output:
 * Cycle Detected = true
 *
 * Example:
 *
 * Directed Graph:
 *
 * 0 → 1 → 2 → 3
 *         ↑   |
 *         └───┘
 *
 * Cycle present:
 * 1 → 2 → 3 → 1
 *
 * Approach:
 * 1. Use DFS.
 * 2. Maintain recursion stack array.
 * 3. If node already in recursion stack → cycle exists.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day73_Cycle_Detection;

import java.util.ArrayList;

public class CycleDetectionDirected {

    static boolean dfs(int node,
            boolean[] visited,
            boolean[] stack,
            ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;
        stack[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(neighbor, visited, stack, graph))
                    return true;
            }

            else if (stack[neighbor])
                return true;
        }

        stack[node] = false;

        return false;
    }

    public static void main(String[] args) {

        int n = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 1 }
        };

        for (int[] e : edges)
            graph.get(e[0]).add(e[1]);

        boolean[] visited = new boolean[n];
        boolean[] stack = new boolean[n];

        boolean hasCycle = false;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                if (dfs(i, visited, stack, graph)) {

                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println(hasCycle);
    }
}