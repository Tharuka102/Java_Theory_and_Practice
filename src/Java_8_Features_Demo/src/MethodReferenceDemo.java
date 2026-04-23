package Java_8_Features_Demo.src;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> topics = Arrays.asList("Lambda", "Streams", "Optional", "Date API");

        // Method reference is a cleaner shorthand for an existing method.
        topics.forEach(System.out::println);
    }
}
