package Java_8_Features_Demo.src;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {

    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda expressions provide a short way to write behavior.
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("15 + 5 = " + addition.operate(15, 5));
        System.out.println("15 * 5 = " + multiplication.operate(15, 5));
        System.out.println();

        // Lambdas are often used with collections.
        List<String> names = Arrays.asList("Akash", "Nimal", "Saman", "Kamal");
        names.forEach(name -> System.out.println("Name: " + name));
    }
}
