package Java_8_Features_Demo.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 3, 18);

        // filter keeps only matching values.
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        // map transforms each value.
        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        // reduce combines values into one result.
        int total = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Original values : " + numbers);
        System.out.println("Even values     : " + evenNumbers);
        System.out.println("Doubled values  : " + doubledNumbers);
        System.out.println("Total sum       : " + total);
    }
}
