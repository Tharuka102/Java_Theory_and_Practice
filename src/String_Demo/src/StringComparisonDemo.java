package String_Demo.src;

public class StringComparisonDemo {

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        // == compares object references.
        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));

        // equals compares actual content.
        System.out.println("a.equals(c) : " + a.equals(c));

        // equalsIgnoreCase ignores case differences.
        System.out.println("a.equalsIgnoreCase(\"java\") : " + a.equalsIgnoreCase("java"));
    }
}
