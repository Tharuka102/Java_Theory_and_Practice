package Method_

class StudentProfile {
    private String name;
    private int age;
    private String course;

    // Default constructor.
    public StudentProfile() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not Assigned";
    }

    // Constructor with one parameter.
    public StudentProfile(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not Assigned";
    }

    // Constructor with all parameters.
    public StudentProfile(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void showDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println();
    }
}

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {
        // Creating objects using different constructors.
        StudentProfile student1 = new StudentProfile();
        StudentProfile student2 = new StudentProfile("Akash");
        StudentProfile student3 = new StudentProfile("Saman", 23, "Java Programming");

        student1.showDetails();
        student2.showDetails();
        student3.showDetails();
    }
}
