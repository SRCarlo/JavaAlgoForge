/*
 * Problem Name: Course Schedule (Detect if courses can be finished)
 *
 * input:
 * numCourses = 4
 * prerequisites = [[1,0],[2,1],[3,2]]
 *
 * output:
 * true
 *
 * Example:
 *
 * 0 → 1 → 2 → 3
 *
 * Valid order:
 * 0 → 1 → 2 → 3
 *
 * No cycle → possible to complete courses
 *
 * If cycle present:
 *
 * 0 → 1 → 2 → 0
 *
 * Not possible
 *
 * Approach:
 * 1. Convert to directed graph.
 * 2. Use Topological Sort (Kahn's Algorithm).
 * 3. If all nodes processed → possible.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

package Week01_Basics_Logic.Week11_Graphs.Day77_Graph_Revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {

    public static void main(String[] args) {

        int numCourses = 4;

        int[][] prerequisites = {
                { 1, 0 },
                { 2, 1 },
                { 3, 2 }
        };

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {

            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++)
            if (indegree[i] == 0)
                queue.add(i);

        int count = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            count++;

            for (int neighbor : graph.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0)
                    queue.add(neighbor);
            }
        }

        System.out.println(count == numCourses);
    }
}
