package Java_8

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 3, 18);

        // Stream API allows filtering, mapping, and processing data in a clean style.
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> doubledValues = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Even numbers    : " + evenNumbers);
        System.out.println("Doubled values  : " + doubledValues);
        System.out.println("Sum of numbers  : " + sum);
    }
}
