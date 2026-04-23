package Abstraction_Demo.src;

// Abstract class for a general vehicle concept.
abstract class Vehicle {
    // Abstract method hides the exact implementation details.
    abstract void start();

    // Concrete method is shared by all vehicles.
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class Car extends Vehicle {
    // Car gives its own specific implementation.
    @Override
    void start() {
        System.out.println("Car starts with a key or button.");
    }
}

class Bike extends Vehicle {
    // Bike gives its own specific implementation.
    @Override
    void start() {
        System.out.println("Bike starts with a self-start or kick.");
    }
}

public class RealWorldAbstractionDemo {

    public static void main(String[] args) {
        // Abstract reference can point to different specific vehicles.
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        System.out.println();

        bike.start();
        bike.stop();
    }
}
