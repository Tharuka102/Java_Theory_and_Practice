package Objects_Classes_Variables_Demo.src;

class StudentInfo {
    String name; // Instance variable
    int age;     // Instance variable

    void display() {
        System.out.println("Name = " + name + ", Age = " + age);
    }
}

public class InstanceVariableDemo {

    public static void main(String[] args) {
        // Each object gets its own copy of instance variables.
        StudentInfo s1 = new StudentInfo();
        s1.name = "Nimal";
        s1.age = 20;

        StudentInfo s2 = new StudentInfo();
        s2.name = "Kamal";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}
