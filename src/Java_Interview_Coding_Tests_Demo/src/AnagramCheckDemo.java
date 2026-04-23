package Java_Interview_Coding_Tests_Demo.src;

import java.util.Arrays;

public class AnagramCheckDemo {

    public static void main(String[] args) {
        String firstWord = "listen";
        String secondWord = "silent";

        // Convert strings to lowercase character arrays and sort them.
        char[] firstArray = firstWord.toLowerCase().toCharArray();
        char[] secondArray = secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println(firstWord + " and " + secondWord + " are anagrams");
        } else {
            System.out.println(firstWord + " and " + secondWord + " are not anagrams");
        }
    }
}
