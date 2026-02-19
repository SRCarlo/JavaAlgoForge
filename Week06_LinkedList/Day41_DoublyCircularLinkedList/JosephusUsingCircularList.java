/**
 * Question: Josephus Problem Using Circular Linked List
 *
 * Example:
 * n = 5 people, k = 2
 *
 * Output: Survivor = 3
 *
 * Algo:
 * - Create circular list of n people
 * - Remove every k-th person
 * - Last remaining is answer
 *
 * Time Complexity: O(n*k)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day41_DoublyCircularLinkedList;

import java.util.ArrayList;
import java.util.List;

public class JosephusUsingCircularList {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        System.out.println("Serviour : " + josephus(n, k));
    }

    static int josephus(int n, int k) {
        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;

        while (people.size() > 1) {

            index = (index + k - 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }
}
