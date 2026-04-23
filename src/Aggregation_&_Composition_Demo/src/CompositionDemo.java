package Aggregation_

class Engine {
    // This variable stores the engine type.
    private String engineType;

    // Constructor creates an engine with a given type.
    public Engine(String engineType) {
        this.engineType = engineType;
    }

    // This method represents starting the engine.
    public void startEngine() {
        System.out.println(engineType + " engine is starting...");
    }
}

class Car {
    // This variable stores the car model.
    private String model;

    // Car is composed of an Engine object.
    private Engine engine;

    // The engine is created as part of the car.
    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    // This method uses the engine internally.
    public void startCar() {
        System.out.println("Car model: " + model);
        engine.startEngine();
        System.out.println("Car started successfully.");
    }
}

public class CompositionDemo {

    public static void main(String[] args) {
        // Creating a car automatically creates its engine part.
        Car car = new Car("Toyota Corolla", "Petrol");

        // Start the car and its engine.
        car.startCar();

        // This shows composition because the engine belongs strongly to the car.
    }
}
