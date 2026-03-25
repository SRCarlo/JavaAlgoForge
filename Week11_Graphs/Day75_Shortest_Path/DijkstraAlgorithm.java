/**\
 * Problem Name: Dijkstra Algorithm (Shortest Path in Weighted Graph)
 *
 * input:
 * Nodes = 5
 * Edges =
 * [
 *  [0,1,4],
 *  [0,2,1],
 *  [2,1,2],
 *  [1,3,1],
 *  [2,3,5],
 *  [3,4,3]
 * ]
 *
 * Source = 0
 *
 * output:
 * Shortest distance from 0:
 * [0,3,1,4,7]
 *
 * Example:
 *
 * Graph:
 *
 * 0 --4--> 1 --1--> 3 --3--> 4
 *  \       ↑
 *   1      2
 *    \    /
 *      → 2
 *
 * Shortest paths:
 *
 * 0 → 2 = 1
 * 0 → 2 → 1 = 3
 * 0 → 2 → 1 → 3 = 4
 * 0 → 2 → 1 → 3 → 4 = 7
 *
 * Approach:
 * 1. Use PriorityQueue (Min Heap).
 * 2. Always pick node with minimum distance.
 * 3. Relax edges (update distance).
 *
 * Time Complexity: O(E log V)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day75_Shortest_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    static class Pair {

        int node, dist;

        Pair(int node, int dist) {

            this.node = node;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        int[][] edges = {
                { 0, 1, 4 },
                { 0, 2, 1 },
                { 2, 1, 2 },
                { 1, 3, 1 },
                { 2, 3, 5 },
                { 3, 4, 3 }
        };

        for (int[] e : edges) {

            graph.get(e[0]).add(new Pair(e[1], e[2]));
            graph.get(e[1]).add(new Pair(e[0], e[2]));
        }

        int source = 0;

        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        dist[source] = 0;

        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {

            Pair p = pq.poll();

            for (Pair neighbor : graph.get(p.node)) {

                if (dist[p.node] + neighbor.dist < dist[neighbor.node]) {

                    dist[neighbor.node] = dist[p.node] + neighbor.dist;

                    pq.add(new Pair(neighbor.node,
                            dist[neighbor.node]));
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
