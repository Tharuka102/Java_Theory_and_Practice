package Objects_Classes_Variables_Demo.src;

class Car {
    String brand; // Instance variable belongs to each object.
    int speed;    // Each car object keeps its own speed value.

    void showDetails() {
        System.out.println("Brand = " + brand + ", Speed = " + speed);
    }
}

public class ClassAndObjectDemo {

    public static void main(String[] args) {
        // Create the first object of the Car class.
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 120;

        // Create another object of the same class.
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.speed = 140;

        car1.showDetails();
        car2.showDetails();
    }
}
