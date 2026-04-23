package Functional_Interfaces_Lamda_StreamAPI_Demo.src;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceAndReduceDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Lambda");

        // Method reference is a shorter form of lambda in some cases.
        words.forEach(System.out::println);

        List<Integer> values = Arrays.asList(10, 20, 30, 40);

        // Reduce combines stream elements into one result.
        int total = values.stream().reduce(0, Integer::sum);

        System.out.println("Total = " + total);
    }
}
