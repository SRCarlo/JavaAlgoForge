/*
 Question: Allocate Minimum Pages (Classic Interview Problem)

 Example:
 Input  : books = [12, 34, 67, 90], students = 2
 Output : 113

 Explanation:
 We must divide books into 2 students (continuous allocation)
 Best division:
 Student1 → 12 + 34 + 67 = 113
 Student2 → 90
 Answer = max pages = 113 (minimum possible)

 Algo (Binary Search on Answer):
 - Minimum possible answer = max(book)
 - Maximum possible answer = sum(all books)
 - Binary search this range
 - Check if allocation is possible with mid limit

 Time Complexity: O(n log(sum))
 Space Complexity: O(1)
*/

package Week01_Basics_Logic.Week05_Sorting_Searching.Day33_BinarySearch_On_Answer;

public class AllocateMinimumPages {

    public static void main(String[] args) {

        int[] books = { 12, 34, 67, 90 };
        int students = 2;

        int low = 0, high = 0;

        // FInd Range
        for (int pages : books) {
            low = Math.max(low, pages);
            high = high + pages;
        }

        int answer = high;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isPossible(books, students, mid)) {
                answer = mid;
                high = mid - 1;// Try smaller max
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Minimum Maximum Pages is : " + answer);
    }

    //Helper function to check allocation

    static boolean isPossible(int[] books, int students, int limit) {

        int countStudents = 1;
        int pagesSum = 0;

        for (int pages : books) {

            if (pagesSum + pages > limit) {
                countStudents++;
                pagesSum = pages;

                if (countStudents > students)
                    return false;
            } else {
                pagesSum += pages;
            }
        }

        return true;
    }
}
