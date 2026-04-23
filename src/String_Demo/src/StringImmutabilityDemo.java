package String_Demo.src;

public class StringImmutabilityDemo {

    public static void main(String[] args) {
        // Original string object.
        String text = "Hello";

        // concat does not change the old object; it creates a new one.
        String updatedText = text.concat(" World");

        System.out.println("Original string: " + text);
        System.out.println("Updated string : " + updatedText);

        // This demonstrates string immutability.
    }
}
