package Encapsulation_Demo.src;

class Student {
    // Private fields hide the internal data from direct outside access.
    private String name;
    private int age;

    // Public setter method controls how the name is assigned.
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method provides controlled access to the name.
    public String getName() {
        return name;
    }

    // Public setter method controls how the age is assigned.
    public void setAge(int age) {
        this.age = age;
    }

    // Public getter method provides controlled access to the age.
    public int getAge() {
        return age;
    }
}

public class BasicEncapsulationDemo {

    public static void main(String[] args) {
        // Create the student object.
        Student student = new Student();

        // Set values using public methods instead of direct field access.
        student.setName("Akash");
        student.setAge(22);

        // Read values using getter methods.
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age : " + student.getAge());
    }
}
