package Enum_Demo.src;

// Enum for traffic light values.
enum TrafficLight {
    RED, YELLOW, GREEN
}

public class EnumInSwitchDemo {

    public static void main(String[] args) {
        // Assign a traffic light value.
        TrafficLight signal = TrafficLight.GREEN;

        // Enum works very well with switch statements.
        switch (signal) {
            case RED:
                System.out.println("Stop the vehicle.");
                break;
            case YELLOW:
                System.out.println("Get ready.");
                break;
            case GREEN:
                System.out.println("Go ahead.");
                break;
        }
    }
}
