package Java_Design_Patterns_Demo.src;

interface PaymentStrategy {
    void pay(int amount);
}

class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using card");
    }
}

class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using cash");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class StrategyPatternDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Switch behavior at runtime.
        cart.setPaymentStrategy(new CardPayment());
        cart.checkout(5000);

        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(2500);
    }
}
