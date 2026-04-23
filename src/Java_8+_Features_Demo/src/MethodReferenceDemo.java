package Java_8

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Java", "OOP", "Streams", "Optional");

        // Method reference is a shorter form of a lambda when an existing method can be reused.
        subjects.forEach(System.out::println);
    }
}
