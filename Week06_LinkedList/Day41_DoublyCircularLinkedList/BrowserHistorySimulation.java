/**
 * Question: Browser History Simulation (Real Use of Doubly Linked List)
 *
 * Example:
 * visit google.com
 * visit youtube.com
 * back → google.com
 *
 * Algo:
 * - Use two stacks:
 *   backStack
 *   forwardStack
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week06_LinkedList.Day41_DoublyCircularLinkedList;

import java.util.Stack;

public class BrowserHistorySimulation {
    public static void main(String[] args) {

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        String current = "home.com";

        // Visit new pages
        current = visit(current, backStack, forwardStack, "google.com");
        current = visit(current, backStack, forwardStack, "youtube.com");

        // Back
        current = back(current, backStack, forwardStack);

        System.out.println("Current Page: " + current);
    }

    static String visit(String current, Stack<String> back, Stack<String> forward, String newPage) {

        back.push(current);
        forward.clear(); // forward history reset
        return newPage;
    }

    static String back(String current, Stack<String> back, Stack<String> forward) {

        if (back.isEmpty())
            return current;

        forward.push(current);
        return back.pop();
    }
}
