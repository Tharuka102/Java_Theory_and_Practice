package Inheritance_Demo.src;

public class ObjectTypeCastingDemo {

    static class Vehicle {
        public void start() {
            System.out.println("Vehicle is starting.");
        }
    }

    static class Car extends Vehicle {
        public void openBoot() {
            System.out.println("Car boot is now open.");
        }
    }

    public static void main(String[] args) {
        // Upcasting: child object is stored in a parent reference.
        Vehicle vehicle = new Car();
        vehicle.start();

        // Downcasting: convert parent reference back to child type safely.
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.openBoot();
        }
    }
}
