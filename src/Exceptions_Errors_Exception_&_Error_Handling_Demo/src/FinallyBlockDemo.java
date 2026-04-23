package Exceptions_Errors_Exception_

public class FinallyBlockDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int number = 20 / 2;
            System.out.println("Result = " + number);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Finally block runs whether exception happens or not.
            System.out.println("Finally block always executes");
        }
    }
}
