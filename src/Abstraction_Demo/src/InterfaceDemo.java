package Abstraction_Demo.src;

// Interface defines a contract for classes.
interface Payment {
    // Interface methods are public and abstract by default.
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    // Class provides the required implementation.
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using a credit card.");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        // Use interface reference for abstraction.
        Payment payment = new CreditCardPayment();

        // Call the implemented method through the interface type.
        payment.pay(2500.00);
    }
}
