package Polymorphism_Demo.src;

interface PaymentMethod {
    // Common behavior contract.
    void pay(double amount);
}

class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using cash.");
    }
}

class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using card.");
    }
}

public class InterfacePolymorphismDemo {

    public static void main(String[] args) {
        // Interface reference supports multiple implementations.
        PaymentMethod method1 = new CashPayment();
        PaymentMethod method2 = new CardPayment();

        method1.pay(1500.00);
        method2.pay(2500.00);
    }
}
