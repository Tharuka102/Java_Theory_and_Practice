package Java_Interview_Coding_Tests_Demo.src;

public class FactorialAndFibonacciDemo {

    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        // Calculate factorial using a loop.
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series: " + first + " " + second);

        // Print the next Fibonacci numbers.
        for (int i = 3; i <= 8; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
