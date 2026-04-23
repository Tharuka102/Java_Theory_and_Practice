package String_Demo.src;

public class StringConcatenationPerformanceDemo {

    public static void main(String[] args) {
        // Repeated String concatenation creates many new objects.
        String text = "";
        for (int i = 1; i <= 3; i++) {
            text = text + i;
        }
        System.out.println("Using String       : " + text);

        // StringBuilder handles repeated changes more efficiently.
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            builder.append(i);
        }
        System.out.println("Using StringBuilder: " + builder);
    }
}
