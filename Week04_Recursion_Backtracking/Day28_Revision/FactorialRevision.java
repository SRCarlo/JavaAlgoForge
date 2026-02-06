/*
 Que:
 Find factorial of a number using recursion.

 Example:
 Input  : n = 5
 Output : 120

 Algo (Simple Steps):
 1. If n == 0 or n == 1 → return 1
 2. Else return n * factorial(n-1)

 Explanation:
 Factorial means:
 5! = 5×4×3×2×1

 Dry Run:
 fact(5) = 5 * fact(4)
 fact(4) = 4 * fact(3)
 ...
 fact(1) = 1

 Time Complexity: O(n)
 Space Complexity: O(n)
*/

package Week01_Basics_Logic.Week04_Recursion_Backtracking.Day28_Revision;

public class FactorialRevision {
    static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1)
            return 1;

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial is : " + factorial(5));
    }

}
