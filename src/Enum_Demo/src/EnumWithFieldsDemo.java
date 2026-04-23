package Enum_Demo.src;

// Enum can also have fields, constructors, and methods.
enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    // Field stores the priority number.
    private int priority;

    // Enum constructor initializes each constant.
    Level(int priority) {
        this.priority = priority;
    }

    // Getter method returns the priority value.
    public int getPriority() {
        return priority;
    }
}

public class EnumWithFieldsDemo {

    public static void main(String[] args) {
        // Using enum constant with its custom field.
        Level currentLevel = Level.HIGH;

        System.out.println("Level: " + currentLevel);
        System.out.println("Priority: " + currentLevel.getPriority());
    }
}
