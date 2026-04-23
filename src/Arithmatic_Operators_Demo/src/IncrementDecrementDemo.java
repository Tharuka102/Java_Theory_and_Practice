package Arithmatic_Operators_Demo.src;

public class IncrementDecrementDemo {

    public static void main(String[] args) {
        int number = 5;

        // Post-increment: use first, then increase
        System.out.println("Initial number = " + number);
        System.out.println("Post-increment (number++) returns = " + (number++));
        System.out.println("Value after post-increment = " + number);
        System.out.println();

        // Pre-increment: increase first, then use
        System.out.println("Pre-increment (++number) returns = " + (++number));
        System.out.println("Value after pre-increment = " + number);
        System.out.println();

        // Post-decrement: use first, then decrease
        System.out.println("Post-decrement (number--) returns = " + (number--));
        System.out.println("Value after post-decrement = " + number);
        System.out.println();

        // Pre-decrement: decrease first, then use
        System.out.println("Pre-decrement (--number) returns = " + (--number));
        System.out.println("Value after pre-decrement = " + number);
    }
}
