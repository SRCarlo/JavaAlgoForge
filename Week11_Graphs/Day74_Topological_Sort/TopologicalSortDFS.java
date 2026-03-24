/*F
 * Problem Name: Topological Sort using DFS
 *
 * input:
 * Nodes = 6
 * Edges = [[5,2], [5,0], [4,0], [4,1], [2,3], [3,1]]
 *
 * output:
 * 5 4 2 3 1 0
 *
 * Example:
 *
 * Directed Graph (DAG):
 *
 * 5 → 2 → 3 → 1
 * ↓
 * 0
 *
 * 4 → 0
 * 4 → 1
 *
 * Topological Order:
 * A node appears before its dependencies.
 *
 * Approach:
 * 1. Use DFS traversal.
 * 2. After visiting all neighbors push node into stack.
 * 3. Pop stack to get topological order.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day74_Topological_Sort;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDFS {

    static void dfs(int node,
            boolean[] visited,
            Stack<Integer> stack,
            ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor])
                dfs(neighbor, visited, stack, graph);
        }

        stack.push(node);
    }

    public static void main(String[] args) {

        int n = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 5, 2 }, { 5, 0 }, { 4, 0 }, { 4, 1 }, { 2, 3 }, { 3, 1 }
        };

        for (int[] e : edges)
            graph.get(e[0]).add(e[1]);

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)
            if (!visited[i])
                dfs(i, visited, stack, graph);

        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
