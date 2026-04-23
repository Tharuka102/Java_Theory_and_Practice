package Types_Of_Interfaces_Demo.src;

@FunctionalInterface
interface Greeting {
    void sayHello(); // Only one abstract method is allowed.
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        // Lambda expression is used because this is a functional interface.
        Greeting greeting = () -> System.out.println("Hello from lambda expression");
        greeting.sayHello();
    }
}
