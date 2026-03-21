/*
 * Problem Name: Graph Representation using Adjacency List
 *
 * input:
 * Nodes = 5
 * Edges = [[0,1], [0,2], [1,3], [2,4]]
 *
 * output:
 * 0 → [1,2]
 * 1 → [0,3]
 * 2 → [0,4]
 * 3 → [1]
 * 4 → [2]
 *
 * Example:
 *
 * Graph:
 * 0 — 1
 * |   |
 * 2   3
 * |
 * 4
 *
 * Approach:
 * 1. Create ArrayList of size n.
 * 2. For each edge (u,v):
 *      add v to u
 *      add u to v (undirected graph)
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

package Week01_Basics_Logic.Week11_Graphs.Day71_Graph_Basics;

import java.util.ArrayList;

public class GraphRepresentation {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 }
        };

        for (int[] e : edges) {
            int u = e[0], v = e[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < n; i++)
            System.out.println(i + " --> " + graph.get(i));
    }
}
