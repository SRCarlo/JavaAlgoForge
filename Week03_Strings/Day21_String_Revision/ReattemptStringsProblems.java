/**
 * ============================================================
 * Day 21 | Overall String Revision (Day 15 → Day 20)
 *
 * TOP 5 MOST IMPORTANT STRING QUESTIONS
 * 
 * Covered Concepts:
 * - Two Pointers
 * - Frequency Counting
 * - Sliding Window
 * - Stack
 * - String Optimization
 *
 * ============================================================
 */

package Week01_Basics_Logic.Week03_Strings.Day21_String_Revision;

public class ReattemptStringsProblems {

    public static void main(String[] args) {

        // Q1: Reverse String
        System.out.println("Reverse String : " + reverseString("hello"));

        // Q2 : Chack Palindrome
        System.out.println("Is Palindrome : " + isPalindrome("A man, a plan, a canal : panama"));

        // Q3 : First Non- Repeating Character
        System.out.println("First Non-Repeating Character : " + firstNonRepeatingChar("aabbcdde"));

        // Q4 : Longest SubString Without Repeating Charcaters
        System.out.println("Longest SubString Length : " + longestSubstringWithoutRepeat("abcabcbb"));

        // Q5 : Valid Parenthesis
        System.out.println("Valid Parenthesis : " + isValidParentheses("({[]})"));

    }

    /**
     * ============================================================
     * Q1. Reverse a String
     * ------------------------------------------------------------
     * Input : "hello"
     * Output : "olleh"
     *
     * Logic:
     * - Convert string to char array
     * - Use two pointers (start & end)
     * - Swap characters until they meet
     *
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     *
     * Interview Importance: ⭐⭐⭐⭐⭐
     * ============================================================
     */

    static String reverseString(String s) {

        char[] arr = s.toCharArray(); // convert string to array
        int left = 0; // start pointer
        int right = arr.length - 1; // end pointer

        while (left < right) {
            char temp = arr[left]; // swap characters
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr); // convert array back to string
    }

    /**
     * ============================================================
     * Q2. Valid Palindrome
     * ------------------------------------------------------------
     * Input : "A man, a plan, a canal: Panama"
     * Output : true
     *
     * Logic:
     * - Use two pointers
     * - Ignore special characters & spaces
     * - Compare characters after converting to lowercase
     *
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     *
     * Interview Importance: ⭐⭐⭐⭐⭐
     * ============================================================
     */

    static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-letter and non-digit characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            // Compare characters
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    /**
     * ============================================================
     * Q3. First Non-Repeating Character
     * ------------------------------------------------------------
     * Input : "aabbcdde"
     * Output : c
     *
     * Logic:
     * - Count frequency of characters
     * - Traverse string again
     * - First char with frequency 1 is answer
     *
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     *
     * Interview Importance: ⭐⭐⭐⭐
     * ============================================================
     */

    static char firstNonRepeatingChar(String s) {

        int[] freq = new int[256]; // frequency array

        // Count each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Find first character with frequency 1
        for (char ch : s.toCharArray()) {
            if (freq[ch] == 1)
                return ch;
        }

        return '#'; // if no unique character found
    }

    /**
     * ============================================================
     * Q4. Longest Substring Without Repeating Characters
     * ------------------------------------------------------------
     * Input : "abcabcbb"
     * Output : 3 ("abc")
     *
     * Logic:
     * - Sliding Window technique
     * - Use two pointers (left & right)
     * - Shrink window when duplicate found
     *
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     *
     * Interview Importance: ⭐⭐⭐⭐⭐ (VERY IMPORTANT)
     * ============================================================
     */

    static int longestSubstringWithoutRepeat(String s) {

        int[] visited = new int[256]; // tracks characters
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // If character already exists, shrink window
            while (visited[s.charAt(right)] == 1) {
                visited[s.charAt(left)] = 0;
                left++;
            }

            visited[s.charAt(right)] = 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /**
     * ============================================================
     * Q5. Valid Parentheses
     * ------------------------------------------------------------
     * Input : "({[]})"
     * Output : true
     *
     * Logic:
     * - Use stack (implemented using char array)
     * - Push opening brackets
     * - Match with closing brackets
     *
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     *
     * Interview Importance: ⭐⭐⭐⭐⭐
     * ============================================================
     */

    static boolean isValidParentheses(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else {
                // No opening bracket to match
                if (top == -1)
                    return false;

                char open = stack[top--];

                // Check matching pair
                if ((ch == ')' && open != '(') ||
                        (ch == '}' && open != '{') ||
                        (ch == ']' && open != '['))
                    return false;
            }
        }
        return top == -1; // stack must be empty
    }

}
