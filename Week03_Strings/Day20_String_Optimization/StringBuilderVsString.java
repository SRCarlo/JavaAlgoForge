/**
 * Problem: String vs StringBuilder Performance
 *
 * What is this?
 * - Shows why StringBuilder is faster for modifications
 *
 * Logic:
 * - String creates new object every time
 * - StringBuilder modifies same object
 *
 * Time Complexity:
 * - String       → O(n^2)
 * - StringBuilder→ O(n)
 */

package Week01_Basics_Logic.Week03_Strings.Day20_String_Optimization;

public class StringBuilderVsString {
    public static void main(String[] args) {
        
        // Using String (slow)
        String str = "";
        for (int i = 0; i < 5; i++) {
            str = str + i; // new object created each time
        }
        System.out.println("Using String : " + str);

        // Using StringBuilder(fast)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i); // same object modified
        }
        System.out.println("Using StringBuider : " + sb);

    }

}
