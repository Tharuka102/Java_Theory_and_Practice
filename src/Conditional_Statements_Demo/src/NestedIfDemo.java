package Conditional_Statements_Demo.src;

public class NestedIfDemo {

    public static void main(String[] args) {
        String username = "admin";
        String password = "java123";

        // A nested if is an if statement inside another if statement.
        if (username.equals("admin")) {
            if (password.equals("java123")) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Unknown user.");
        }
    }
}
