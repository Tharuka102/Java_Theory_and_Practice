package Generics_Demo.src;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    // Wildcard allows method to accept a list of any type.
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        List<String> names = Arrays.asList("Nimal", "Kamal", "Sunil");

        printList(numbers);
        printList(names);
    }
}
