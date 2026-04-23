package Inheritance_Demo.src;

public class ThisAndThisConstructorDemo {

    static class Student {
        private String name;
        private int age;
        private String course;

        // This constructor calls another constructor in the same class using this().
        public Student() {
            this("Unknown", 0, "Not Assigned");
        }

        // This constructor initializes all fields.
        public Student(String name, int age, String course) {
            // this refers to the current object's fields.
            this.name = name;
            this.age = age;
            this.course = course;
        }

        public void showDetails() {
            System.out.println("Name   : " + this.name);
            System.out.println("Age    : " + this.age);
            System.out.println("Course : " + this.course);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Default object uses constructor chaining.
        Student student1 = new Student();

        // Custom object uses direct values.
        Student student2 = new Student("Akash", 22, "Java");

        student1.showDetails();
        student2.showDetails();
    }
}
