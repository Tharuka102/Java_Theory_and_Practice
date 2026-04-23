package Java_Interview_Coding_Tests_Demo.src;

public class PalindromeCheckDemo {

    public static void main(String[] args) {
        String word = "level";
        String reversed = "";

        // Reverse the word to compare it with the original value.
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
