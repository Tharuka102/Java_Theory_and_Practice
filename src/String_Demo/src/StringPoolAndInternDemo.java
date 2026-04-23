package String_Demo.src;

public class StringPoolAndInternDemo {

    public static void main(String[] args) {
        // Both literals point to the same pooled string object.
        String s1 = "Java";
        String s2 = "Java";

        // new creates a separate object in heap memory.
        String s3 = new String("Java");

        System.out.println("s1 == s2 : " + (s1 == s2)); // true because of string pool
        System.out.println("s1 == s3 : " + (s1 == s3)); // false because s3 is a new object

        // intern() returns the pooled reference.
        String s4 = s3.intern();
        System.out.println("s1 == s4 : " + (s1 == s4)); // true
    }
}
