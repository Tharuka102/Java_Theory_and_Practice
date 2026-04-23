package Java_8_Features_Demo.src;

interface Vehicle {
    // Default method introduced in Java 8
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    // Static method inside interface introduced in Java 8
    static void serviceInfo() {
        System.out.println("Service interval: every 5000 km");
    }
}

public class DefaultStaticMethodsDemo implements Vehicle {

    public static void main(String[] args) {
        DefaultStaticMethodsDemo demo = new DefaultStaticMethodsDemo();
        demo.start();
        Vehicle.serviceInfo();
    }
}
