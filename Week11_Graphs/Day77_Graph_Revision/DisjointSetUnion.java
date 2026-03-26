/*
 * Problem Name: Disjoint Set Union (Union Find)
 *
 * input:
 * Nodes = 5
 * Operations:
 * union(0,1)
 * union(1,2)
 * union(3,4)
 *
 * find(2) → same set as 0
 *
 * output:
 * 0 and 2 belong to same set
 *
 * Example:
 *
 * Initially:
 * {0} {1} {2} {3} {4}
 *
 * After union(0,1):
 * {0,1}
 *
 * After union(1,2):
 * {0,1,2}
 *
 * After union(3,4):
 * {3,4}
 *
 * Approach:
 * 1. Each node has a parent.
 * 2. find() → finds root parent.
 * 3. union() → connects two sets.
 * 4. Path compression makes find faster.
 *
 * Time Complexity: Almost O(1)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week11_Graphs.Day77_Graph_Revision;

public class DisjointSetUnion {

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

        int n = 5;

        parent = new int[n];

        for (int i = 0; i < n; i++)
            parent[i] = i;

        union(0, 1);
        union(1, 2);
        union(3, 4);

        if (find(0) == find(2))
            System.out.println("Same Set.");

        else
            System.out.println("Different Set.");
    }
}