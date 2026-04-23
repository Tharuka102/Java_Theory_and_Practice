package String_Demo.src;

public class StringMethodsDemo {

    public static void main(String[] args) {
        String text = "  Java Programming  ";

        // trim removes leading and trailing spaces.
        System.out.println("Trimmed: '" + text.trim() + "'");

        // toUpperCase converts all letters to uppercase.
        System.out.println("Uppercase: " + text.toUpperCase());

        // toLowerCase converts all letters to lowercase.
        System.out.println("Lowercase: " + text.toLowerCase());

        // substring extracts part of the string.
        System.out.println("Substring: " + text.substring(2, 6));

        // replace changes matching text.
        System.out.println("Replace: " + text.replace("Java", "Python"));

        // contains checks whether a word exists.
        System.out.println("Contains 'Program': " + text.contains("Program"));
    }
}
