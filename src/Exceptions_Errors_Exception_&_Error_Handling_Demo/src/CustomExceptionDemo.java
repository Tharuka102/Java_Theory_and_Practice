package Exceptions_Errors_Exception_

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void withdraw(double amount) throws InvalidAmountException {
        if (amount > 10000) {
            throw new InvalidAmountException("Withdrawal limit exceeded");
        }
        System.out.println("Withdrawal successful: " + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(15000);
        } catch (InvalidAmountException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }
}
