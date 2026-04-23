package Java_8_Features_Demo.src;

public class FunctionalInterfaceDemo {

    @FunctionalInterface
    interface GreetingService {
        void greet(String name);

        // A functional interface can still have default methods.
        default void greetPolitely(String name) {
            System.out.println("Welcome, " + name);
        }

        static void info() {
            System.out.println("GreetingService is a functional interface.");
        }
    }

    public static void main(String[] args) {
        GreetingService greetingService = name -> System.out.println("Hello, " + name);

        greetingService.greet("Akash");
        greetingService.greetPolitely("Akash");
        GreetingService.info();
    }
}
