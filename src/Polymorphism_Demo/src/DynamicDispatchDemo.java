package Polymorphism_Demo.src;

class Vehicle {
    public void start() {
        System.out.println("Vehicle starts in a general way.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key or button.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self-start or kick.");
    }
}

public class DynamicDispatchDemo {

    public static void main(String[] args) {
        // Parent reference points to different child objects at runtime.
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();

        vehicle = new Bike();
        vehicle.start();
    }
}
