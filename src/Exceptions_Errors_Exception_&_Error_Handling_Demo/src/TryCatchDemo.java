package Exceptions_Errors_Exception_

public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This line throws ArithmeticException.
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Catch block handles the exception and prevents program crash.
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
