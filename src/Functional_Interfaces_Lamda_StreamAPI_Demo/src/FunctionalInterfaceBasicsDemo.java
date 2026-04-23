package Functional_Interfaces_Lamda_StreamAPI_Demo.src;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b); // Only one abstract method is allowed.
}

public class FunctionalInterfaceBasicsDemo {

    public static void main(String[] args) {
        // Lambda expression provides the implementation of the abstract method.
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition = " + addition.operate(10, 5));
        System.out.println("Multiplication = " + multiplication.operate(10, 5));
    }
}
