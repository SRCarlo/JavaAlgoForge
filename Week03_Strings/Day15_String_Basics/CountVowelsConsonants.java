/**
 * Question: Count vowels and consonants in a string
 *
 * Example:
 * Input  : "Java"
 * Output : Vowels = 2, Consonants = 2
 *
 * Logic:
 * - Convert string to lowercase
 * - Check each character
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week03_Strings.Day15_String_Basics;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        String str = "Java";
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check only alphabets
            if(ch>='a'&& ch <='z'){
                // Check Vowels
                if(ch =='a' || ch=='e' || ch == 'i' || ch == 'o' || ch =='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels Count is : " + vowels);
        System.out.println("Consonants Count is : " + consonants) ;
    }
}
