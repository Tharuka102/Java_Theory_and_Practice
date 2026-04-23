package Dependency_Injection_Demo.src;

// Simple interface for payment processing behavior.
interface PaymentGateway {
    void pay(double amount);
}

// Concrete implementation for card payments.
class CardPaymentGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using card payment gateway.");
    }
}

// Consumer class receives dependency later through a setter.
class CheckoutService {
    private PaymentGateway paymentGateway;

    // Setter injection method.
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        if (paymentGateway != null) {
            paymentGateway.pay(amount);
        } else {
            System.out.println("Payment gateway is not configured.");
        }
    }
}

public class SetterInjectionDemo {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        // Inject dependency after object creation.
        checkoutService.setPaymentGateway(new CardPaymentGateway());

        // Process the payment.
        checkoutService.checkout(4500.00);
    }
}
