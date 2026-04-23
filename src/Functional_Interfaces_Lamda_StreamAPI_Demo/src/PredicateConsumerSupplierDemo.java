package Functional_Interfaces_Lamda_StreamAPI_Demo.src;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerSupplierDemo {

    public static void main(String[] args) {
        // Predicate tests a condition and returns true or false.
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Consumer accepts a value and performs an action.
        Consumer<String> printer = text -> System.out.println("Printed: " + text);

        // Supplier returns a value without taking input.
        Supplier<String> messageSupplier = () -> "Java functional programming";

        System.out.println("Is 8 even? " + isEven.test(8));
        printer.accept("Hello from Consumer");
        System.out.println("Supplier says: " + messageSupplier.get());
    }
}
