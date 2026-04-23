package Enum_Demo.src;

// Enum defines a fixed set of constants.
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class BasicEnumDemo {

    public static void main(String[] args) {
        // Assigning one enum constant to a variable.
        Day today = Day.FRIDAY;

        // Printing the enum value.
        System.out.println("Today is: " + today);

        // Enum helps avoid invalid values.
    }
}
