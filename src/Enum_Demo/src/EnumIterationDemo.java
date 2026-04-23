package Enum_Demo.src;

// Enum for representing simple subjects.
enum Subject {
    JAVA, DATABASE, NETWORKING, OOP
}

public class EnumIterationDemo {

    public static void main(String[] args) {
        // values() returns all enum constants.
        for (Subject subject : Subject.values()) {
            System.out.println("Subject: " + subject);
        }
    }
}
