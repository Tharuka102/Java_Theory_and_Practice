package Java_8

public class FunctionalInterfaceDemo {

    @FunctionalInterface
    interface GreetingService {
        void greet(String name);

        // Functional interfaces can still contain default methods.
        default void sayGoodbye(String name) {
            System.out.println("Goodbye, " + name);
        }
    }

    public static void main(String[] args) {
        // A functional interface has exactly one abstract method.
        GreetingService service = name -> System.out.println("Hello, " + name);

        service.greet("Akash");
        service.sayGoodbye("Akash");
    }
}
