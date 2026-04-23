package Encapsulation_Demo.src;

class BankAccount {
    // Private field protects the balance from direct modification.
    private double balance;

    // Getter method allows safe reading of balance.
    public double getBalance() {
        return balance;
    }

    // Deposit method validates the amount before updating balance.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method validates balance and amount.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal request.");
        }
    }
}

public class ValidationEncapsulationDemo {

    public static void main(String[] args) {
        // Create account object.
        BankAccount account = new BankAccount();

        // Perform valid and invalid operations.
        account.deposit(5000);
        account.withdraw(1500);
        account.withdraw(10000);

        // Show final balance using the getter.
        System.out.println("Current Balance: " + account.getBalance());
    }
}
