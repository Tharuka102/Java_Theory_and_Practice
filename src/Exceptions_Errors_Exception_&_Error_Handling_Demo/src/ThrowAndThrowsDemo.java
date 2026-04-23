package Exceptions_Errors_Exception_

public class ThrowAndThrowsDemo {

    public static void validateAge(int age) throws IllegalAccessException {
        if (age < 18) {
            // throw is used to create and send an exception manually.
            throw new IllegalAccessException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IllegalAccessException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
