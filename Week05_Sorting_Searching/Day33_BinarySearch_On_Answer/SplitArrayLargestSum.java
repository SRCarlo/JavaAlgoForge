/*
 Question: Split Array Largest Sum

 Example:
 Input  : nums = [7,2,5,10,8], k = 2
 Output : 18

 Explanation:
 Split into 2 parts:
 [7,2,5] sum=14
 [10,8] sum=18
 Largest sum = 18 (minimum possible)

 Algo:
 - Same as Allocate Pages
 - Binary Search on max subarray sum

 Time Complexity: O(n log(sum))
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day33_BinarySearch_On_Answer;

public class SplitArrayLargestSum {

    public static void main(String[] args) {

        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;

        int low = 0, high = 0;

        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        int answer = high;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canSplit(nums, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum Largest Sum: " + answer);
    }

    static boolean canSplit(int[] nums, int k, int limit) {

        int count = 1;
        int sum = 0;

        for (int n : nums) {

            if (sum + n > limit) {
                count++;
                sum = n;

                if (count > k)
                    return false;
            } else {
                sum += n;
            }
        }

        return true;
    }
}
