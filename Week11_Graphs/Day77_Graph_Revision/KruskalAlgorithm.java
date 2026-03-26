/*
 * Problem Name: Kruskal Algorithm (Minimum Spanning Tree)
 *
 * input:
 * Nodes = 4
 * Edges:
 * [0,1,10]
 * [0,2,6]
 * [0,3,5]
 * [1,3,15]
 * [2,3,4]
 *
 * output:
 * Minimum Cost = 19
 *
 * Example:
 *
 * Sort edges by weight:
 *
 * 2--3 = 4
 * 0--3 = 5
 * 0--2 = 6
 * 0--1 = 10
 * 1--3 = 15
 *
 * Pick smallest edges without forming cycle.
 *
 * MST edges:
 * 2--3 (4)
 * 0--3 (5)
 * 0--1 (10)
 *
 * Total cost = 19
 *
 * Approach:
 * 1. Sort edges by weight.
 * 2. Use DSU to detect cycle.
 * 3. Add edge if no cycle.
 *
 * Time Complexity: O(E log E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day77_Graph_Revision;

import java.util.Arrays;

public class KruskalAlgorithm {

    static class Edge {

        int u, v, w;

        Edge(int u, int v, int w) {

            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    static int[] parent;

    static int find(int x) {

        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {

        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB)
            parent[rootB] = rootA;
    }

    public static void main(String[] args) {

        int n = 4;

        parent = new int[n];

        for (int i = 0; i < n; i++)
            parent[i] = i;

        Edge[] edges = {
                new Edge(0, 1, 10),
                new Edge(0, 2, 6),
                new Edge(0, 3, 5),
                new Edge(1, 3, 15),
                new Edge(2, 3, 4)
        };

        Arrays.sort(edges, (a, b) -> a.w - b.w);

        int cost = 0;

        for (Edge e : edges) {

            if (find(e.u) != find(e.v)) {

                union(e.u, e.v);
                cost += e.w;
            }
        }

        System.out.println("Minimum Cost is : " + cost);
    }
}
