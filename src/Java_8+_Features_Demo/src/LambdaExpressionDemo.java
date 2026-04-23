package Java_8

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        // Lambda expressions provide a shorter way to write anonymous functions.
        List<String> names = Arrays.asList("Akash", "Nimal", "Saman", "Kamal");

        System.out.println("Printing names using a lambda expression:");
        names.forEach(name -> System.out.println("Name: " + name));

        System.out.println();

        // Lambda with multiple parameters
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("10 + 5 = " + add.operate(10, 5));
        System.out.println("10 * 5 = " + multiply.operate(10, 5));
    }

    @FunctionalInterface
    interface Calculator {
        int operate(int a, int b);
    }
}
